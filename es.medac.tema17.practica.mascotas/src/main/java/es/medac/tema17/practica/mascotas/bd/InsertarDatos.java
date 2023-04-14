/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.tema17.practica.mascotas.bd;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class InsertarDatos {
    
    public int insertarPacientes(int idMascota, String aliasMascota, String especie, String raza, String colorPelo, 
            String fechaNacimiento, int vacunaciones){
        int filasAfectadas = -1;
        ConexionMySQL conexion = new ConexionMySQL();
        String consulta = "INSERT INTO pacientes (idMascota, aliasMascota, especie, raza, colorPelo, fechaNacimiento, vacunaciones) "
            + "VALUES ('"+idMascota+"', '"+aliasMascota+"', '"+especie+"', '"+raza+"', '"+colorPelo+"', '"+fechaNacimiento+"', '"+vacunaciones+"')";
        //System.out.println(consulta);
        try{
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            filasAfectadas = ps.executeUpdate();
            System.out.println("Registro insertado "+idMascota+", "+aliasMascota+", "+especie+", "+raza+", "+colorPelo+", "+fechaNacimiento+", "+vacunaciones);
            ps.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta insertar pacientes(mascotas). " + e.getMessage());
        }
        return filasAfectadas;
    }
    
    
}
