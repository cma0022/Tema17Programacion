/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.medac.Interfaces;

import es.medac.ProyectoInterfaces.Informe_Empleado;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class InformeEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form InformeEmpleado
     */
    public InformeEmpleado() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonGrupo = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        PanelColorTitulo = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        LabelApellidos = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        LabelDNI = new javax.swing.JLabel();
        LabelDirección = new javax.swing.JLabel();
        LabelEdad = new javax.swing.JLabel();
        LabelEstudios = new javax.swing.JLabel();
        LabelAnosExp = new javax.swing.JLabel();
        LabelHorasTrab = new javax.swing.JLabel();
        LabelPagoHora = new javax.swing.JLabel();
        LabelNumHijos = new javax.swing.JLabel();
        TextoDireccion = new javax.swing.JTextField();
        TextoApellidos = new javax.swing.JTextField();
        TextoEdad = new javax.swing.JTextField();
        TextoAñosExp = new javax.swing.JTextField();
        TextoHorasTrab = new javax.swing.JTextField();
        TextoPagoHora = new javax.swing.JTextField();
        TextoNumHijos = new javax.swing.JTextField();
        TextoNombre = new javax.swing.JTextField();
        TextoDNI = new javax.swing.JTextField();
        ComboEstudios = new javax.swing.JComboBox<>();
        BotonRedondoRetencion = new javax.swing.JRadioButton();
        BotonRedondoHacienda = new javax.swing.JRadioButton();
        BotonProcesar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        BotonMenu = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        TextoProcesado = new javax.swing.JTextArea();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(820, 400));

        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelColorTitulo.setBackground(new java.awt.Color(0, 102, 102));
        PanelColorTitulo.setForeground(new java.awt.Color(0, 102, 102));

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setText("INFORME EMPLEADO:");

        javax.swing.GroupLayout PanelColorTituloLayout = new javax.swing.GroupLayout(PanelColorTitulo);
        PanelColorTitulo.setLayout(PanelColorTituloLayout);
        PanelColorTituloLayout.setHorizontalGroup(
            PanelColorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColorTituloLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelColorTituloLayout.setVerticalGroup(
            PanelColorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelColorTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 260, 40));

        LabelApellidos.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        LabelApellidos.setForeground(new java.awt.Color(255, 255, 255));
        LabelApellidos.setText("Apellidos:");
        PanelPrincipal.add(LabelApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 90, -1));

        LabelNombre.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre.setText("Nombre:");
        PanelPrincipal.add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 90, -1));

        LabelDNI.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        LabelDNI.setForeground(new java.awt.Color(255, 255, 255));
        LabelDNI.setText("DNI:");
        PanelPrincipal.add(LabelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 90, -1));

        LabelDirección.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        LabelDirección.setForeground(new java.awt.Color(255, 255, 255));
        LabelDirección.setText("Dirección:");
        PanelPrincipal.add(LabelDirección, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 100, -1));

        LabelEdad.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        LabelEdad.setForeground(new java.awt.Color(255, 255, 255));
        LabelEdad.setText("Edad:");
        PanelPrincipal.add(LabelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 90, -1));

        LabelEstudios.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        LabelEstudios.setForeground(new java.awt.Color(255, 255, 255));
        LabelEstudios.setText("Estudios:");
        PanelPrincipal.add(LabelEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 90, -1));

        LabelAnosExp.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        LabelAnosExp.setForeground(new java.awt.Color(255, 255, 255));
        LabelAnosExp.setText("Años Exp:");
        PanelPrincipal.add(LabelAnosExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 100, -1));

        LabelHorasTrab.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        LabelHorasTrab.setForeground(new java.awt.Color(255, 255, 255));
        LabelHorasTrab.setText("Horas Trab:");
        PanelPrincipal.add(LabelHorasTrab, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 120, -1));

        LabelPagoHora.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        LabelPagoHora.setForeground(new java.awt.Color(255, 255, 255));
        LabelPagoHora.setText("Pago Hora:");
        PanelPrincipal.add(LabelPagoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 150, -1));

        LabelNumHijos.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        LabelNumHijos.setForeground(new java.awt.Color(255, 255, 255));
        LabelNumHijos.setText("Num Hijos:");
        PanelPrincipal.add(LabelNumHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 160, -1));

        TextoDireccion.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        TextoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoDireccionActionPerformed(evt);
            }
        });
        PanelPrincipal.add(TextoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 140, 30));

        TextoApellidos.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        TextoApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoApellidosActionPerformed(evt);
            }
        });
        PanelPrincipal.add(TextoApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 140, 30));

        TextoEdad.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        TextoEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoEdadActionPerformed(evt);
            }
        });
        PanelPrincipal.add(TextoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 140, 30));

        TextoAñosExp.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        TextoAñosExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoAñosExpActionPerformed(evt);
            }
        });
        PanelPrincipal.add(TextoAñosExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 140, 30));

        TextoHorasTrab.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        TextoHorasTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoHorasTrabActionPerformed(evt);
            }
        });
        PanelPrincipal.add(TextoHorasTrab, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 140, 30));

        TextoPagoHora.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        TextoPagoHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoPagoHoraActionPerformed(evt);
            }
        });
        PanelPrincipal.add(TextoPagoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 140, 30));

        TextoNumHijos.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        TextoNumHijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNumHijosActionPerformed(evt);
            }
        });
        PanelPrincipal.add(TextoNumHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 140, 30));

        TextoNombre.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        TextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNombreActionPerformed(evt);
            }
        });
        PanelPrincipal.add(TextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 140, 30));

        TextoDNI.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        TextoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoDNIActionPerformed(evt);
            }
        });
        PanelPrincipal.add(TextoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 140, 30));

        ComboEstudios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ComboEstudios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Universitario", "Técnico" }));
        PanelPrincipal.add(ComboEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 140, 30));

        BotonGrupo.add(BotonRedondoRetencion);
        BotonRedondoRetencion.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        BotonRedondoRetencion.setForeground(new java.awt.Color(255, 255, 255));
        BotonRedondoRetencion.setText("Retención 2.5%");
        BotonRedondoRetencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRedondoRetencionActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonRedondoRetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, -1));

        BotonGrupo.add(BotonRedondoHacienda);
        BotonRedondoHacienda.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        BotonRedondoHacienda.setForeground(new java.awt.Color(255, 255, 255));
        BotonRedondoHacienda.setText("Hacienda 1.5%");
        BotonRedondoHacienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRedondoHaciendaActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonRedondoHacienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, -1, -1));

        BotonProcesar.setBackground(new java.awt.Color(255, 0, 51));
        BotonProcesar.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        BotonProcesar.setForeground(new java.awt.Color(255, 255, 153));
        BotonProcesar.setText("PROCESAR");
        BotonProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProcesarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 170, 60));

        BotonSalir.setBackground(new java.awt.Color(0, 204, 102));
        BotonSalir.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("SALIR");
        BotonSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 140, 40));

        BotonMenu.setBackground(new java.awt.Color(51, 153, 255));
        BotonMenu.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        BotonMenu.setText("VOLVER AL MENÚ");
        BotonMenu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenuActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 200, 40));

        BotonLimpiar.setBackground(new java.awt.Color(0, 204, 102));
        BotonLimpiar.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        BotonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BotonLimpiar.setText("LIMPIAR");
        BotonLimpiar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 140, 40));

        BotonGuardar.setBackground(new java.awt.Color(0, 153, 153));
        BotonGuardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        BotonGuardar.setForeground(new java.awt.Color(51, 255, 204));
        BotonGuardar.setText("GUARDAR");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 100, 120, 40));

        TextoProcesado.setEditable(false);
        TextoProcesado.setBackground(new java.awt.Color(1, 73, 73));
        TextoProcesado.setColumns(20);
        TextoProcesado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TextoProcesado.setForeground(new java.awt.Color(0, 153, 153));
        TextoProcesado.setRows(5);
        PanelPrincipal.add(TextoProcesado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 490, 390));

        LabelFondo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\ProyectoInterfaces\\src\\main\\java\\es\\medac\\Imagenes\\fondoverde.jpg")); // NOI18N
        PanelPrincipal.add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoApellidosActionPerformed

    private void TextoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoDireccionActionPerformed

    private void TextoEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoEdadActionPerformed

    private void TextoAñosExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoAñosExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoAñosExpActionPerformed

    private void TextoHorasTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoHorasTrabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoHorasTrabActionPerformed

    private void TextoPagoHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoPagoHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoPagoHoraActionPerformed

    private void TextoNumHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNumHijosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNumHijosActionPerformed

    private void TextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNombreActionPerformed

    private void TextoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoDNIActionPerformed

    private void BotonRedondoRetencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRedondoRetencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRedondoRetencionActionPerformed

    private void BotonRedondoHaciendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRedondoHaciendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRedondoHaciendaActionPerformed

    private void BotonProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProcesarActionPerformed
        // TODO add your handling code here:
        Informe_Empleado e = new Informe_Empleado(TextoNombre.getText(), TextoApellidos.getText(), TextoDNI.getText(), TextoDireccion.getText(), 
                Integer.parseInt(TextoEdad.getText()), ComboEstudios.getSelectedItem().toString(), Integer.parseInt(TextoAñosExp.getText()), Integer.parseInt(TextoHorasTrab.getText()),
                Integer.parseInt(TextoPagoHora.getText()), Integer.parseInt(TextoNumHijos.getText()), BotonRedondoHacienda.getText(), BotonRedondoRetencion.getText());
        
        TextoProcesado.setText("");
        TextoProcesado.append(e.imprimirReciboPago());
    }//GEN-LAST:event_BotonProcesarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(InformeEmpleado.this, "¿Estas seguro que quieres cerrar la aplicación?",
                "Ventana salida.", JOptionPane.YES_NO_OPTION);
        if(opcion==JOptionPane.YES_OPTION){
            dispose();
        }    
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
         TextoNombre.setText("");
         TextoApellidos.setText("");
         TextoDNI.setText("");
         TextoDireccion.setText("");
         TextoEdad.setText("");
         TextoAñosExp.setText("");
         TextoHorasTrab.setText("");
         TextoPagoHora.setText("");
         TextoNumHijos.setText("");
         TextoProcesado.setText("");
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenuActionPerformed
        this.setVisible(false);
        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);
    }//GEN-LAST:event_BotonMenuActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        
        String textoAlerta = "\n\n\n\n\n\nPara guardar el documento, \nprimero deben de haberse procesado los datos.";
        if(!TextoProcesado.getText().equals("") && !TextoProcesado.getText().equals(textoAlerta)){
            String ruta = "";
            // Creamos un JFileChooser, es una ventana para seleccionar un fichero
            JFileChooser fileChooser = new JFileChooser();
            // Hacemos que aparezca un fichero por defecto
            fileChooser.setSelectedFile(new File("InformeEmpleado.txt"));
            // Cambiamos el título de la ventana
            fileChooser.setDialogTitle("Selecciona un fichero");
            // Mostramos la ventana de seleccionar el fichero
            int resultado = fileChooser.showSaveDialog(null);
            // Si se ha seleccionado un fichero, si se pulsa cancelar no se ejecuta
            if (resultado == JFileChooser.APPROVE_OPTION) {
                // Obtenemos la ruta del fichero
                ruta = fileChooser.getSelectedFile().getAbsolutePath();
                }
            try {
                File f = new File(ruta);
                FileWriter fw = new FileWriter(f);
                fw.write(TextoProcesado.getText());
                fw.close();
            } catch (IOException e) {
                System.out.println("Error a la hora de guardar el informe. " + e);
            }   
        }else{
            TextoProcesado.setText(textoAlerta);
        }
        
        
    }//GEN-LAST:event_BotonGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InformeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformeEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformeEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BotonGrupo;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonMenu;
    private javax.swing.JButton BotonProcesar;
    private javax.swing.JRadioButton BotonRedondoHacienda;
    private javax.swing.JRadioButton BotonRedondoRetencion;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JComboBox<String> ComboEstudios;
    private javax.swing.JLabel LabelAnosExp;
    private javax.swing.JLabel LabelApellidos;
    private javax.swing.JLabel LabelDNI;
    private javax.swing.JLabel LabelDirección;
    private javax.swing.JLabel LabelEdad;
    private javax.swing.JLabel LabelEstudios;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel LabelHorasTrab;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelNumHijos;
    private javax.swing.JLabel LabelPagoHora;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel PanelColorTitulo;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JTextField TextoApellidos;
    private javax.swing.JTextField TextoAñosExp;
    private javax.swing.JTextField TextoDNI;
    private javax.swing.JTextField TextoDireccion;
    private javax.swing.JTextField TextoEdad;
    private javax.swing.JTextField TextoHorasTrab;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TextoNumHijos;
    private javax.swing.JTextField TextoPagoHora;
    private javax.swing.JTextArea TextoProcesado;
    // End of variables declaration//GEN-END:variables
}
