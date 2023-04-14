/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.tema17.libreriaapp.document;

/**
 *
 * @author Usuario
 */
public class Libro {
    
    private int idLibro;
    private int idAutor;
    private String nombre;
    private String descripcion;
    private int numPag;

    public Libro() {
        super();
        this.idLibro = 0;
        this.idAutor = 0;
        this.nombre = "";
        this.descripcion = "";
        this.numPag = 0;
    }

    public Libro(int idLibro, int idAutor, String nombre, String descripcion, int numPag) {
        super();
        this.idLibro = idLibro;
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numPag = numPag;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "idLibro=" + idLibro + ", idAutor=" + idAutor + ", nombre=" + nombre + ", descripcion=" + descripcion + ", numPag=" + numPag + '}';
    }
    
    
    
}
