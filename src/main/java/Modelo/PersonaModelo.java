/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author user
 */
public class PersonaModelo {
    private String nombre;
    private String cedula;
    private String apellido;
    private String  correoe;
    private int celular;
    private String tiposangre;
    private String fechanacimiento;
    private String dirreccion;
    private String genero;

    public PersonaModelo() {
    }

    public PersonaModelo(String nombre, String cedula, String apellido, String correoe, int celular, String tiposangre, String fechanacimiento, String dirreccion, String genero) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
        this.correoe = correoe;
        this.celular = celular;
        this.tiposangre = tiposangre;
        this.fechanacimiento = fechanacimiento;
        this.dirreccion = dirreccion;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoe() {
        return correoe;
    }

    public void setCorreoe(String correoe) {
        this.correoe = correoe;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getTiposangre() {
        return tiposangre;
    }

    public void setTiposangre(String tiposangre) {
        this.tiposangre = tiposangre;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
