/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AgendasModelo;
import Modelo.ConsultoriosModelo;
import Modelo.MedicoModelo;
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
public class MedicoControlador {
    private MedicoModelo medico;
    private ConsultoriosModelo modelo;
    private AgendasModelo agenda;
    Conexion parametros = new Conexion();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public MedicoControlador() {
    }
    
    public MedicoControlador(MedicoModelo medico, ConsultoriosModelo modelo, AgendasModelo agenda) {
        this.medico = medico;
        this.modelo = modelo;
        this.agenda = agenda;
    }
    public MedicoModelo getMedico() {
        return medico;
    }

    public void setMedico(MedicoModelo medico) {
        this.medico = medico;
    }

    public ConsultoriosModelo getModelo() {
        return modelo;
    }

    public void setModelo(ConsultoriosModelo modelo) {
        this.modelo = modelo;
    }

    public AgendasModelo getAgenda() {
        return agenda;
    }

    public void setAgenda(AgendasModelo agenda) {
        this.agenda = agenda;
    }

    
    
     public void insertarMedico(MedicoModelo pa) {
    try {
        String sql = "call sp_CrearMedicoYPersona(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        ejecutar = conectar.prepareStatement(sql);
        ejecutar.setString(1, pa.getCedula());
        ejecutar.setString(2, pa.getNombre());
        ejecutar.setString(3, pa.getApellido());
        ejecutar.setString(4, pa.getCorreoe());
        ejecutar.setInt(5, pa.getCelular());
        ejecutar.setString(6, pa.getTiposangre());
        ejecutar.setString(7, pa.getFechanacimiento());
        ejecutar.setString(8, pa.getDirreccion());
        ejecutar.setString(9, pa.getGenero());
        ejecutar.setString(10, pa.getIdconsultorio());
        ejecutar.setString(11, pa.getIdagendas());
        ejecutar.setString(12, pa.getEspecialidad());
        ejecutar.setString(13, pa.getCargo());
        ejecutar.setString(14, pa.getFechainicio());
        int resultado = ejecutar.executeUpdate();
        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "Médico creado con éxito");
            System.out.println("Médico creado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
            System.out.println("Revise los datos ingresados");
        }
    } catch (SQLException e) {
        System.out.println("Error SQL: " + e.getMessage());
    } finally {
        try {
            if (ejecutar != null) {
                ejecutar.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar  " );
        }
    }
  }
    
        public ArrayList<Object[]> buscarMedico(String cedula) {
            ArrayList<Object[]> listaObject=new ArrayList<>();
        try {
            String sql = "call sp_MostrarInfoMedico('%"+cedula+"%');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            res = ejecutar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[] obpaciente = new Object[19];
                for (int i = 0; i < 19; i++) {
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

    public ArrayList<Object[]> datosMedico() {
        ArrayList<Object[]> listaObject=new ArrayList<>();
        
        try {
            String sql = "call sp_listaMedicos();";
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
            System.out.println("ERROR SQL CARGA MEDICOS");

        }

        return null;
    }
    public void actualizarMedico(MedicoModelo pa) {
        try {
             String sql = "CALL sp_ActualizarMedico(?, ?, ?, ?, ?, ?)";
             PreparedStatement ejecutar = conectar.prepareStatement(sql);
             ejecutar.setString(1, pa.getCedula());
             ejecutar.setString(2, pa.getCorreoe());
             ejecutar.setInt(3, pa.getCelular());
             ejecutar.setString(4, pa.getDirreccion());
             ejecutar.setString(5, pa.getCargo());
             ejecutar.setString(6, pa.getEspecialidad());
    
             int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Medico Actualizado con Éxito");
                System.out.println("MEDICO ACTUALIZADO CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }
    public void eliminarMedico(String cedula) {
        try {
            String sql = "call eliminar_persona_cascada(" + cedula + ");";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Medico Eliminado con éxito");
                System.out.println("MEDICO ELIMINADO CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }
    public int verificarCredencialesMedico(String usuario, String clave){
        int estado=0;
        try {
            CallableStatement ejecutar = conectar.prepareCall("{call sp_InicioSesion('"+usuario+"','"+clave+"',?)}");
            ejecutar.registerOutParameter(1,Types.INTEGER);
            ejecutar.execute();
            estado = ejecutar.getInt(1);
            ejecutar.close();
           return estado;
        } catch (SQLException e) {
            System.out.println("ERROR BDD");
        }
        return estado;
    }
}
