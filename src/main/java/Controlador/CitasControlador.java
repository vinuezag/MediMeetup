/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.CitasModelo;
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
public class CitasControlador {
    private CitasModelo citas;
    Conexion parametros = new Conexion();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public CitasControlador() {
    }

    public CitasControlador(CitasModelo citas) {
        this.citas = citas;
    }

    public CitasModelo getCitas() {
        return citas;
    }

    public void setCitas(CitasModelo citas) {
        this.citas = citas;
    }
    //idcita int AI PK 
//idpaciente int 
//idestado int 
//idmedico int 
     public void IngresarCita(CitasModelo cm,PacienteModelo pm,MedicoModelo mm) {
        try {
            String sql = "call sp_InsertarCita('" + pm.getCedula()+ "','" + mm.getCedula()+ "','" 
                    + cm.getHora()+ "','" + cm.getDia()+ "');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Cita Creada con Éxito");
                System.out.println("Cita Creada CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }
     public void IngresarCitaCancelada(CitasModelo cm,PacienteModelo pm,MedicoModelo mm) {
        try {
            String sql = "call sp_CambiarEstadoCitaCancelada('" + pm.getCedula()+"');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Cita Cancelada con Éxito");
                System.out.println("Cita Cancelada CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }
     public void IngresarCitaReprogramada(CitasModelo cm,PacienteModelo pm,MedicoModelo mm) {
       try {
            String sql = "call sp_CambiarEstadoCitaReprogramada('" + pm.getCedula()+"');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Cita Modificada con Éxito");
                System.out.println("Cita Modificada CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }
     public void IngresarCitaEjecutada(CitasModelo cm,PacienteModelo pm,MedicoModelo mm) {
       try {
            String sql = "call sp_CambiarEstadoCitaEjecutada('" + pm.getCedula()+"');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Cita Modificada con Éxito");
                System.out.println("Cita Modificada CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }
     public void IngresarCitaNoAsistio(CitasModelo cm,PacienteModelo pm,MedicoModelo mm) {
       try {
            String sql = "call sp_CambiarEstadoCitaNoAsistio('" + pm.getCedula()+"');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Cita Modificada con Éxito");
                System.out.println("Cita Modificada CON ÉXITO");
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
