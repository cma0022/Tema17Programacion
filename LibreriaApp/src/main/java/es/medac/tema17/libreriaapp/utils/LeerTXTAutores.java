/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.tema17.libreriaapp.utils;

import es.medac.tema17.libreriaapp.document.Autor;
import es.medac.tema17.libreriaapp.document.Libro;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Usuario
 */
public class LeerTXTAutores {
    
    // C:\Users\Usuario\Documents\NetBeansProjects\LibreriaApp\src\main\java\Doc\autores.txt
    
    public LinkedList<Autor> cargarAutoresTXT() {
        LinkedList<Autor> autores = new LinkedList<Autor>();
        
        try {
            File f = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\LibreriaApp\\src\\main\\java\\Doc\\autores.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine(); // Primera linea lee la cabecera que no nos interesa
            while(linea != null){
                if(!linea.isEmpty()){
                    linea = br.readLine();
                    String [] registroAutor = linea.split(",");
                    Autor a = new Autor(0, registroAutor[0], registroAutor[1], Integer.parseInt(registroAutor[2]));
                    autores.add(a);
                }
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            System.out.println("Error al leer fichero TXT. " + e);
        }
        return autores;
    }
}
