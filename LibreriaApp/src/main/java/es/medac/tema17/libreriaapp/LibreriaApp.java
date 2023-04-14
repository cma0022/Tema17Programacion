/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.medac.tema17.libreriaapp;

import es.medac.tema17.libreriaapp.bd.ConexionMySQL;
import es.medac.tema17.libreriaapp.bd.ConsultasDelete_Update;
import es.medac.tema17.libreriaapp.bd.ConsultasSelect;
import es.medac.tema17.libreriaapp.bd.InsertarDatos;
import es.medac.tema17.libreriaapp.document.*;
import es.medac.tema17.libreriaapp.utils.LeerCsvLibros;
import es.medac.tema17.libreriaapp.utils.LeerTXTAutores;
import es.medac.tema17.libreriaapp.utils.LeerXMLnombreAutor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LibreriaApp {

    public static void main(String[] args) {
        
        ConsultasSelect consultas = new ConsultasSelect();
        //consultas.obtenerAutores();
        //String librosLargos = consultas.obtenerLibrosExtensos();
        //System.out.println("El último id de libro es: " + consultas.obtenerUltimoIdLibro());
        InsertarDatos insert = new InsertarDatos();
        //insert.insertarAutores(3, "María", "Martínez", 84);     
        //insert.insertarLibros(consultas.obtenerUltimoIdLibro()+1, 3, "Método inserción id", "A la hora de insertar un libro, en idLibro llamaos al método consultas.obtenerUltimoIdLibro()+1", 1);
        
        ConsultasDelete_Update delete = new ConsultasDelete_Update();
        //delete.eliminarLibrosXNombre("Método inserción id");
        /*
        System.out.println("¿Qué libro quieres eliminar?");
        // Listar por consola todos los libros(idLibro, titulo, numPag)
        consultas.obtenerLibros();
        
        System.out.println("Seleccione el id del libro que quieres eliminar:");
        // Eliminar el libro del id pasado por scanner
        Scanner sc = new Scanner(System.in);
        int idLibroEliminar = sc.nextInt();
        sc.close();
        delete.eliminarLibrosXId(idLibroEliminar);
        
        // Según un idAutor pasado por scan modificamos el nombre del autor
        System.out.println("¿Qué nombre de autor quieres modificar?");
        consultas.obtenerAutores();
        System.out.println("Seleccione el id del autor que quieres modificar el nombre:");
        Scanner sc = new Scanner(System.in);
        int idAutorModificarNombre = sc.nextInt();
        sc.nextLine();
        System.out.println("Seleccione el nombre que quieres aplicar:");
        String nombreAutorModificar = sc.nextLine();
        sc.close();
        delete.modificarNombreAutorxId(idAutorModificarNombre, nombreAutorModificar);
       
        
        ArrayList<Libro> totalLibros = consultas.obtenerLibroArray();
        for(int i = 0; i < totalLibros.size(); i++){
            System.out.println(totalLibros.get(i));
        }
        
        // Insertar libros mediante un csv
        LeerCsvLibros listadoLibros = new LeerCsvLibros();
        ArrayList<Libro> libros = listadoLibros.cargarLibrosCSV();
        for(int i = 0; i < libros.size(); i++){
            // System.out.println(libros.get(i));
            // Consulta que obtenga el idUltimoLibro
            int ultimoLibro = consultas.obtenerUltimoIdLibro()+1;
            insert.insertarLibrosCSV(ultimoLibro, libros.get(i));
        }
        
        
        // Insertar autores mediante un txt
        LeerTXTAutores listadoAutores = new LeerTXTAutores();
        LinkedList<Autor> autores = listadoAutores.cargarAutoresTXT();
        for(int i = 0; i < autores.size(); i++){
            // System.out.println(autores.get(i));
            // Consulta que obtenga el idUltimoAutor
            int ultimoAutor = consultas.obtenerUltimoIdAutor()+1;
            insert.insertarAutoresTXT(ultimoAutor, autores.get(i));
        }
        
        */
        
        LeerXMLnombreAutor leerxml = new LeerXMLnombreAutor();
        ArrayList<Autor> nombreAutores = leerxml.cargarAutoresTXT();
        for(int i = 0; i < nombreAutores.size(); i++){
            // System.out.println(autores.get(i));
            // Consulta que obtenga el idUltimoAutor
            int ultimoAutor = consultas.obtenerUltimoIdAutor()+1;
            insert.insertarNombreAutoresXML(ultimoAutor, nombreAutores.get(i));
        }
        
        
        
        
        
        
        
    }
}
