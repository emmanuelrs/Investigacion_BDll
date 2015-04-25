/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGrafica;

import CapaGrafica.GUI;
import java.util.ArrayList;

/**
 *
 * @author Kenneth
 */
public class GuiDetalles extends javax.swing.JPanel {

    GUI frame;
    /**
     * Creates new form GuiDetalles
     * @param framePrincipal
     */
    public GuiDetalles(GUI framePrincipal) {
        frame = framePrincipal;
        initComponents();
        
        this.progRate.setValue(80);
        this.progRate.setString("4");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescrip = new javax.swing.JTextArea();
        btnInicio = new javax.swing.JButton();
        lblCat = new javax.swing.JLabel();
        lblRate = new javax.swing.JLabel();
        progRate = new javax.swing.JProgressBar();

        jLayeredPane1.setBackground(new java.awt.Color(51, 51, 51));
        jLayeredPane1.setOpaque(true);

        lblNombre.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");

        txtDescrip.setColumns(20);
        txtDescrip.setRows(5);
        txtDescrip.setText("Descripción:");
        jScrollPane1.setViewportView(txtDescrip);

        btnInicio.setBackground(new java.awt.Color(0, 102, 102));
        btnInicio.setText("Inicio");
        btnInicio.setBorderPainted(false);
        btnInicio.setFocusable(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        lblCat.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblCat.setForeground(new java.awt.Color(255, 255, 255));
        lblCat.setText("Categorías:");

        lblRate.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblRate.setForeground(new java.awt.Color(255, 255, 255));
        lblRate.setText("Rate:");

        progRate.setForeground(new java.awt.Color(0, 153, 153));
        progRate.setBorderPainted(false);
        progRate.setString("");
        progRate.setStringPainted(true);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(lblRate, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(progRate, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCat, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(progRate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRate, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jLayeredPane1.setLayer(lblNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblCat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblRate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(progRate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        this.frame.Inicio();
    }//GEN-LAST:event_btnInicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCat;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRate;
    private javax.swing.JProgressBar progRate;
    private javax.swing.JTextArea txtDescrip;
    // End of variables declaration//GEN-END:variables

    public void mostrarInfo(ArrayList<String> info, String Name) {
        this.lblNombre.setText(Name);
        this.lblCat.setText(info.get(1));
        this.txtDescrip.setText("Año: " + info.get(0) + "\n" +
                                "Casa Creadora: " + info.get(2)+ "\n" + info.get(3));
        
        switch(info.get(4)){
            case "0":
                this.progRate.setValue(0);
                this.progRate.setString("0");
                break;
            case "1":
                this.progRate.setValue(1*20);
                this.progRate.setString("1");
                break;
            case "2":
                this.progRate.setValue(2*20);
                this.progRate.setString("2");
                break;
            case "3":
                this.progRate.setValue(3*20);
                this.progRate.setString("3");
                break;
            case "4":
                this.progRate.setValue(4*20);
                this.progRate.setString("4");
                break;
            case "5":
                this.progRate.setValue(5*20);
                this.progRate.setString("5");
                break;
        }
    }
    
     public void mostrarInfoConsolas(ArrayList<String> info, String Name) {
        this.lblNombre.setText(Name);
        this.lblCat.setText("Año: " + info.get(1));
        this.txtDescrip.setText("Empresa: " + info.get(0));
        
    }
}
