/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.tema16.ejemplo;

/**
 *
 * @author Usuario
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author santi
 */
public class CuadrosDialogo {

    public static void main(String[] args) {
        Cuadros_Dialogos mimarco = new Cuadros_Dialogos();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }
}

class Cuadros_Dialogos extends JFrame {

    public Cuadros_Dialogos() {
        setTitle("Cuadro de diálogos");
        setBounds(500, 300, 400, 250);
        add(new Lamina_Cuadros_Dialogos());
    }
}

class Lamina_Cuadros_Dialogos extends JPanel {

    public Lamina_Cuadros_Dialogos() {
//Creamos 4 botones
        boton1 = new JButton("Botón 1");
        boton2 = new JButton("Botón 2");
        boton3 = new JButton("Botón 3");
        boton4 = new JButton("Botón 4");
        boton1.addActionListener(new Accion_botones());
        boton2.addActionListener(new Accion_botones());
        boton3.addActionListener(new Accion_botones());
        boton4.addActionListener(new Accion_botones());
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
    } //Fin constructor

    private class Accion_botones implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                System.out.println("Has pulsado el botón 1");
                String mensaje = "Mensaje de información.";
                JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, mensaje);
                
            } else if (e.getSource() == boton2) {
                System.out.println("Has pulsado el botón 2");
                String mensaje = "Mensaje error.";
                String titulo = "Ventana error.";
                JOptionPane.showConfirmDialog(Lamina_Cuadros_Dialogos.this, "Hola");
                        
            } else if (e.getSource() == boton3) {
                System.out.println("Has pulsado el botón 3");
                String mensaje = "Mensaje advertencia.";
                String titulo = "Ventana advertencia.";
                JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, 
                        mensaje, titulo, 2);
                
            } else {
                System.out.println("Has pulsado el botón 4");
                String mensaje = "Mensaje pregunta.";
                String titulo = "Ventana pregunta.";
                JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, 
                        mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
            }
        }
    } //FIN CLASE Accion_botones
    
    private JButton boton1, boton2, boton3, boton4;
}// FIN clase Lamina_Cuadros_Dialogos
