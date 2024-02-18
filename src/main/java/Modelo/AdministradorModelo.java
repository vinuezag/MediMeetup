/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author user
 */
public class AdministradorModelo extends PersonaModelo{
     private int idadministrador; 

    public AdministradorModelo() {
    }

    public AdministradorModelo(int idadministrador) {
        this.idadministrador = idadministrador;
    }

    public AdministradorModelo(int idadministrador, String nombre, int cedula, String apellido, String correoe, int celular, String tiposangre, String fechanacimiento, String dirreccion, String genero) {
        super(nombre, cedula, apellido, correoe, celular, tiposangre, fechanacimiento, dirreccion, genero);
        this.idadministrador = idadministrador;
    }

    public int getIdadministrador() {
        return idadministrador;
    }

    public void setIdadministrador(int idadministrador) {
        this.idadministrador = idadministrador;
    }
     
     
}
