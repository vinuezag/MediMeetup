/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author user
 */
public class CitasModelo extends MedicoModelo{
    private int idcitas;
    private String hora;
    private String dia;
    private String cedula;

    public CitasModelo() {
    }

    public CitasModelo(int idcitas, String hora, String dia) {
        this.idcitas = idcitas;
        this.hora = hora;
        this.dia = dia;
    }

    public CitasModelo(int idcitas, String cedula, String hora, String dia, String especialidad) {
        super(especialidad);
        this.idcitas = idcitas;
        this.cedula=cedula;
        this.hora = hora;
        this.dia = dia;
    }

    public CitasModelo(int idcitas, String hora, String dia, int idmedico, String especialidad, String cargo, 
            String fechainicio, String fechafin, String nombre, String cedula, String apellido, String correoe,
            int celular, String tiposangre, String fechanacimiento, String dirreccion, String genero) {
        super(idmedico, especialidad, cargo, fechainicio, fechafin, nombre, cedula, apellido, correoe, celular, tiposangre, fechanacimiento, dirreccion, genero);
        this.idcitas = idcitas;
        this.hora = hora;
        this.dia = dia;
    }
    

    public int getIdcitas() {
        return idcitas;
    }

    public void setIdcitas(int idcitas) {
        this.idcitas = idcitas;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    
}
