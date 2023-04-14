/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.tema17.libreriaapp.bd;

import java.sql.*;
/**
 *
 * @author Usuario
 */
public class ConexionMySQL {

        protected Connection conexion;
        private final String URL = "jdbc:mysql://localhost/libreria";
        private final String USUARIO = "carlosma";
        private final String PASSWORD = "123con";

        public ConexionMySQL(){
            conexion = null;
            try{
                // Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
                //System.out.println("Conectado...");
            }catch (SQLException e){
                System.out.println("Error al abrir la conexión. " + e);
            }
        }

        public Connection getConexion(){
            return conexion;
        }

        public void cerrar(){
            try{
                if(conexion != null && !conexion.isClosed()){
                    conexion.close();
                    //System.out.println("Se ha cerrado la conexión a la BD.");
                }
            }catch (SQLException e){
                System.out.println("Error al cerrar la conexión. " + e);
            }
        }
}
