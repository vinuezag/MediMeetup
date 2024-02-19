/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AdministradorModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
    
}
