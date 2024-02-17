/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author user
 */
public class DiagnosticoModelo {
    private int iddiagnostico;
    private String diagnostico;
    private String receta;

    public DiagnosticoModelo() {
    }

    public DiagnosticoModelo(int iddiagnostico, String diagnostico, String receta) {
        this.iddiagnostico = iddiagnostico;
        this.diagnostico = diagnostico;
        this.receta = receta;
    }

    public int getIddiagnostico() {
        return iddiagnostico;
    }

    public void setIddiagnostico(int iddiagnostico) {
        this.iddiagnostico = iddiagnostico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }
    
}
