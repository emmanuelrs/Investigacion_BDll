package com.mycompany.test;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class GUI extends javax.swing.JFrame {

    GuiDetalles _detalles;
    GuiAgregar _agregar;
    public final int _WIDTH;
    public final int _HEIGHT;
    

    /**
     * Creates new form GUI
     */
    public GUI() {
        _agregar = new GuiAgregar(this);
        _agregar.setSize(370, 405);
        _agregar.setVisible(false);
        this.add(_agregar);

        _detalles = new GuiDetalles(this);
        _detalles.setSize(857, 487);
        _detalles.setVisible(false);
        this.add(_detalles);
        
        initComponents();

        setLocationRelativeTo(null);
        this._WIDTH = this.getWidth();
        this._HEIGHT = this.getHeight();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        infoLayer = new javax.swing.JLayeredPane();
        jPanel5 = new javax.swing.JPanel();
        btnJuegos = new javax.swing.JButton();
        btnConsolas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lbltext = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblTipos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnRight1 = new javax.swing.JButton();
        btnLeft1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        lblConexion = new javax.swing.JLabel();
        busquedaPanel = new javax.swing.JPanel();
        btnXCat = new javax.swing.JButton();
        btnXCon = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        btnXAnio = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuJuego = new javax.swing.JMenuItem();
        menuConsole = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 51));
        setIconImages(null);
        setResizable(false);

        infoLayer.setBackground(new java.awt.Color(102, 102, 102));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        btnJuegos.setBackground(new java.awt.Color(0, 153, 153));
        btnJuegos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnJuegos.setText("Juegos");
        btnJuegos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        btnJuegos.setBorderPainted(false);
        btnJuegos.setFocusable(false);
        btnJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegosActionPerformed(evt);
            }
        });

        btnConsolas.setBackground(new java.awt.Color(0, 153, 153));
        btnConsolas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnConsolas.setText("Consolas");
        btnConsolas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        btnConsolas.setBorderPainted(false);
        btnConsolas.setFocusPainted(false);
        btnConsolas.setFocusable(false);
        btnConsolas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsolasActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Categorías");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnJuegos, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsolas, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(162, 162, 162))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsolas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJuegos, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setText("Imagen");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 40, 270, 220);

        lblCategoria.setBackground(new java.awt.Color(102, 102, 102));
        lblCategoria.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setText("Busqueda:");
        lblCategoria.setOpaque(true);
        jPanel1.add(lblCategoria);
        lblCategoria.setBounds(0, 0, 790, 40);

        lbltext.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lbltext.setForeground(new java.awt.Color(255, 255, 255));
        lbltext.setText("Nombre:");
        jPanel1.add(lbltext);
        lbltext.setBounds(290, 50, 470, 40);

        jTextField1.setText("Descripción");
        jTextField1.setEnabled(false);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(290, 130, 460, 100);

        lblTipos.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblTipos.setForeground(new java.awt.Color(255, 255, 255));
        lblTipos.setText("Categorías:");
        jPanel1.add(lblTipos);
        lblTipos.setBounds(290, 90, 470, 30);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Detalles");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(290, 230, 200, 40);

        btnRight1.setText("NEXT");
        btnRight1.setBorderPainted(false);
        btnRight1.setFocusable(false);
        btnRight1.setHideActionText(true);
        btnRight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRight1ActionPerformed(evt);
            }
        });

        btnLeft1.setText("BACK");
        btnLeft1.setToolTipText("");
        btnLeft1.setBorderPainted(false);
        btnLeft1.setFocusable(false);
        btnLeft1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeft1ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        lblConexion.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblConexion.setForeground(new java.awt.Color(255, 255, 255));
        lblConexion.setText("Consolas:");

        btnXCat.setBackground(new java.awt.Color(0, 102, 102));
        btnXCat.setText("Por Categoría");
        btnXCat.setBorderPainted(false);
        btnXCat.setFocusable(false);

        btnXCon.setBackground(new java.awt.Color(0, 102, 102));
        btnXCon.setText("Por Consola");
        btnXCon.setBorderPainted(false);
        btnXCon.setFocusable(false);

        jTextField2.setText("Busqueda");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        btnXAnio.setBackground(new java.awt.Color(0, 102, 102));
        btnXAnio.setText("Por Año");
        btnXAnio.setFocusable(false);

        javax.swing.GroupLayout busquedaPanelLayout = new javax.swing.GroupLayout(busquedaPanel);
        busquedaPanel.setLayout(busquedaPanelLayout);
        busquedaPanelLayout.setHorizontalGroup(
            busquedaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busquedaPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(busquedaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(busquedaPanelLayout.createSequentialGroup()
                        .addComponent(btnXCat, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXCon, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXAnio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        busquedaPanelLayout.setVerticalGroup(
            busquedaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, busquedaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2)
                .addGap(18, 18, 18)
                .addGroup(busquedaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXCat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXCon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(busquedaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(busquedaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(lblConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout infoLayerLayout = new javax.swing.GroupLayout(infoLayer);
        infoLayer.setLayout(infoLayerLayout);
        infoLayerLayout.setHorizontalGroup(
            infoLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoLayerLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(infoLayerLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(infoLayerLayout.createSequentialGroup()
                        .addComponent(btnLeft1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRight1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        infoLayerLayout.setVerticalGroup(
            infoLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayerLayout.createSequentialGroup()
                .addGroup(infoLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoLayerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(infoLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoLayerLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(infoLayerLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(btnLeft1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(infoLayerLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(btnRight1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoLayer.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        infoLayer.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        infoLayer.setLayer(btnRight1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnRight1.getAccessibleContext().setAccessibleName("btnRight1");
        infoLayer.setLayer(btnLeft1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        btnLeft1.getAccessibleContext().setAccessibleName("btnLeft1");
        infoLayer.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));

        jMenu1.setText("File");

        menuJuego.setText("Nuevo Juego");
        menuJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuJuegoActionPerformed(evt);
            }
        });
        jMenu1.add(menuJuego);

        menuConsole.setText("Nueva Consola");
        menuConsole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsoleActionPerformed(evt);
            }
        });
        jMenu1.add(menuConsole);

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(infoLayer)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(infoLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeft1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeft1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLeft1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnRight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRight1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRight1ActionPerformed

    private void btnJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegosActionPerformed
        // TODO add your handling code here:
        this.lblConexion.setText("Consolas:");
//        this.lblCategoria.setText("Juego");
    }//GEN-LAST:event_btnJuegosActionPerformed

    private void btnConsolasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsolasActionPerformed
        // TODO add your handling code here:
        this.lblConexion.setText("Juegos:");
//        this.lblCategoria.setText("Consola");
    }//GEN-LAST:event_btnConsolasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        this.infoLayer.setVisible(false);
        _detalles.setVisible(true);
        this.setSize(_detalles.getWidth() + 10, _detalles.getHeight() + 50);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menuJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJuegoActionPerformed
        // TODO add your handling code here:
        this.infoLayer.setVisible(false);
        _agregar.setVisible(true);
        _agregar.mostrar(0);
        this.setSize(_agregar.getWidth() + 10, _agregar.getHeight() + 70);
        _agregar.frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuJuegoActionPerformed

    private void menuConsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsoleActionPerformed
        // TODO add your handling code here:
        this.infoLayer.setVisible(false);
        _agregar.setVisible(true);
        _agregar.mostrar(1);
        this.setSize(_agregar.getWidth() + 10, _agregar.getHeight() + 70);
        _agregar.frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuConsoleActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    public void Inicio() {
        _agregar.setVisible(false);
        _detalles.setVisible(false);
        this.infoLayer.setVisible(true);
        this.setSize(this._WIDTH, this._HEIGHT);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Nimbus ">

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsolas;
    private javax.swing.JButton btnJuegos;
    private javax.swing.JButton btnLeft1;
    private javax.swing.JButton btnRight1;
    private javax.swing.JButton btnXAnio;
    private javax.swing.JButton btnXCat;
    private javax.swing.JButton btnXCon;
    private javax.swing.JPanel busquedaPanel;
    private javax.swing.JLayeredPane infoLayer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblConexion;
    private javax.swing.JLabel lblTipos;
    private javax.swing.JLabel lbltext;
    private javax.swing.JMenuItem menuConsole;
    private javax.swing.JMenuItem menuJuego;
    // End of variables declaration//GEN-END:variables
}
