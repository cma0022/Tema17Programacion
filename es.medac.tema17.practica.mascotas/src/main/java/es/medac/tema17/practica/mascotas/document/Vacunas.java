/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.tema17.practica.mascotas.document;

/**
 *
 * @author Usuario
 */
public class Vacunas {
    
    private int idVacunas;
    private int idMascota;
    private String fecha;
    private String enfermedad;
    private String fechaProxima;
    
    public Vacunas(){
        super();
        this.idVacunas = 0;
        this.idMascota = 0;
        this.fecha = "00/00/00";
        this.enfermedad = "";
        this.fechaProxima = "00/00/00";
    }

    public Vacunas(int idVacunas, int idMascota, String fecha, String enfermedad, String fechaProxima) {
        this.idVacunas = idVacunas;
        this.idMascota = idMascota;
        this.fecha = fecha;
        this.enfermedad = enfermedad;
        this.fechaProxima = fechaProxima;
    }

    public int getIdVacunas() {
        return idVacunas;
    }

    public void setIdVacunas(int idVacunas) {
        this.idVacunas = idVacunas;
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

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getFechaProxima() {
        return fechaProxima;
    }

    public void setFechaProxima(String fechaProxima) {
        this.fechaProxima = fechaProxima;
    }

    @Override
    public String toString() {
        return "Vacunas{" + "idVacunas=" + idVacunas + ", idMascota=" + idMascota + ", fecha=" + fecha + ", enfermedad=" + enfermedad + ", fechaProxima=" + fechaProxima + '}';
    }
    
}
