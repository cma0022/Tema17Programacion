/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.tema17.libreriaapp.utils;

import com.mysql.cj.util.StringUtils;
import es.medac.tema17.libreriaapp.document.Autor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Usuario
 */
public class LeerXMLnombreAutor {

    public ArrayList<Autor> cargarAutoresTXT() {
        ArrayList<Autor> autores = new ArrayList<Autor>();

        try {
            File f = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\LibreriaApp\\src\\main\\java\\Doc\\nombres.xml");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine(); // Primera linea lee el elemento raiz que no nos interesa
            do{
                linea = br.readLine();
                if(!linea.isEmpty() && !linea.contains("</nombres>") && linea != null){
                    String registroAutor = linea.substring(linea.indexOf("<nombre>")+8, linea.indexOf("</nombre>"));
                    Autor a = new Autor(0, registroAutor, "", 0);
                    autores.add(a);
                }
            }while(linea != null);
            /*while (linea != null) {
                if (!linea.isEmpty()) {
                    linea = br.readLine();
                    if(!linea.contains("</nombres>") && !linea.isEmpty()){
                        String registroAutor = linea.substring(linea.indexOf("<nombre>")+8, linea.indexOf("</nombre>"));
                        Autor a = new Autor(0, registroAutor, "", 0);
                        autores.add(a);
                    }                    
                }
            }
            */
            fr.close();
            br.close();
        } catch (Exception e) {
            System.out.println("Error al leer fichero XML. " + e);
        }
        return autores;
    }
}
