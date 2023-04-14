/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.ProyectoInterfaces;

/**
 *
 * @author Usuario
 */
public class Informe_Empleado extends Empleado {

    // DECLARAMOS LAS VARIABLES
    private int cant_hijos;
    private String hacienda;
    private String rentencion;

    // CONSTRUCTOR SIN PARÁMETROS
    public Informe_Empleado() {
        super();
    }

    // CONSTRUCTOR CON PARÁMETROS
    public Informe_Empleado(String nombre, String apellido, String dni,
            String direccion, int edad, String formacionAcademica, int añosExperiencia,
            int horas_trabajadas, int pagoPorHoras, int cant_hijos, String hacienda, String rentencion) {
        super(nombre, apellido, dni, direccion, edad, formacionAcademica, añosExperiencia,
                horas_trabajadas, pagoPorHoras);
        this.cant_hijos = cant_hijos;
        this.hacienda = hacienda;
        this.rentencion = rentencion;
    }

    // GETTERS Y SETTERS
    public int getCant_Hijos() {
        return cant_hijos;
    }

    public void setCant_Hijos(int cant_hijos) {
        this.cant_hijos = cant_hijos;
    }

    public String getHacienda() {
        return hacienda;
    }

    public void setHacienda(String hacienda) {
        this.hacienda = hacienda;
    }

    public String getRentencion() {
        return rentencion;
    }

    public void setRentencion(String rentencion) {
        this.rentencion = rentencion;
    }

    // MÉTODOS ABSTRACTOS DE LA CLASE PADRE
    @Override
    public String imprimirReciboPago() {
        return "INFORME DEL TRABAJADOR" + "\n"
                + "---------------------" + "\n"
                + "                       " + "\n"
                + "Datos del Empleado" + "\n"
                + "Nombres: " + super.getNombre() + "\n"
                + "Apellidos: " + super.getApellido() + "\n"
                + "DNI: " + super.getDni() + "\n"
                + "Edad: " + super.getEdad() + "\n"
                + "Dirección: " + super.getDireccion() + "\n"
                + "Formación Academica: " + super.getFormacionAcademica() + "\n"
                + "Años de experiencia: " + super.getAñosExperiencia() + "\n" + "                        " + "\n"
                + "Resumen de Pago" + "\n" + "                       " + "\n"
                + "Sueldo Bruto: S/ " + this.sueldoBruto() + "\n"
                + "Horas Extras: " + cant_horas_extras() + "\n"
                + "Pago por horas Extras: S/ " + horasExtras() + "\n"
                + "Pension: S/ " + pension() + "\n"
                + "Bono por hijos: S/ " + bonoHijos() + "\n" + "Sueldo Neto: S/ " + sueldoNeto();
    }

    @Override
    public int horasExtras() {
        int horasExtra = cant_horas_extras() * (2 * super.getPagoPorHora());
        return horasExtra;
    }

    @Override
    public int cant_horas_extras() {
        int cantHorasExtra = 0;
        if (super.getHoras_Trabajadas() > 40) {
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
        int sueldoNe = horasExtras() + (int) sueldoBruto();
        return sueldoNe;
    }
    
    // MÉTODOS PROPIOS DE LA CLASE
    private double pension(){
        double pension = 0.0;
        if(rentencion.equals("rentencion 2.5%")){
            pension = sueldoBruto() * 0.025;
            return pension;
        }else if(hacienda.equals("hacienda 1.5%")){
            pension = sueldoBruto() * 0.015;
            return pension;
        }else{
            return pension;
        }
    }
    
    private double bonoHijos (){
        double bono = 0.0;
        if(cant_hijos > 0 && cant_hijos < 3){
            bono = sueldoBruto() * 0.032;
            return bono;
        }else if(cant_hijos > 2 && cant_hijos < 5){
            bono = sueldoBruto() * 0.05;
            return bono;
        }else if(cant_hijos >= 5){
            bono = sueldoBruto() * 0.075;
            return bono;
        }else{
            return bono;
        }
    }
    
    
}
