/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.PersonaModelo;
import Modelo.UsuarioModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class UsuariosControlador {
    private UsuarioModelo UsuarioModelo;
    Conexion parametros = new Conexion();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;
    
    public UsuariosControlador() {
    }

    public UsuariosControlador(UsuarioModelo UsuarioModelo) {
        this.UsuarioModelo = UsuarioModelo;
    }

    public UsuarioModelo getUsuarioModelo() {
        return UsuarioModelo;
    }

    public void setUsuarioModelo(UsuarioModelo UsuarioModelo) {
        this.UsuarioModelo = UsuarioModelo;
    }
    
    public ArrayList<Object[]> buscarUsuario(String cedula) {
            ArrayList<Object[]> listaObject=new ArrayList<>();
        try {
            String sql = "call sp_sp_MostrarUsuarioClave('%"+cedula+"%');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            res = ejecutar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[] obpaciente = new Object[3];
                for (int i = 0; i < 3; i++) {
                    obpaciente[i] = res.getObject(i+1);
                }
                obpaciente[0]=cont;
                listaObject.add(obpaciente);
                cont++;
            }
            ejecutar.close();
            return listaObject;
           
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
        return null;
    }
    //sp_ActualizarUsuario
    public void insertarPersona(UsuarioModelo p) {
        try {
            String sql = "call sp_ActualizarUsuario('" + p.getUsuario()+ "','" + p.getClave()+ "','" + p.getPregunataseguridad()+ "');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            var resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Persona Creada con Éxito");
                System.out.println("PERSONA CREADA CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los Datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }
}
