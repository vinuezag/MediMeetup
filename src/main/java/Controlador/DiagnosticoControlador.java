/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.CitasModelo;
import Modelo.DiagnosticoModelo;
import Modelo.MedicoModelo;
import Modelo.PacienteModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DiagnosticoControlador {
    private DiagnosticoModelo diagnostico;
    Conexion parametros = new Conexion();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public DiagnosticoControlador() {
    }

    public DiagnosticoControlador(DiagnosticoModelo diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setDiagnostico(DiagnosticoModelo diagnostico) {
        this.diagnostico = diagnostico;
    }

    public DiagnosticoModelo getDiagnostico() {
        return diagnostico;
    }
    public void IngresarCita(DiagnosticoModelo Dm, PacienteModelo pm) {
        try {
            String sql = "call sp_InsertarCita('" + pm.getCedula()+ "','" + Dm.getDiagnostico()+ "','" 
                    + Dm.getReceta()+ "');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Diagnostico Creado con Éxito");
                System.out.println("Diagnostico Creado CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }
    public void ListarCita(PacienteModelo pm) {
        try {
            String sql = "call sp_InsertarCita('" + pm.getCedula()+ "');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Diagnostico Creado con Éxito");
                System.out.println("Diagnostico Creado CON ÉXITO");
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
