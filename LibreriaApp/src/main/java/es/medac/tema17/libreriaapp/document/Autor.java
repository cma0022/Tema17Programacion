/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.tema17.libreriaapp.document;

/**
 *
 * @author Usuario
 */
public class Autor {
    
    private int idAutor;
    private String nombre;
    private String apellido;
    private int edad;
    
    public Autor(){
        super();
        this.idAutor = 0;
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }
    
    public Autor(int idAutor, String nombre, String apellido, int edad){
        super();
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Autor{" + "idAutor=" + idAutor + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
            
    
}
