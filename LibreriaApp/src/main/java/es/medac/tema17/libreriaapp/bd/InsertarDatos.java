/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.tema17.libreriaapp.bd;

import es.medac.tema17.libreriaapp.document.Autor;
import es.medac.tema17.libreriaapp.document.Libro;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class InsertarDatos {
    
    public int insertarAutores(int id, String nombre, String apellido, int edad){
        int filasAfectadas = -1;
        ConexionMySQL conexion = new ConexionMySQL();
        String consulta = "INSERT INTO autor (idAutor, nombre, apellido, edad) "
            + "VALUES ('"+id+"', '"+nombre+"', '"+apellido+"', '"+edad+"')";
        //System.out.println(consulta);
        try{
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            filasAfectadas = ps.executeUpdate();
            System.out.println("Registro insertado " + id + ", " + nombre + ", " + apellido + ", " + edad);
            ps.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta insertar autor. " + e.getMessage());
        }
        return filasAfectadas;
    }
    
    public int insertarLibros(int idLibro, int idAutor, String nombre, String descripcion, int numPag){
        int filasAfectadas = -1;
        ConexionMySQL conexion = new ConexionMySQL();
        String consulta = "INSERT INTO libro (idLibro, idAutor, nombre, descripcion, numPag) "
            + "VALUES ('"+idLibro+"', '"+idAutor+"', '"+nombre+"', '"+descripcion+"', '"+numPag+"')";
        //System.out.println(consulta);
        try{
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            filasAfectadas = ps.executeUpdate();
            System.out.println("Registro insertado " + idLibro + ", " + idAutor + ", " + nombre + ", " + descripcion + ", " + numPag);
            ps.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta insertar libro. " + e.getMessage());
        }
        return filasAfectadas;
    }
    
    
    public int insertarLibrosCSV(int id, Libro l){
        int filasAfectadas = -1;
        ConexionMySQL conexion = new ConexionMySQL();
        String consulta = "INSERT INTO libro (idLibro, idAutor, nombre, descripcion, numPag) "
            + "VALUES ('"+id+"', '"+l.getIdAutor()+"', '"+l.getNombre()+"', '"+l.getDescripcion()+"', '"+l.getNumPag()+"')";
        //System.out.println(consulta);
        try{
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            filasAfectadas = ps.executeUpdate();
            ps.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta insertar libro. " + e.getMessage());
        }
        return filasAfectadas;
    }
    
    
    public int insertarAutoresTXT(int id, Autor a)  {
        int filasAfectadas = -1;
        ConexionMySQL conexion = new ConexionMySQL();
        String consulta = "INSERT INTO autor (idAutor, nombre, apellido, edad)"
            + "VALUES ('"+id+"', '"+a.getNombre()+"', '"+a.getApellido()+"', '"+a.getEdad()+"')";
        //System.out.println(consulta);
        try{
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            filasAfectadas = ps.executeUpdate();
            ps.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta insertar autor. " + e.getMessage());
        }
        return filasAfectadas;
    }
    
    
    public int insertarNombreAutoresXML(int id, Autor a)  {
        int filasAfectadas = -1;
        ConexionMySQL conexion = new ConexionMySQL();
        String consulta = "INSERT INTO autor (idAutor, nombre, apellido, edad)"
            + "VALUES ('"+id+"', '"+a.getNombre()+"', 'Desconocido', 0)";
        //System.out.println(consulta);
        try{
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            filasAfectadas = ps.executeUpdate();
            ps.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta insertar nombre Autor. " + e.getMessage());
        }
        return filasAfectadas;
    }
    
}
