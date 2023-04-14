/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.ProyectoInterfaces;

/**
 *
 * @author Usuario
 */
public abstract class Empleado {
    
    // DECLARAMOS LAS VARIABLES
    private String nombre; 
    private String apellido; 
    private String dni; 
    private String direccion; 
    private int edad; 
    private String formacionAcademica; 
    private int añosExperiencia; 
    private int horas_trabajadas; 
    private int pagoPorHora; 
    
    // CONSTRUCTOR SIN PARÁMETROS
    public Empleado(){
        super();
    }
    
    // CONSTRUCTOR CON PARÁMETROS
    public Empleado(String nombre, String apellido, String dni, String direccion,
            int edad, String formacionAcademica, int añosExperiencia, int horas_trabajadas,
            int pagoPorHora){
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.edad = edad;
        this.formacionAcademica = formacionAcademica;
        this.añosExperiencia = añosExperiencia;
        this.horas_trabajadas = horas_trabajadas;
        this.pagoPorHora = pagoPorHora;
    }
    
    // GETTERS Y SETTERS
    
    public String getNombre(){
        return nombre;
    } 
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getDni(){
        return dni;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getFormacionAcademica(){
        return formacionAcademica;
    }
    
    public void setFormacionAcademica(String formacionAcademica){
        this.formacionAcademica = formacionAcademica;
    }
    
    public int getAñosExperiencia(){
        return añosExperiencia;                
    }
    
    public void setAñosExperiencia(int añosExperiencia){
        this.añosExperiencia = añosExperiencia;
    }
    
    public int getHoras_Trabajadas(){
        return horas_trabajadas;
    }
    
    public void setHoras_Trabajadas(int horas_trabajadas){
        this.horas_trabajadas = horas_trabajadas;
    }
    
    public int getPagoPorHora(){
        return pagoPorHora;
    }
    
    public void setPagoPorHora(int pagoPorHora){
        this.pagoPorHora = pagoPorHora;
    }
    
    // MÉTODOS ABSTRACTOS
    public abstract String imprimirReciboPago(); 
    public abstract int horasExtras(); 
    public abstract int cant_horas_extras(); 
    public abstract double sueldoBruto(); 
    public abstract double sueldoNeto(); 
    
}
