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
import java.util.ArrayList;
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
        String sql = "CALL sp_InsertarCitaPaciente(?, ?, ?, ?)";
        ejecutar = conectar.prepareStatement(sql);
        ejecutar.setString(1, pm.getCedula());
        ejecutar.setString(2, mm.getEspecialidad());
        ejecutar.setString(3, cm.getHora());
        ejecutar.setString(4, cm.getDia());
        
        int resultado = ejecutar.executeUpdate();
        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "Cita creada con éxito");
            System.out.println("Cita creada con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear la cita");
            System.out.println("Error al crear la cita");
        }
        ejecutar.close();
    } catch (SQLException e) {
        System.out.println("Error SQL: " + e.getMessage());
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
     public ArrayList<Object[]> datosCita() {
        ArrayList<Object[]> listaObject=new ArrayList<>();
        
        try {
            String sql = "call ssp_MostrarInformacionCitasPacientes();";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            res = ejecutar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[] obpersona = new Object[7];
                for (int i = 1; i < 7; i++) {
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
     public void MostrarCitaMedico(MedicoModelo mm) {
       try {
            String sql = "call sp_MostrarCita('" + mm.getEspecialidad()+"');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Cita si existe");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }
}
