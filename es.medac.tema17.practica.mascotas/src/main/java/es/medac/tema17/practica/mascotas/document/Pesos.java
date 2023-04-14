/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.tema17.practica.mascotas.document;

/**
 *
 * @author Usuario
 */
public class Pesos {
    
    private int idPesos;
    private int idMascota;
    private String fecha;
    private int peso;
    
    
    public Pesos(){
        super();
        this.idPesos = 0;
        this.idMascota = 0;
        this.fecha = "00/00/00";
        this.peso = 0;
    }

    public Pesos(int idPesos, int idMascota, String fecha, int peso) {
        this.idPesos = idPesos;
        this.idMascota = idMascota;
        this.fecha = fecha;
        this.peso = peso;
    }

    public int getIdPesos() {
        return idPesos;
    }

    public void setIdPesos(int idPesos) {
        this.idPesos = idPesos;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pesos{" + "idPesos=" + idPesos + ", idMascota=" + idMascota + ", fecha=" + fecha + ", peso=" + peso + '}';
    }    
    
}
