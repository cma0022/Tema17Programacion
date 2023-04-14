/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.tema17.libreriaapp.utils;

import es.medac.tema17.libreriaapp.document.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class LeerCsvLibros {

    // C:\Users\Usuario\Documents\NetBeansProjects\LibreriaApp\src\main\java\Doc\libros.csv
    public ArrayList<Libro> cargarLibrosCSV() {
        ArrayList<Libro> libros = new ArrayList<Libro>();
        
        try {
            File f = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\LibreriaApp\\src\\main\\java\\Doc\\libros.csv");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine(); // Primera linea lee la cabecera que no nos interesa
            while(linea != null){
                linea = br.readLine();
                String [] registroLibro = linea.split(";");
                // idAutor 0 == Desconocido
                Libro l = new Libro(-1, 0, registroLibro[0], registroLibro[1], Integer.parseInt(registroLibro[2]));
                libros.add(l);
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            System.out.println("Error al leer fichero CSV. " + e);
        }
        return libros;
    }

}
