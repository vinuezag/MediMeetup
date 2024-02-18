/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author user
 */
public class EstadosModelo extends CitasModelo {
    private int idestado;
    private String estado;

    public EstadosModelo() {
    }

    public EstadosModelo(int idestado, String estado) {
        this.idestado = idestado;
        this.estado = estado;
    }

    public EstadosModelo(int idestado, String estado, int idcitas, String hora, String dia) {
        super(idcitas, hora, dia);
        this.idestado = idestado;
        this.estado = estado;
    }

    public int getIdestado() {
        return idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
