/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.tema17.libreriaapp.bd;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ConsultasDelete_Update {
    
    public int eliminarLibrosXNombre(String titulo){
        int filasEliminadas = 0;
        ConexionMySQL conexion = new ConexionMySQL();
        String consulta = "DELETE FROM libro WHERE nombre LIKE '" + titulo + "'";
        System.out.println(consulta);
        try{
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            filasEliminadas = ps.executeUpdate();
            System.out.println(filasEliminadas + " registros eliminados con título : " + titulo);
            ps.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta eliminar libro. " + e.getMessage());
        }
        return filasEliminadas;
    }
    
    
    public void eliminarLibrosXId(int id){
        int filasEliminadas = 0;
        ConexionMySQL conexion = new ConexionMySQL();
        String consulta = "DELETE FROM libro WHERE idLibro = " + id;
        //System.out.println(consulta);
        try{
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            filasEliminadas = ps.executeUpdate();
            System.out.println(filasEliminadas + " registros de libro eliminados por id");
            ps.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta eliminar libro. " + e.getMessage());
        }
    }
    
    
    public void modificarNombreAutorxId(int nuevoId, String nuevoNombre){
        int filasEliminadas = 0;
        ConexionMySQL conexion = new ConexionMySQL();
        String consulta = "UPDATE autor SET nombre = '" + nuevoNombre + "' WHERE idAutor = " + nuevoId;
        //System.out.println(consulta);
        try{
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            filasEliminadas = ps.executeUpdate();
            System.out.println(filasEliminadas + " registros de autor modificados por id");
            ps.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta modificar nombre autor. " + e.getMessage());
        }
    }
}
