/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author user
 */
public class AgendasModelo extends MedicoModelo{
    private int idagenda;
    private String lunes;
    private String martes;
    private String miercoles;
    private String jueves;
    private String viernes;

    public AgendasModelo() {
    }

    public AgendasModelo(int idagenda, String lunes, String martes, String miercoles, String jueves, String viernes) {
        this.idagenda = idagenda;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
    }

    public AgendasModelo(int idagenda, String lunes, String martes, String miercoles, String jueves, String viernes, 
            int idmedico, String especialidad, String cargo, String fechainicio, String fechafin) {
        super(idmedico, especialidad, cargo, fechainicio, fechafin);
        this.idagenda = idagenda;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
    }

    public AgendasModelo(int idagenda, String lunes, String martes, String miercoles, String jueves, String viernes, 
            int idmedico, String especialidad, String cargo, String fechainicio, String fechafin, String nombre,
            String cedula, String apellido, String correoe, int celular, String tiposangre, String fechanacimiento,
            String dirreccion, String genero) {
        super(idmedico, especialidad, cargo, fechainicio, fechafin, nombre, cedula, apellido, correoe, celular, tiposangre, fechanacimiento, dirreccion, genero);
        this.idagenda = idagenda;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
    }

    public int getIdagenda() {
        return idagenda;
    }

    public void setIdagenda(int idagenda) {
        this.idagenda = idagenda;
    }

    public String getLunes() {
        return lunes;
    }

    public void setLunes(String lunes) {
        this.lunes = lunes;
    }

    public String getMartes() {
        return martes;
    }

    public void setMartes(String martes) {
        this.martes = martes;
    }

    public String getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(String miercoles) {
        this.miercoles = miercoles;
    }

    public String getJueves() {
        return jueves;
    }

    public void setJueves(String jueves) {
        this.jueves = jueves;
    }

    public String getViernes() {
        return viernes;
    }

    public void setViernes(String viernes) {
        this.viernes = viernes;
    }
    
    
}
