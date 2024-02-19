/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.PacienteModelo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PacienteControlador {
    private PacienteModelo paciente;
    Conexion parametros = new Conexion();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public PacienteControlador() {
    }

    public PacienteControlador(PacienteModelo paciente) {
        this.paciente = paciente;
        
    }

    public PacienteModelo getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteModelo paciente) {
        this.paciente = paciente;
    }
    
    
    
    public void insertarPersona(PacienteModelo pa) {
        try {
            String sql = "call sp_CrearPersonaYPaciente('" + pa.getCedula()+ "','" + pa.getNombre()+ "','" 
                    + pa.getApellido()+ "','" + pa.getCorreoe()+ "','"  + pa.getCelular()+ "','" + pa.getTiposangre()
                    + pa.getFechanacimiento()+ "','" + pa.getDirreccion()+ "','" + pa.getGenero()+ pa.getCedula()
                    + "','" + pa.getAlergias()+ "','" +pa.getMedicamentos()+ "','" + pa.getEnfermedades()+ "');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            var resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Paciente Creado con Éxito");
                System.out.println("PACIENTE CREADO CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los Datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }
    
        public int verificarPaciente(String cedula){
        int estado=0;
        try {
             CallableStatement ejecutar = conectar.prepareCall("{call sp_VerificarPaciente(?, ?)}");
             ejecutar.setString(1, cedula);
             ejecutar.registerOutParameter(2, Types.INTEGER);
             ejecutar.execute();
             estado = ejecutar.getInt(2);
             ejecutar.close();
        return estado;
        } catch (SQLException e) {
            System.out.println("ERROR credenciales");
        }
        return estado;
    }

    public ArrayList<Object[]> datosPaciente() {
        ArrayList<Object[]> listaObject=new ArrayList<>();
        
        try {
            String sql = "call sp_listaPacientes();";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            res = ejecutar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[] obpersona = new Object[5];
                for (int i = 1; i < 5; i++) {
                    obpersona[i] = res.getObject(i+1);
                }
                obpersona[0]=cont;
                listaObject.add(obpersona);
                cont++;
            }
            ejecutar.close();
            return listaObject;

        } catch (SQLException e) {
            System.out.println("ERROR SQL CARGA PERSONAS");

        }

        return null;
    }
    public void actualizarPaciente(PacienteModelo pa) {
        try {
            String sql = "call sp_ActualizarPaciente('" + pa.getCedula()+ "','" + pa.getCelular()+ "','" 
                    + pa.getCorreoe()+ "','" + pa.getDirreccion()+ "','" + pa.getAlergias()
                    + pa.getMedicamentos()+ "','" + pa.getEnfermedades()+ "');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Paciente Actualizado con Éxito");
                System.out.println("PERSONA ACTUALIZADA CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }
    public void eliminarPaciente(int cedula) {
        try {
            String sql = "call sp_EliminarPaciente(" + cedula + ");";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Paciente Eliminado con éxito");
                System.out.println("PERSONA ELIMINADA CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }
}
