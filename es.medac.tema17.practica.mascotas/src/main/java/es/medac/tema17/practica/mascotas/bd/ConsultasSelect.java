/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.tema17.practica.mascotas.bd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ConsultasSelect {
    
    public void obtenerPacientes(){
            ConexionMySQL conexion = new ConexionMySQL(); // Creo la conexión a la BD
            String consulta = "SELECT * FROM pacientes ORDER BY aliasMascota ASC"; // Creamos String con la consulta SQL que queramos ejecutar
            try{
                PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                System.out.println("****** TABLA PACIENTES (MASCOTAS) ******");
                System.out.println("idMascota, aliasMascota, especie, raza, colorPelo, fechaNacimiento, vacunaciones");
                while (rs.next()){
                    System.out.println(rs.getString("idMascota") + ", " + rs.getString("aliasMascota") + ", " +
                            rs.getString("especie") + ", " + rs.getString("raza") + ", " + rs.getString("colorPelo")
                            + ", " + rs.getString("fechaNacimiento") + ", " + rs.getString("vacunaciones"));
                }
                ps.close();
                rs.close();
                conexion.cerrar();
            } catch (SQLException e){
                System.out.println("Error consulta obtener pacientes. " + e.getMessage());
            }
        }
    
    public int obtenerUltimoIdMascota(){
            int ultIdMascota = -1;
            ConexionMySQL conexion = new ConexionMySQL();
            String consulta = "SELECT idMascota FROM pacientes ORDER BY idMascota DESC LIMIT 1";
            try{
                PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    ultIdMascota = Integer.parseInt(rs.getString("idMascota"));
                }
                ps.close();
                rs.close();
                conexion.cerrar();
            } catch (SQLException e) {
                System.out.println("Error consulta obtener el último id de mascota. " + e.getMessage());
            }
            return ultIdMascota;
        }
}
