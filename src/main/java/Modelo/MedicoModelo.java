/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author user
 */
public class MedicoModelo extends PersonaModelo{
    private int idmedico;
    private String especialidad;
    private String cargo;
    private String fechainicio;
    private String fechafin;

    public MedicoModelo() {
    }

    public MedicoModelo(int idmedico, String especialidad, String cargo, String fechainicio, String fechafin) {
        this.idmedico = idmedico;
        this.especialidad = especialidad;
        this.cargo = cargo;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

    public MedicoModelo(int idmedico, String especialidad, String cargo, String fechainicio, String fechafin, String nombre, int cedula, String apellido, String correoe, int celular, String tiposangre, String fechanacimiento, String dirreccion, String genero) {
        super(nombre, cedula, apellido, correoe, celular, tiposangre, fechanacimiento, dirreccion, genero);
        this.idmedico = idmedico;
        this.especialidad = especialidad;
        this.cargo = cargo;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

    public int getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(int idmedico) {
        this.idmedico = idmedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }
    
    
}
