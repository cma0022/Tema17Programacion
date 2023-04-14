/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.tema17.libreriaapp.bd;

import java.sql.*;
import java.util.ArrayList;
import es.medac.tema17.libreriaapp.document.*;
/**
 *
 * @author Usuario
 */
public class ConsultasSelect {
    
        public void obtenerAutores(){
            ConexionMySQL conexion = new ConexionMySQL(); // Creo la conexión a la BD
            String consulta = "SELECT * FROM autor ORDER BY edad ASC"; // Creamos String con la consulta SQL que queramos ejecutar
            try{
                PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                System.out.println("****** TABLA AUTORES ******");
                System.out.println("id,nombre,apellido,edad");
                while (rs.next()){
                    System.out.println(rs.getString("idAutor") + "," + rs.getString("nombre") + "," +
                            rs.getString("apellido") + "," + rs.getString("edad"));
                }
                ps.close();
                rs.close();
                conexion.cerrar();
            } catch (SQLException e){
                System.out.println("Error consulta obtener autor. " + e.getMessage());
            }
        }
        
        public String obtenerLibrosExtensos(){
            ConexionMySQL conexion = new ConexionMySQL();
            String consulta = "SELECT * FROM libro WHERE numPag > 100";
            String resultado = "";
            try{
                PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                System.out.println("****** TABLA LIBROS ( CON MÁS DE 100 PÁGINAS) ******");
                System.out.println("idLibro,idAutor,nombre,descripcion,numPag");
                while (rs.next()){
                    resultado = rs.getString("idLibro") + "," + rs.getString("idAutor") + "," +
                            rs.getString("nombre") + "," + rs.getString("descripcion") + "," +
                            rs.getString("numPag");
                    System.out.println(resultado);
                    
                }
                ps.close();
                rs.close();
                conexion.cerrar();
            } catch (SQLException e) {
                System.out.println("Error consulta obtener libros con más de 100 páginas. " + e.getMessage());
            }
            return resultado;
        }   
        
        
        public int obtenerUltimoIdLibro(){
            int ultIdLibro = -1;
            ConexionMySQL conexion = new ConexionMySQL();
            String consulta = "SELECT idLibro FROM libro ORDER BY idLibro DESC LIMIT 1";
            try{
                PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    ultIdLibro = Integer.parseInt(rs.getString("idLibro"));
                }
                ps.close();
                rs.close();
                conexion.cerrar();
            } catch (SQLException e) {
                System.out.println("Error consulta obtener el último id de libro. " + e.getMessage());
            }
            return ultIdLibro;
        }
        
        
        public void obtenerLibros(){
            ConexionMySQL conexion = new ConexionMySQL();
            String consulta = "SELECT idLibro, nombre, numPag FROM libro";
            try{
                PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                System.out.println("***** LIBROS ***** \nidLibro, título, numPag");
                while (rs.next()) {
                    System.out.println(rs.getString("idLibro") + ", " + rs.getString("nombre") + ", " + rs.getString("numPag"));
                }
                ps.close();
                rs.close();
                conexion.cerrar();
            } catch (SQLException e) {
                System.out.println("Error consulta obtener el último id de libro. " + e.getMessage());
            }
        }
        
        /**
         * Este método consulta todos los libros de mi BD
         * @return un ArrayList con cada uno de los libros
         */
        public ArrayList<Libro> obtenerLibroArray(){
            ArrayList<Libro> libros = new ArrayList<Libro>();
            ConexionMySQL conexion = new ConexionMySQL();
            String consulta = "SELECT * FROM libro";
            try{
                PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Libro libro1 = new Libro(rs.getInt("idLibro"), rs.getInt("idAutor"), rs.getString("nombre"), rs.getString("descripcion"), rs.getInt("numPag"));
                    libros.add(libro1);
                }
                ps.close();
                rs.close();
                conexion.cerrar();
            } catch (SQLException e) {
                System.out.println("Error consulta obtener ArrayList de libros. " + e.getMessage());
            }
            return libros;
        }
        
        
        public int obtenerUltimoIdAutor(){
            int ultIdAutor = -1;
            ConexionMySQL conexion = new ConexionMySQL();
            String consulta = "SELECT idAutor FROM autor ORDER BY idAutor DESC LIMIT 1";
            try{
                PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    ultIdAutor = Integer.parseInt(rs.getString("idAutor"));
                }
                ps.close();
                rs.close();
                conexion.cerrar();
            } catch (SQLException e) {
                System.out.println("Error consulta obtener el último id de autor. " + e.getMessage());
            }
            return ultIdAutor;
        }
        
}
        