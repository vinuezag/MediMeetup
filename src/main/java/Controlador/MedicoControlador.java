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

    
    
     public void insertarMedico(MedicoModelo pa, ConsultoriosModelo m, AgendasModelo a) {
        try {
            String sql = "call sp_CrearMedicoYPersona('" + pa.getCedula()+ "','" + pa.getNombre()+ "','" 
                    + pa.getApellido()+ "','" + pa.getCorreoe()+ "','"  + pa.getCelular()+ "','" + pa.getTiposangre()
                    + pa.getFechanacimiento()+ "','" + pa.getDirreccion()+ "','" + pa.getGenero()+ pa.getCedula()
                    + "','" + a.getIdagenda()+ "','" +m.getIdconsultorio()+ "','" + pa.getEspecialidad()+"','" + pa.getCargo()
                    + "','" + pa.getFechainicio()+"');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            var resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Medico Creado con Éxito");
                System.out.println("Medico CREADO CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los Datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
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
            String sql = "call sp_ActualizarMedico('" + pa.getCedula()+ "','" + pa.getCorreoe()+ "','" 
                    + pa.getCelular()+ "','" + pa.getDirreccion()+ "','" + pa.getCargo()
                    + pa.getEspecialidad()+ "');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
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
            String sql = "call sp_EliminarMedico(" + cedula + ");";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Medico Eliminado con éxito");
                System.out.println("MEDICO ELIMINADA CON ÉXITO");
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
