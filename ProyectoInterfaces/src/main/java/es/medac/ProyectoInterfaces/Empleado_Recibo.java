/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.ProyectoInterfaces;

/**
 *
 * @author Usuario
 */
public class Empleado_Recibo extends Empleado {

    // DECLARAMOS LAS VARIABLES
    String recibo;
    
    // CONSTRUCTOR SIN PARÁMETROS
    public Empleado_Recibo(){
        super();
    }
    
    // CONSTRUCTOR CON PARÁMETROS
    public Empleado_Recibo(String recibo, String nombre, String apellido, String dni,
            String direccion, int edad, String formacionAcademica, int añosExperiencia,
            int horas_trabajadas, int pagoPorHoras){
        super(nombre, apellido, dni, direccion, edad, formacionAcademica, añosExperiencia,
                horas_trabajadas, pagoPorHoras);
        this.recibo = recibo;
    }
    
    //GETTERS Y SETTERS
    public String getRecibo(){
        return recibo;       
    }
    
    public void setRecibo(String recibo){
        this.recibo = recibo;
    }
    
    // MÉTODOS ABSTRACTOS DE LA CLASE PADRE
    @Override
    public String imprimirReciboPago() {

        return """
               INFORME DEL TRABAJADOR
               ----------------------
                                      
               Datos del Empleado
               Nombres: """ + super.getNombre() + "\n" 
                + "Apellidos: " + super.getApellido() + "\n" 
                + "DNI: " + super.getDni() + "\n" 
                + "Edad: " + super.getEdad() + "\n" 
                + "Dirección: " + super.getDireccion() + "\n" 
                + "Formación Academica: " + super.getFormacionAcademica() + "\n" 
                + "Años de experiencia: " + super.getAñosExperiencia() + "\n" 
                + "                        " + "\n" 
                + "Resumen de Pago " +this.recibo+ "\n" 
                + "Sueldo Bruto: S/ " + sueldoBruto() + "\n" 
                + "Horas Extras: " + cant_horas_extras() + "\n" 
                + "Pago por horas Extras: S/ " + horasExtras() + "\n" 
                + "Sueldo Neto: S/ " + sueldoNeto();
    }

    @Override
    public int horasExtras() {
        int horasExtra = cant_horas_extras()*(2*super.getPagoPorHora());
        return horasExtra;
    }

    @Override
    public int cant_horas_extras() {
        int cantHorasExtra = 0;
        if(super.getHoras_Trabajadas() > 40){
            cantHorasExtra = super.getHoras_Trabajadas() - 40;
        }
        return cantHorasExtra;
    }

    @Override
    public double sueldoBruto() {
        int sueldoBr = super.getHoras_Trabajadas() * super.getPagoPorHora();
        return sueldoBr;
    }

    @Override
    public double sueldoNeto() {
        int sueldoNe = horasExtras() + (int)sueldoBruto();
        return sueldoNe;
    }
    
    
}
