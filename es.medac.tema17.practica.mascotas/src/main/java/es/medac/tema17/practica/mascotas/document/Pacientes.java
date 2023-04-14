/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.tema17.practica.mascotas.document;

/**
 *
 * @author Usuario
 */
public class Pacientes {
    
    private int idMascota;
    private String aliasMascota;
    private String especie;
    private String raza;
    private String colorPelo;
    private String fechaNacimiento;
    private int vacunaciones;
    
    public Pacientes(){
        super();
        this.idMascota = 0;
        this.aliasMascota = "";
        this.especie = "";
        this.raza = "";
        this.colorPelo = "";
        this.fechaNacimiento = "00/00/00";
        this.vacunaciones = 0;
    }    

    public Pacientes(int idMascota, String aliasMascota, String especie, String raza, String colorPelo, String fechaNacimiento, int vacunaciones) {
        this.idMascota = idMascota;
        this.aliasMascota = aliasMascota;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.vacunaciones = vacunaciones;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getAliasMascota() {
        return aliasMascota;
    }

    public void setAliasMascota(String aliasMascota) {
        this.aliasMascota = aliasMascota;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getVacunaciones() {
        return vacunaciones;
    }

    public void setVacunaciones(int vacunaciones) {
        this.vacunaciones = vacunaciones;
    }

    @Override
    public String toString() {
        return "Pacientes{" + "idMascota=" + idMascota + ", aliasMascota=" + aliasMascota + ", especie=" + especie + ", raza=" + raza + ", colorPelo=" + colorPelo + ", fechaNacimiento=" + fechaNacimiento + ", vacunaciones=" + vacunaciones + '}';
    }
    
    
}
