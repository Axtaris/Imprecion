
package com.printing.vista;

import com.printing.modelo.*;
import javax.swing.JOptionPane;
import com.printing.helpers.CargarConfig;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Diego
 */
public class Ventana_1 extends javax.swing.JFrame {

   CargarConfig config; 
    
    public Ventana_1() {
        config = new CargarConfig();
        
        Image icon = new ImageIcon(getClass().getResource("/com/printing/recursos/Icon/3d.jpg")).getImage();
        setIconImage(icon);
        
        initComponents();
        campoTextoLongitud.setEnabled(false);
        campoTextoPeso.setEnabled(false);
        campoMaterialSPeso.setEnabled(false);
        campoMateriaSLongitud.setEnabled(false);
        radioPesoS.setEnabled(false);
        radioLongitudS.setEnabled(false);
        botonCalcular.setEnabled(false);
        botonGuardar.setEnabled(false);
        config.Cargar2();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        botonGuardar = new javax.swing.JButton();
        botonCalcular = new javax.swing.JButton();
        botonConfig = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        radiologitud = new javax.swing.JRadioButton();
        radioPeso = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        campoTextoPeso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoTextoLongitud = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        radioPLA = new javax.swing.JRadioButton();
        radioABS = new javax.swing.JRadioButton();
        checkMaterialS = new javax.swing.JCheckBox();
        campoMaterialSPeso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        comboHora = new javax.swing.JComboBox();
        comboMinuto = new javax.swing.JComboBox();
        comboSegundo = new javax.swing.JComboBox();
        comboDia = new javax.swing.JComboBox();
        radioPesoS = new javax.swing.JRadioButton();
        radioLongitudS = new javax.swing.JRadioButton();
        campoMateriaSLongitud = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuGuardar = new javax.swing.JMenuItem();
        MenuCalcular = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel6.setText("jLabel6");

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonCalcular.setText("Calcular");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        botonConfig.setText("Configuracion");
        botonConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfigActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculin");

        radiologitud.setText("Calcular Por Longitud");
        radiologitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiologitudActionPerformed(evt);
            }
        });

        radioPeso.setText("Calcular Por Peso");
        radioPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPesoActionPerformed(evt);
            }
        });

        jLabel2.setText("Peso");

        campoTextoPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTextoPesoKeyTyped(evt);
            }
        });

        jLabel3.setText("Longitud");

        campoTextoLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTextoLongitudKeyTyped(evt);
            }
        });

        jLabel4.setText("Gr");

        jLabel5.setText("Tipo De Material");

        radioPLA.setText("PLA");
        radioPLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPLAActionPerformed(evt);
            }
        });

        radioABS.setText("ABS");
        radioABS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioABSActionPerformed(evt);
            }
        });

        checkMaterialS.setText("Material De Soporte");
        checkMaterialS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMaterialSActionPerformed(evt);
            }
        });

        campoMaterialSPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoMaterialSPesoKeyTyped(evt);
            }
        });

        jLabel8.setText("Gr");

        jLabel9.setText("Tiempo De Fabricacion");

        jLabel12.setText("H");

        jLabel13.setText("M");

        jLabel14.setText("S");

        comboHora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

        comboMinuto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));

        comboSegundo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));

        comboDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));

        radioPesoS.setText("peso");
        radioPesoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPesoSActionPerformed(evt);
            }
        });

        radioLongitudS.setText("Logitud");
        radioLongitudS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLongitudSActionPerformed(evt);
            }
        });

        campoMateriaSLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoMateriaSLongitudKeyTyped(evt);
            }
        });

        jLabel10.setText("mm");

        jLabel11.setText("mm");

        jLabel7.setText("D");

        jLabel15.setText("Ver. Beta 1.2.1");

        jMenu1.setText("Archivo");

        MenuGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        MenuGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/printing/recursos/Icon/disquetes-excepto-icono-7120-64.png"))); // NOI18N
        MenuGuardar.setText("Guardar");
        jMenu1.add(MenuGuardar);

        MenuCalcular.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        MenuCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/printing/recursos/Icon/icono_calculadora.gif"))); // NOI18N
        MenuCalcular.setText("Calcular");
        jMenu1.add(MenuCalcular);
        jMenu1.add(jSeparator1);

        MenuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MenuSalir.setText("Salir");
        MenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(MenuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem1.setText("Acerca de");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkMaterialS)
                                    .addComponent(radiologitud)
                                    .addComponent(radioPeso)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radioABS)
                                            .addComponent(radioPLA)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(66, 66, 66)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(campoTextoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(campoTextoLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel11))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(140, 140, 140))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(radioLongitudS)
                                                    .addComponent(radioPesoS))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(campoMaterialSPeso)
                                                    .addComponent(campoMateriaSLongitud, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(botonConfig)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(botonCalcular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonGuardar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addGap(76, 76, 76)))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboHora, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioPeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radiologitud)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoTextoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoTextoLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioPLA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioABS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkMaterialS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioPesoS)
                    .addComponent(campoMaterialSPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioLongitudS)
                    .addComponent(campoMateriaSLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(comboMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel7)
                    .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonCalcular)
                    .addComponent(botonConfig))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radiologitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiologitudActionPerformed
        estaVacio();
        if (radiologitud.isSelected()==true)
        {
            radioPeso.setSelected(false);
            campoTextoPeso.setEnabled(false);
            campoTextoLongitud.setEnabled(true);
            
        }
    }//GEN-LAST:event_radiologitudActionPerformed

    private void radioPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPesoActionPerformed
        estaVacio();
        if (radioPeso.isSelected()==true)
        {
            radiologitud.setSelected(false);
            campoTextoPeso.setEnabled(true);
            campoTextoLongitud.setEnabled(false);
        }
    }//GEN-LAST:event_radioPesoActionPerformed

    private void campoTextoPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoPesoKeyTyped
        soloDigitos(evt);
        estaVacio();
    }//GEN-LAST:event_campoTextoPesoKeyTyped

    private void campoTextoLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoLongitudKeyTyped
        soloDigitos(evt);
        estaVacio();
    }//GEN-LAST:event_campoTextoLongitudKeyTyped

    private void campoMaterialSPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoMaterialSPesoKeyTyped
        soloDigitos(evt);
        estaVacio();
    }//GEN-LAST:event_campoMaterialSPesoKeyTyped

    private void radioPLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPLAActionPerformed
        estaVacio();
        if (radioPLA.isSelected()==true)
        {
            radioABS.setSelected(false);
        }
    }//GEN-LAST:event_radioPLAActionPerformed

    private void radioABSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioABSActionPerformed
        estaVacio();
        if (radioABS.isSelected()==true)
        {
            radioPLA.setSelected(false);
        }
    }//GEN-LAST:event_radioABSActionPerformed

    private void checkMaterialSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMaterialSActionPerformed
        materialSoporte soporte = new materialSoporte();
        estaVacio();   
        if (checkMaterialS.isSelected()==true)
        {
            soporte.setUsoSoporte((true));
            radioPesoS.setEnabled(true);
            radioLongitudS.setEnabled(true);    
        }
        if (checkMaterialS.isSelected()==false)
        {
            soporte.setUsoSoporte(false);
            radioPesoS.setEnabled(false);
            radioLongitudS.setEnabled(false);      
        }
    }//GEN-LAST:event_checkMaterialSActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        if(radioPeso.isSelected()==true&&radiologitud.isSelected()==false)porPeso();
        if(radiologitud.isSelected()==true&&radioPeso.isSelected()==false)porLongitud();
    }//GEN-LAST:event_botonCalcularActionPerformed

    private void radioLongitudSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLongitudSActionPerformed
        estaVacio();
        if (radioLongitudS.isSelected()==true)
        {
            radioPesoS.setSelected(false);
            campoMateriaSLongitud.setEnabled(true);
            campoMaterialSPeso.setEnabled(false);
        }
    }//GEN-LAST:event_radioLongitudSActionPerformed

    private void radioPesoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPesoSActionPerformed
        estaVacio();
        if (radioPesoS.isSelected()==true)
        {
            radioLongitudS.setSelected(false);
            campoMateriaSLongitud.setEnabled(false);
            campoMaterialSPeso.setEnabled(true);
        }
    }//GEN-LAST:event_radioPesoSActionPerformed

    private void campoMateriaSLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoMateriaSLongitudKeyTyped
        soloDigitos(evt);
        estaVacio();
    }//GEN-LAST:event_campoMateriaSLongitudKeyTyped

    private void botonConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfigActionPerformed
        Config confg = new Config(this, rootPaneCheckingEnabled);
        confg.setLocationRelativeTo(this);
        confg.setTitle("Configuracion");
        confg.setVisible(true);
    }//GEN-LAST:event_botonConfigActionPerformed

    private void MenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuSalirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        About about = new About(this, rootPaneCheckingEnabled);
        about.setLocationRelativeTo(this);
        about.setTitle("Acerca de");
        about.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    //permite solo a digitos escribirse en los campos de texto
    public void soloDigitos(java.awt.event.KeyEvent evt)
    {
        char c = evt.getKeyChar();
            if(Character.isLetter(c))
            {
                evt.consume();
            }
    }
    //valida que todos los campos esten llenos antes de permitir guardar o calcular
    private void estaVacio(){
        if(checkMaterialS.isSelected()==false){
            if(radioPeso.isSelected()==true && radioLongitudS.isSelected()==false){
                botonCalcular.setEnabled(false);
                botonGuardar.setEnabled(false);
                if(campoTextoPeso.getText().isEmpty()==false){
                    if(radioABS.isSelected()==true || radioPLA.isSelected()==true)
                    {
                        botonCalcular.setEnabled(true);
                        botonGuardar.setEnabled(true);
                    }
                    else
                    {
                       botonCalcular.setEnabled(false);
                       botonGuardar.setEnabled(false); 
                    }
                }
                
            }
            if(radioPeso.isSelected()==false && radioLongitudS.isSelected()==true){ 
                botonCalcular.setEnabled(false);
                botonGuardar.setEnabled(false);
                if(campoTextoLongitud.getText().isEmpty()==false){
                    if(radioABS.isSelected()==true || radioPLA.isSelected()==true)
                    {
                        botonCalcular.setEnabled(true);
                        botonGuardar.setEnabled(true);
                    }
                    else
                    {
                       botonCalcular.setEnabled(false);
                       botonGuardar.setEnabled(false); 
                    }                    
                }          
            }
        }
        if(checkMaterialS.isSelected()==true)
        {
            
        }
        
    } 
    private void porPeso()
    {
      materialSoporte soporte = new materialSoporte();  
      if(soporte.isUsoSoporte()==true){
          soporte.setPeso(Double.parseDouble(campoTextoPeso.getText()));
          if(radioABS.isSelected())soporte.setTipoMaterial("ABS");
          if(radioPLA.isSelected())soporte.setTipoMaterial("PLA");
          if(radioPesoS.isSelected())soporte.setPesoGrMaterialSoporte(Double.parseDouble(campoMaterialSPeso.getText()));
          if(radioLongitudS.isSelected())soporte.setPesoGrMaterialSoporte(Double.parseDouble(campoMateriaSLongitud.getText()));
          soporte.setDia(comboDia.getSelectedIndex());
          soporte.setHora(comboHora.getSelectedIndex());
          soporte.setMinuto(comboMinuto.getSelectedIndex());
          soporte.setSegundo(comboSegundo.getSelectedIndex());
          soporte.setTipoMaterialSoprote("PLA");
          JOptionPane.showMessageDialog(null, soporte.toString());
      }
      else{
          porPeso peso = new porPeso();
          peso.setPeso(Double.parseDouble(campoTextoPeso.getText()));
          if(radioABS.isSelected())peso.setTipoMaterial("ABS");
          if(radioPLA.isSelected())peso.setTipoMaterial("PLA");
          peso.setDia(comboDia.getSelectedIndex());
          peso.setHora(comboHora.getSelectedIndex());
          peso.setMinuto(comboMinuto.getSelectedIndex());
          peso.setSegundo(comboSegundo.getSelectedIndex());
          JOptionPane.showMessageDialog(null, peso.toString());
      }
    }   
    private void porLongitud()
    {
     materialSoporte soporte = new materialSoporte();  
      if(soporte.isUsoSoporte()==true){
          porLongitud longitud = new porLongitud();
          longitud.setLogitud(Double.parseDouble(campoTextoPeso.getText()));
          if(radioABS.isSelected())soporte.setTipoMaterial("ABS");
          if(radioPLA.isSelected())soporte.setTipoMaterial("PLA");
          if(radioPesoS.isSelected())soporte.setPesoGrMaterialSoporte(Double.parseDouble(campoMaterialSPeso.getText()));
          if(radioLongitudS.isSelected())soporte.setPesoGrMaterialSoporte(Double.parseDouble(campoMateriaSLongitud.getText()));
          soporte.setDia(comboDia.getSelectedIndex());
          soporte.setHora(comboHora.getSelectedIndex());
          soporte.setMinuto(comboMinuto.getSelectedIndex());
          soporte.setSegundo(comboSegundo.getSelectedIndex());
          soporte.setTipoMaterialSoprote("PLA");
          JOptionPane.showMessageDialog(null, longitud.toString());
      }
      else{
          porLongitud longitud = new porLongitud();
          longitud.setLogitud(Double.parseDouble(campoTextoLongitud.getText()));
          if(radioABS.isSelected())longitud.setTipoMaterial("ABS");
          if(radioPLA.isSelected())longitud.setTipoMaterial("PLA");
          longitud.setDia(comboDia.getSelectedIndex());
          longitud.setHora(comboHora.getSelectedIndex());
          longitud.setMinuto(comboMinuto.getSelectedIndex());
          longitud.setSegundo(comboSegundo.getSelectedIndex());
          JOptionPane.showMessageDialog(null, longitud.toString());
      }   
    }    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Ventana_1().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCalcular;
    private javax.swing.JMenuItem MenuGuardar;
    private javax.swing.JMenuItem MenuSalir;
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonConfig;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoMateriaSLongitud;
    private javax.swing.JTextField campoMaterialSPeso;
    private javax.swing.JTextField campoTextoLongitud;
    private javax.swing.JTextField campoTextoPeso;
    private javax.swing.JCheckBox checkMaterialS;
    private javax.swing.JComboBox comboDia;
    private javax.swing.JComboBox comboHora;
    private javax.swing.JComboBox comboMinuto;
    private javax.swing.JComboBox comboSegundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JRadioButton radioABS;
    private javax.swing.JRadioButton radioLongitudS;
    private javax.swing.JRadioButton radioPLA;
    private javax.swing.JRadioButton radioPeso;
    private javax.swing.JRadioButton radioPesoS;
    private javax.swing.JRadioButton radiologitud;
    // End of variables declaration//GEN-END:variables
}