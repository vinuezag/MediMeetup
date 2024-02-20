/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AdministradorModelo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author user
 */
public class AdministradorControl {
    private AdministradorModelo admi;
    Conexion parametros = new Conexion();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public AdministradorControl() {
    }

    public AdministradorControl(AdministradorModelo admi) {
        this.admi = admi;
    }

    public void setAdmi(AdministradorModelo admi) {
        this.admi = admi;
    }

    public AdministradorModelo getAdmi() {
        return admi;
    }
     public int verificarCredencialesAdministrador(String usuario, String clave){
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
