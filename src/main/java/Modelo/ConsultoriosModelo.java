/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author user
 */
public class ConsultoriosModelo extends MedicoModelo {
    private int idconsultorio;
    private String lugar;
    private String piso;

    public ConsultoriosModelo() {
    }

    public ConsultoriosModelo(int idconsultorio, String lugar, String piso) {
        this.idconsultorio = idconsultorio;
        this.lugar = lugar;
        this.piso = piso;
    }

    public ConsultoriosModelo(int idconsultorio, String lugar, String piso, int idmedico, String especialidad, String cargo,
            String fechainicio, String fechafin) {
        super(idmedico, especialidad, cargo, fechainicio, fechafin);
        this.idconsultorio = idconsultorio;
        this.lugar = lugar;
        this.piso = piso;
    }

    public ConsultoriosModelo(int idconsultorio, String lugar, String piso, int idmedico, String especialidad, String cargo, 
            String fechainicio, String fechafin, String nombre,
         String cedula, String apellido, String correoe, int celular, String tiposangre, String fechanacimiento, String dirreccion, 
         String genero) {
        super(idmedico, especialidad, cargo, fechainicio, fechafin, nombre, cedula, apellido, correoe, celular, tiposangre, fechanacimiento, dirreccion, genero);
        this.idconsultorio = idconsultorio;
        this.lugar = lugar;
        this.piso = piso;
    }


    public void setIdconsultorio(int idconsultorio) {
        this.idconsultorio = idconsultorio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }
    
    
}
