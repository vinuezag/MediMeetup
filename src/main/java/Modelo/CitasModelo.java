/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author user
 */
public class CitasModelo {
    private int idcitas;
    private String hora;
    private String dia;

    public CitasModelo() {
    }

    public CitasModelo(int idcitas, String hora, String dia) {
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
