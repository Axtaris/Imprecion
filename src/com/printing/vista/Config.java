/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.printing.vista;
import com.printing.helpers.GestionDeconfiguracion;
import com.printing.modelo.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Config extends javax.swing.JDialog{

    /**
     * Creates new form Config
     */
    
    GestionDeconfiguracion configuracion;
    public Config(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        //configuracion icono
        Image icon = new ImageIcon(getClass().getResource("/com/printing/recursos/Icon/3d.jpg")).getImage();
        setIconImage(icon);
        
        initComponents();
        botonAplicar.setEnabled(false);
        configuracion=new GestionDeconfiguracion();
        //Carga Configuracion
        campoKiloABS.setText(configuracion.getConfiguraciones().getProperty("valor_kilo_filamento_ABS"));
        campoKiloPLA.setText(configuracion.getConfiguraciones().getProperty("valor_kilo_filamento_PLA"));
        campoValoKwh.setText(configuracion.getConfiguraciones().getProperty("valor_KWH"));
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonAplicar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoKiloABS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoKiloPLA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        etiquetaMmABS = new javax.swing.JLabel();
        etiquetaMmPLA = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        etiquetaGrABS = new javax.swing.JLabel();
        etiquetaGrPLA = new javax.swing.JLabel();
        labelxx = new javax.swing.JLabel();
        campoValoKwh = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Configuracion");

        botonAplicar.setText("Aplicar");
        botonAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAplicarActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor Del Kilo De Filamento ABS");

        campoKiloABS.setText("0");
        campoKiloABS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoKiloABSFocusGained(evt);
            }
        });
        campoKiloABS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoKiloABSMouseClicked(evt);
            }
        });
        campoKiloABS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoKiloABSActionPerformed(evt);
            }
        });
        campoKiloABS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoKiloABSKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoKiloABSKeyTyped(evt);
            }
        });

        jLabel4.setText("Valor Milimetro");

        jLabel5.setText("Valor Gramo");

        jLabel6.setText("Valor Del Kilo De Filamento PLA");

        campoKiloPLA.setText("0");
        campoKiloPLA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoKiloPLAMouseClicked(evt);
            }
        });
        campoKiloPLA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoKiloPLAFocusGained(evt);
            }
        });
        campoKiloPLA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoKiloPLAKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoKiloPLAKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("ABS");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("PLA");

        etiquetaMmABS.setText("0");

        etiquetaMmPLA.setText("0");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("ABS");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("PLA");

        etiquetaGrABS.setText("0");

        etiquetaGrPLA.setText("0");

        labelxx.setText("Valor Del Kwh");

        campoValoKwh.setText("0");
        campoValoKwh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoValoKwhMouseClicked(evt);
            }
        });
        campoValoKwh.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoValoKwhFocusGained(evt);
            }
        });
        campoValoKwh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoValoKwhKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoValoKwhKeyTyped(evt);
            }
        });

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoKiloPLA))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etiquetaMmABS)
                                            .addComponent(etiquetaMmPLA)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(etiquetaGrABS))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(etiquetaGrPLA)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelxx)
                        .addGap(86, 86, 86)
                        .addComponent(campoValoKwh))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoKiloABS))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 51, Short.MAX_VALUE)
                        .addComponent(botonAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoKiloABS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoKiloPLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(etiquetaMmABS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(etiquetaMmPLA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(etiquetaGrABS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(etiquetaGrPLA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelxx)
                    .addComponent(campoValoKwh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar)
                    .addComponent(botonCancelar)
                    .addComponent(botonAplicar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAplicarActionPerformed
        porPeso peso = new porPeso();
        porLongitud longitud = new porLongitud();
        peso.setPrecioGrExtruidoABS(Double.parseDouble(etiquetaGrABS.getText()));
        peso.setPrecioGrExtruidoPLA(Double.parseDouble(etiquetaGrPLA.getText()));
        longitud.setPrecioMmExtruidoABS(Double.parseDouble(etiquetaMmABS.getText()));
        longitud.setPrecioMmExtruidoPLA(Double.parseDouble(etiquetaMmPLA.getText()));
        peso.setValorKwh(Double.parseDouble(campoValoKwh.getText()));       
    }//GEN-LAST:event_botonAplicarActionPerformed

    private void campoKiloABSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoKiloABSKeyTyped
        
        Ventana_1 ventana = new Ventana_1();
        ventana.soloDigitos(evt);       
        if(campoKiloABS.getText().isEmpty())campoKiloABS.setText("0");
        calcularABS();
    }//GEN-LAST:event_campoKiloABSKeyTyped

    private void campoKiloPLAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoKiloPLAKeyTyped
        Ventana_1 ventana = new Ventana_1();
        ventana.soloDigitos(evt);
        if(campoKiloPLA.getText().isEmpty())campoKiloPLA.setText("0");
        calcularPLA();
    }//GEN-LAST:event_campoKiloPLAKeyTyped

    private void campoValoKwhKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoValoKwhKeyTyped
        Ventana_1 ventana = new Ventana_1();
        ventana.soloDigitos(evt);
    }//GEN-LAST:event_campoValoKwhKeyTyped

    private void campoKiloABSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoKiloABSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoKiloABSActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        porPeso peso = new porPeso();
        porLongitud longitud = new porLongitud();
        peso.setPrecioGrExtruidoABS(Double.parseDouble(etiquetaGrABS.getText()));
        peso.setPrecioGrExtruidoPLA(Double.parseDouble(etiquetaGrPLA.getText()));
        longitud.setPrecioMmExtruidoABS(Double.parseDouble(etiquetaMmABS.getText()));
        longitud.setPrecioMmExtruidoPLA(Double.parseDouble(etiquetaMmPLA.getText()));
        peso.setValorKwh(Double.parseDouble(campoValoKwh.getText()));
        
        boolean resp=configuracion.grabar(campoKiloABS.getText(), campoKiloPLA.getText(), campoValoKwh.getText());
        
        JOptionPane.showMessageDialog(null, (resp)?"Almacenado con exito!!":"Se ha presentado un probelma");
        this.dispose();
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void campoKiloABSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoKiloABSKeyPressed
        esPrecionado(evt);
    }//GEN-LAST:event_campoKiloABSKeyPressed

    private void campoKiloPLAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoKiloPLAKeyPressed
        esPrecionado(evt);
    }//GEN-LAST:event_campoKiloPLAKeyPressed

    private void campoValoKwhKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoValoKwhKeyPressed
        esPrecionado(evt);
    }//GEN-LAST:event_campoValoKwhKeyPressed

    private void campoKiloABSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoKiloABSFocusGained
        campoKiloABS.setSelectionStart(0);
    }//GEN-LAST:event_campoKiloABSFocusGained

    private void campoKiloPLAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoKiloPLAFocusGained
        campoKiloPLA.setSelectionStart(0);
    }//GEN-LAST:event_campoKiloPLAFocusGained

    private void campoValoKwhFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoValoKwhFocusGained
        campoValoKwh.setSelectionStart(0);
    }//GEN-LAST:event_campoValoKwhFocusGained

    private void campoKiloABSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoKiloABSMouseClicked
        campoKiloABS.setSelectionStart(0);
    }//GEN-LAST:event_campoKiloABSMouseClicked

    private void campoKiloPLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoKiloPLAMouseClicked
        campoKiloPLA.setSelectionStart(0);
    }//GEN-LAST:event_campoKiloPLAMouseClicked

    private void campoValoKwhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoValoKwhMouseClicked
        campoValoKwh.setSelectionStart(0);
    }//GEN-LAST:event_campoValoKwhMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        calcularABS();
        calcularPLA();
    }//GEN-LAST:event_formWindowOpened
            private void calcularABS()
    {
        double x = Double.parseDouble(campoKiloABS.getText());
               x = x / 1000;
        double z = x / 360;     //precio milimetro por gramo     
        String y = Double.toString(x);
        String w = Double.toString(z);
        etiquetaGrABS.setText(y);
        etiquetaMmABS.setText(w);
    }
    
    private void calcularPLA()
    {
        double x = Double.parseDouble(campoKiloPLA.getText());
               x = x / 1000;
        double z = x / 360;     //precio milimetro por gramo
        String y = Double.toString(x);
        String w = Double.toString(z);
        etiquetaGrPLA.setText(y);
        etiquetaMmPLA.setText(w);
    }
             
    private void esPrecionado(java.awt.event.KeyEvent evt)
    {
      char c = evt.getKeyChar();
        if(!Character.isDigit(c))botonAplicar.setEnabled(true);
            else botonAplicar.setEnabled(false);  
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
//            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Config dialog = new Config(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAplicar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField campoKiloABS;
    private javax.swing.JTextField campoKiloPLA;
    private javax.swing.JTextField campoValoKwh;
    private javax.swing.JLabel etiquetaGrABS;
    private javax.swing.JLabel etiquetaGrPLA;
    private javax.swing.JLabel etiquetaMmABS;
    private javax.swing.JLabel etiquetaMmPLA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelxx;
    // End of variables declaration//GEN-END:variables
}
