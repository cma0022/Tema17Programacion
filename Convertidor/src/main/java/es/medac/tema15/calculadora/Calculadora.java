/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.medac.tema15.calculadora;

/**
 *
 * @author Usuario
 */
public class Calculadora extends javax.swing.JFrame {

    double num1 = 0.0;
    double num2 = 0.0;
    String operacion = "";
    int contPunto = 0;
    
    public Calculadora(){
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonRestar = new javax.swing.JButton();
        botonMultiplicar = new javax.swing.JButton();
        botonSumar = new javax.swing.JButton();
        botonDividir = new javax.swing.JButton();
        botonExponencial = new javax.swing.JButton();
        botonAC = new javax.swing.JButton();
        botonRaiz = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        textoResultado = new javax.swing.JTextField();
        botonPunto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        boton1.setBackground(new java.awt.Color(204, 204, 204));
        boton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton1.setText("1");
        boton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(204, 204, 204));
        boton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton2.setText("2");
        boton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton3.setBackground(new java.awt.Color(204, 204, 204));
        boton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton3.setText("3");
        boton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton4.setBackground(new java.awt.Color(204, 204, 204));
        boton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton4.setText("4");
        boton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton5.setBackground(new java.awt.Color(204, 204, 204));
        boton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton5.setText("5");
        boton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton6.setBackground(new java.awt.Color(204, 204, 204));
        boton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton6.setText("6");
        boton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton7.setBackground(new java.awt.Color(204, 204, 204));
        boton7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton7.setText("7");
        boton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton8.setBackground(new java.awt.Color(204, 204, 204));
        boton8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton8.setText("8");
        boton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton9.setBackground(new java.awt.Color(204, 204, 204));
        boton9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton9.setText("9");
        boton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        boton0.setBackground(new java.awt.Color(204, 204, 204));
        boton0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton0.setText("0");
        boton0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });

        botonRestar.setBackground(new java.awt.Color(102, 102, 102));
        botonRestar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonRestar.setForeground(new java.awt.Color(255, 255, 255));
        botonRestar.setText("-");
        botonRestar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });

        botonMultiplicar.setBackground(new java.awt.Color(102, 102, 102));
        botonMultiplicar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        botonMultiplicar.setText("x");
        botonMultiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicarActionPerformed(evt);
            }
        });

        botonSumar.setBackground(new java.awt.Color(102, 102, 102));
        botonSumar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonSumar.setForeground(new java.awt.Color(255, 255, 255));
        botonSumar.setText("+");
        botonSumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumarActionPerformed(evt);
            }
        });

        botonDividir.setBackground(new java.awt.Color(102, 102, 102));
        botonDividir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonDividir.setForeground(new java.awt.Color(255, 255, 255));
        botonDividir.setText("/");
        botonDividir.setToolTipText("");
        botonDividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDividirActionPerformed(evt);
            }
        });

        botonExponencial.setBackground(new java.awt.Color(102, 102, 102));
        botonExponencial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonExponencial.setForeground(new java.awt.Color(255, 255, 255));
        botonExponencial.setText("^");
        botonExponencial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonExponencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExponencialActionPerformed(evt);
            }
        });

        botonAC.setBackground(new java.awt.Color(102, 102, 102));
        botonAC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonAC.setForeground(new java.awt.Color(255, 255, 255));
        botonAC.setText("AC");
        botonAC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonACActionPerformed(evt);
            }
        });

        botonRaiz.setBackground(new java.awt.Color(102, 102, 102));
        botonRaiz.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonRaiz.setForeground(new java.awt.Color(255, 255, 255));
        botonRaiz.setText("√");
        botonRaiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizActionPerformed(evt);
            }
        });

        botonIgual.setBackground(new java.awt.Color(0, 51, 102));
        botonIgual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonIgual.setForeground(new java.awt.Color(255, 255, 255));
        botonIgual.setText("=");
        botonIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });

        textoResultado.setEditable(false);
        textoResultado.setBackground(new java.awt.Color(178, 195, 255));
        textoResultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textoResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        botonPunto.setBackground(new java.awt.Color(102, 102, 102));
        botonPunto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonPunto.setForeground(new java.awt.Color(255, 255, 255));
        botonPunto.setText(".");
        botonPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoResultado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonRaiz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonPunto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonExponencial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAC, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonMultiplicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(textoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(botonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonExponencial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        // TODO add your handling code here:
        textoResultado.setText(textoResultado.getText()+"2");
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        // TODO add your handling code here:
        textoResultado.setText(textoResultado.getText()+"3");
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        // TODO add your handling code here:
        textoResultado.setText(textoResultado.getText()+"1");
        
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        // TODO add your handling code here:
        textoResultado.setText(textoResultado.getText()+"7");
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        // TODO add your handling code here:
        textoResultado.setText(textoResultado.getText()+"8");
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        // TODO add your handling code here:
        textoResultado.setText(textoResultado.getText()+"6");
    }//GEN-LAST:event_boton6ActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
        // TODO add your handling code here:
        contPunto = 0;

        if(num1 != 0){
            operacion = "-";
            textoResultado.setText(num1+" - ");
        }else if(!textoResultado.getText().equals("")){
            num1 = Double.parseDouble(textoResultado.getText());
            operacion = "-";
            textoResultado.setText(num1+" - ");
        }
    }//GEN-LAST:event_botonRestarActionPerformed

    private void botonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicarActionPerformed
        // TODO add your handling code here:
        contPunto = 0;
        
        if(num1 != 0){
            operacion = "*";
            textoResultado.setText(num1+" * ");
        }else if(!textoResultado.getText().equals("")){
            num1 = Double.parseDouble(textoResultado.getText());
            operacion = "*";
            textoResultado.setText(num1+" * ");
       }
    }//GEN-LAST:event_botonMultiplicarActionPerformed

    private void botonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumarActionPerformed
        // TODO add your handling code here:
        contPunto = 0;
        
        if(num1 != 0){
            operacion = "+";
            textoResultado.setText(num1+" + ");
        }else if(!textoResultado.getText().equals("")){
            num1 = Double.parseDouble(textoResultado.getText());
            operacion = "+";
            textoResultado.setText(num1+" + ");
       }
    }//GEN-LAST:event_botonSumarActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        // TODO add your handling code here:
        textoResultado.setText(textoResultado.getText()+"4");
    }//GEN-LAST:event_boton4ActionPerformed

    private void botonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDividirActionPerformed
        // TODO add your handling code here:
        contPunto = 0;
        
        if(num1 != 0){
            operacion = "/";
            textoResultado.setText(num1+" / ");
        }else if(!textoResultado.getText().equals("")){
            num1 = Double.parseDouble(textoResultado.getText());
            operacion = "/";
            textoResultado.setText(num1+" / ");
       }
    }//GEN-LAST:event_botonDividirActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        // TODO add your handling code here:
        textoResultado.setText(textoResultado.getText()+"9");
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        // TODO add your handling code here:
        textoResultado.setText(textoResultado.getText()+"5");
    }//GEN-LAST:event_boton5ActionPerformed

    private void botonExponencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExponencialActionPerformed
        // TODO add your handling code here:
        contPunto = 0;
        
        if(num1 != 0){
            operacion = "^";
            textoResultado.setText(num1+" ^ ");
        }else if(!textoResultado.getText().equals("")){
            num1 = Double.parseDouble(textoResultado.getText());
            operacion = "^";
            textoResultado.setText(num1+" ^ ");
       }
    }//GEN-LAST:event_botonExponencialActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        // TODO add your handling code here:
        textoResultado.setText(textoResultado.getText()+"0");
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonACActionPerformed
        // TODO add your handling code here:
        textoResultado.setText("");
        num1 = 0;
        num2 = 0;
        operacion = "";
        contPunto = 0;
    }//GEN-LAST:event_botonACActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        // TODO add your handling code here:
        contPunto = 0;
        
        String sacarEnteros = "";
        char [] enteros = textoResultado.getText().toCharArray();
        for(int i = 0; i < enteros.length; i++){
            if(Character.isDigit(enteros[i]) || enteros[i] == '.'){
                sacarEnteros += enteros[i];
            }else{
                sacarEnteros = "";
            }
        }       
        num2 = Double.parseDouble(sacarEnteros);

        
        if(operacion.equals("+")){
            textoResultado.setText(num1+" + "+num2+" = "+(num1+num2));
            num1 = num1+num2;
        }else if(operacion.equals("-")){
            textoResultado.setText(num1+" - "+num2+" = "+(num1-num2));
            num1 = num1-num2;
        }else if(operacion.equals("*")){
            textoResultado.setText(num1+" * "+num2+" = "+(num1*num2));
            num1 = num1*num2;
        }else if(operacion.equals("/")){
            textoResultado.setText(num1+" / "+num2+" = "+(num1/num2));
            num1 = num1/num2;
        }else if(operacion.equals("R")){
            textoResultado.setText("√"+num1+" = "+String.format("%.2f",Math.sqrt(num1)));
            num1 = Math.sqrt(num1);
        }else if(operacion.equals("^")){
            textoResultado.setText(num1+" ^ "+num2+" = "+String.format("%.2f",Math.pow(num1, num2)));
            num1 = Math.pow(num1, num2);
        }
        
        
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizActionPerformed
        // TODO add your handling code here:
        contPunto = 0;
        
        if(num1 != 0){
            operacion = "R";
            textoResultado.setText("√"+num1);
        }else if(!textoResultado.getText().equals("")){
            num1 = Double.parseDouble(textoResultado.getText());
            operacion = "R";
            textoResultado.setText("√"+num1);
       }
    }//GEN-LAST:event_botonRaizActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        // TODO add your handling code here:
         if(contPunto == 0){
            contPunto++;
            textoResultado.setText(textoResultado.getText()+".");
        }
    }//GEN-LAST:event_botonPuntoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonAC;
    private javax.swing.JButton botonDividir;
    private javax.swing.JButton botonExponencial;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMultiplicar;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonRaiz;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonSumar;
    private javax.swing.JTextField textoResultado;
    // End of variables declaration//GEN-END:variables
}
