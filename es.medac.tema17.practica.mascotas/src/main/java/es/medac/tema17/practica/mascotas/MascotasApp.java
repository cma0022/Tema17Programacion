/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.medac.tema17.practica.mascotas;

import es.medac.tema17.practica.mascotas.bd.ConsultasSelect;
import es.medac.tema17.practica.mascotas.bd.InsertarDatos;

/**
 *
 * @author Usuario
 */
public class MascotasApp {

    public static void main(String[] args) {
        
        ConsultasSelect consulta = new ConsultasSelect();
        consulta.obtenerPacientes();
        
        InsertarDatos insertar = new InsertarDatos();
        int ultimoPaciente = consulta.obtenerUltimoIdMascota()+1;
       // insertar.insertarPacientes(ultimoPaciente, "Peluca", "Perro", "Pastor alemán", "Negro y rojo", "2016-01-31", 7);
        
    }
}
