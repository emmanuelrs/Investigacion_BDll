/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGrafica;

import CapaGrafica.GUI;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Kenneth
 */
public class GuiAgregar extends javax.swing.JPanel {

    GUI frame;
    String defaultPathImage = "D:\\gamefinderlogo.png";
    /**
     * Creates new form GuiAgregar
     * @param mainFrame
     */
    public GuiAgregar(GUI mainFrame) {
        this.frame = mainFrame;
        initComponents();
        jTextField1.setText(defaultPathImage);
        jTextField2.setText(defaultPathImage);
        this.layerAddGame.setVisible(false);
        this.layerAddConsole.setVisible(true);
    }

    
    public void mostrar(int e){
        if(e == 0){
            this.layerAddGame.setVisible(true);
            this.layerAddGame.setLocation(5, 10);
            this.layerAddConsole.setVisible(false);
        }else{
            this.layerAddConsole.setVisible(true);
            this.layerAddConsole.setLocation(5, 10);
            this.layerAddGame.setVisible(false);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layerAddGame = new javax.swing.JLayeredPane();
        lblEmpresa = new javax.swing.JLabel();
        lblRate = new javax.swing.JLabel();
        txtRate = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        btnAddGame = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        lblDescrip = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescrip = new javax.swing.JTextArea();
        txtEmp = new javax.swing.JTextField();
        lblCat = new javax.swing.JLabel();
        txtCat = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        layerAddConsole = new javax.swing.JLayeredPane();
        txtAnioConsole = new javax.swing.JTextField();
        lblDescripConsole = new javax.swing.JLabel();
        txtNombreConsole1 = new javax.swing.JTextField();
        lblEmpresaConsole = new javax.swing.JLabel();
        btnInicioConsole = new javax.swing.JButton();
        btnAddConsole1 = new javax.swing.JButton();
        lblNombreConsole1 = new javax.swing.JLabel();
        txtEmpConsole1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        layerAddGame.setBackground(new java.awt.Color(51, 51, 51));
        layerAddGame.setOpaque(true);
        layerAddGame.setPreferredSize(new java.awt.Dimension(370, 398));

        lblEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpresa.setText("Empresa:");

        lblRate.setBackground(new java.awt.Color(255, 255, 255));
        lblRate.setForeground(new java.awt.Color(255, 255, 255));
        lblRate.setText("Rate");

        txtRate.setText("Rate");
        txtRate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRateMouseClicked(evt);
            }
        });

        txtAnio.setText("Año");
        txtAnio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAnioMouseClicked(evt);
            }
        });
        txtAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioActionPerformed(evt);
            }
        });

        txtNombre1.setText("Nombre");
        txtNombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombre1MouseClicked(evt);
            }
        });

        btnAddGame.setBackground(new java.awt.Color(0, 102, 102));
        btnAddGame.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddGame.setForeground(new java.awt.Color(255, 255, 255));
        btnAddGame.setText("Agregar");
        btnAddGame.setBorderPainted(false);
        btnAddGame.setFocusable(false);
        btnAddGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGameActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(0, 102, 102));
        btnInicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Inicio");
        btnInicio.setBorderPainted(false);
        btnInicio.setFocusable(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        lblDescrip.setForeground(new java.awt.Color(255, 255, 255));
        lblDescrip.setText("Descripción");

        lblAnio.setBackground(new java.awt.Color(255, 255, 255));
        lblAnio.setForeground(new java.awt.Color(255, 255, 255));
        lblAnio.setText("Año:");

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        txtDescrip.setColumns(20);
        txtDescrip.setRows(5);
        jScrollPane1.setViewportView(txtDescrip);

        txtEmp.setText("Empresa");
        txtEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmpMouseClicked(evt);
            }
        });
        txtEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpActionPerformed(evt);
            }
        });

        lblCat.setForeground(new java.awt.Color(255, 255, 255));
        lblCat.setText("Categoría:");

        txtCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCatMouseClicked(evt);
            }
        });

        jTextField1.setEditable(false);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Imagen");
        jButton1.setActionCommand("Imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layerAddGameLayout = new javax.swing.GroupLayout(layerAddGame);
        layerAddGame.setLayout(layerAddGameLayout);
        layerAddGameLayout.setHorizontalGroup(
            layerAddGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerAddGameLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layerAddGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layerAddGameLayout.createSequentialGroup()
                        .addGroup(layerAddGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescrip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layerAddGameLayout.createSequentialGroup()
                                .addComponent(lblCat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCat))
                            .addGroup(layerAddGameLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnAddGame, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layerAddGameLayout.createSequentialGroup()
                                .addComponent(lblAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblRate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerAddGameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layerAddGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layerAddGameLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1))
                    .addGroup(layerAddGameLayout.createSequentialGroup()
                        .addComponent(lblEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        layerAddGameLayout.setVerticalGroup(
            layerAddGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerAddGameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layerAddGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layerAddGameLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtCat)))
                .addGap(18, 18, 18)
                .addComponent(lblDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layerAddGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layerAddGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layerAddGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layerAddGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddGame, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layerAddGame.setLayer(lblEmpresa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddGame.setLayer(lblRate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddGame.setLayer(txtRate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddGame.setLayer(txtAnio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddGame.setLayer(txtNombre1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddGame.setLayer(btnAddGame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddGame.setLayer(btnInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddGame.setLayer(lblDescrip, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddGame.setLayer(lblAnio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddGame.setLayer(lblNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddGame.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddGame.setLayer(txtEmp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddGame.setLayer(lblCat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddGame.setLayer(txtCat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddGame.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddGame.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        layerAddConsole.setBackground(new java.awt.Color(51, 51, 51));
        layerAddConsole.setOpaque(true);
        layerAddConsole.setPreferredSize(new java.awt.Dimension(370, 398));

        txtAnioConsole.setText("Año");
        txtAnioConsole.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAnioConsoleMouseClicked(evt);
            }
        });
        txtAnioConsole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioConsoleActionPerformed(evt);
            }
        });

        lblDescripConsole.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripConsole.setText("Año:");

        txtNombreConsole1.setText("Nombre");
        txtNombreConsole1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreConsole1MouseClicked(evt);
            }
        });
        txtNombreConsole1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreConsole1ActionPerformed(evt);
            }
        });

        lblEmpresaConsole.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpresaConsole.setText("Empresa:");

        btnInicioConsole.setBackground(new java.awt.Color(0, 102, 102));
        btnInicioConsole.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInicioConsole.setForeground(new java.awt.Color(255, 255, 255));
        btnInicioConsole.setText("Inicio");
        btnInicioConsole.setBorderPainted(false);
        btnInicioConsole.setFocusable(false);
        btnInicioConsole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioConsoleActionPerformed(evt);
            }
        });

        btnAddConsole1.setBackground(new java.awt.Color(0, 102, 102));
        btnAddConsole1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddConsole1.setForeground(new java.awt.Color(255, 255, 255));
        btnAddConsole1.setText("Agregar");
        btnAddConsole1.setBorderPainted(false);
        btnAddConsole1.setFocusable(false);
        btnAddConsole1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddConsole1ActionPerformed(evt);
            }
        });

        lblNombreConsole1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreConsole1.setText("Nombre:");

        txtEmpConsole1.setText("Empresa");
        txtEmpConsole1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmpConsole1MouseClicked(evt);
            }
        });
        txtEmpConsole1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpConsole1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Imagen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);

        javax.swing.GroupLayout layerAddConsoleLayout = new javax.swing.GroupLayout(layerAddConsole);
        layerAddConsole.setLayout(layerAddConsoleLayout);
        layerAddConsoleLayout.setHorizontalGroup(
            layerAddConsoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerAddConsoleLayout.createSequentialGroup()
                .addGroup(layerAddConsoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layerAddConsoleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layerAddConsoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAnioConsole, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreConsole1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layerAddConsoleLayout.createSequentialGroup()
                                .addComponent(lblDescripConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 156, Short.MAX_VALUE))
                            .addComponent(txtEmpConsole1)))
                    .addGroup(layerAddConsoleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEmpresaConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layerAddConsoleLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layerAddConsoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layerAddConsoleLayout.createSequentialGroup()
                                .addComponent(btnAddConsole1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInicioConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layerAddConsoleLayout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2)))))
                .addContainerGap())
            .addGroup(layerAddConsoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layerAddConsoleLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblNombreConsole1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layerAddConsoleLayout.setVerticalGroup(
            layerAddConsoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerAddConsoleLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(txtNombreConsole1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblDescripConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnioConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblEmpresaConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmpConsole1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layerAddConsoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layerAddConsoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddConsole1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicioConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(layerAddConsoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layerAddConsoleLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(lblNombreConsole1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(347, Short.MAX_VALUE)))
        );
        layerAddConsole.setLayer(txtAnioConsole, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddConsole.setLayer(lblDescripConsole, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddConsole.setLayer(txtNombreConsole1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddConsole.setLayer(lblEmpresaConsole, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddConsole.setLayer(btnInicioConsole, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddConsole.setLayer(btnAddConsole1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddConsole.setLayer(lblNombreConsole1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddConsole.setLayer(txtEmpConsole1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddConsole.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layerAddConsole.setLayer(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(layerAddGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(layerAddConsole, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(layerAddGame, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(layerAddConsole, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnioConsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioConsoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioConsoleActionPerformed

    private void txtEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpActionPerformed

    private void txtNombreConsole1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreConsole1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreConsole1ActionPerformed

    private void txtAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        frame.Inicio();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnAddGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGameActionPerformed
        // TODO add your handling code here:
        String nombre = this.txtNombre1.getText();
        String anio = this.txtAnio.getText();
        String cat = this.txtCat.getText();
        String casa = this.txtEmp.getText();
        String descrip = this.txtDescrip.getText();
        String stars = this.txtRate.getText();
        String imagePath = this.jTextField1.getText();
        if(!"".equals(nombre) & !"".equals(anio) & !"".equals(cat) & !"".equals(casa) & !"".equals(descrip) &!"".equals(stars)&!"".equals(imagePath)){
            frame.getMain().getnNodo().addGame(nombre, anio, cat, casa, descrip, stars, imagePath);
            JOptionPane.showMessageDialog(null, "Juego Registrado");
        }else{
            JOptionPane.showMessageDialog(null, "Campos Vacíos");
        }
    }//GEN-LAST:event_btnAddGameActionPerformed

    private void txtEmpConsole1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpConsole1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpConsole1ActionPerformed

    private void btnInicioConsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioConsoleActionPerformed
        // TODO add your handling code here:
        frame.Inicio();
    }//GEN-LAST:event_btnInicioConsoleActionPerformed

    private void btnAddConsole1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddConsole1ActionPerformed
        // TODO add your handling code here:
        String nombre = this.txtNombreConsole1.getText();
        String anio = this.txtAnioConsole.getText();
        String casa = this.txtEmpConsole1.getText();
        String imagePath = this.jTextField2.getText();
        if(!"".equals(nombre) & !"".equals(anio) & !"".equals(casa)){
            frame.getMain().getnNodo().addConsole(nombre, anio, casa, imagePath);
            JOptionPane.showMessageDialog(null, "Consola Registrada");
        }else{
            JOptionPane.showMessageDialog(null, "Campos Vacíos");
        }
    }//GEN-LAST:event_btnAddConsole1ActionPerformed

    private void txtNombre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombre1MouseClicked
        // TODO add your handling code here:
        txtNombre1.setText("");
    }//GEN-LAST:event_txtNombre1MouseClicked

    private void txtCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCatMouseClicked
        // TODO add your handling code here:
        txtCat.setText("");
    }//GEN-LAST:event_txtCatMouseClicked

    private void txtAnioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAnioMouseClicked
        // TODO add your handling code here:
        txtAnio.setText("");
    }//GEN-LAST:event_txtAnioMouseClicked

    private void txtRateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRateMouseClicked
        // TODO add your handling code here:
        txtRate.setText("");
    }//GEN-LAST:event_txtRateMouseClicked

    private void txtEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmpMouseClicked
        // TODO add your handling code here:
        txtEmp.setText("");
    }//GEN-LAST:event_txtEmpMouseClicked

    private void txtNombreConsole1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreConsole1MouseClicked
        // TODO add your handling code here:
        txtNombreConsole1.setText("");
    }//GEN-LAST:event_txtNombreConsole1MouseClicked

    private void txtAnioConsoleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAnioConsoleMouseClicked
        // TODO add your handling code here:
        txtAnioConsole.setText("");
    }//GEN-LAST:event_txtAnioConsoleMouseClicked

    private void txtEmpConsole1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmpConsole1MouseClicked
        // TODO add your handling code here:
        txtEmpConsole1.setText("");
    }//GEN-LAST:event_txtEmpConsole1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "gif", "jpeg");
        chooser.setFileFilter(filter);
        int option = chooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
          jTextField1.setText(((chooser.getSelectedFile()!=null)?
                            chooser.getSelectedFile().getAbsolutePath():defaultPathImage));
        }
        else {
          jTextField1.setText(defaultPathImage);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "gif", "jpeg");
        chooser.setFileFilter(filter);
        int option = chooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
          jTextField2.setText(((chooser.getSelectedFile()!=null)?
                            chooser.getSelectedFile().getAbsolutePath():defaultPathImage));
        }
        else {
          jTextField2.setText(defaultPathImage);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddConsole1;
    private javax.swing.JButton btnAddGame;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInicioConsole;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLayeredPane layerAddConsole;
    private javax.swing.JLayeredPane layerAddGame;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblCat;
    private javax.swing.JLabel lblDescrip;
    private javax.swing.JLabel lblDescripConsole;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblEmpresaConsole;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreConsole1;
    private javax.swing.JLabel lblRate;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtAnioConsole;
    private javax.swing.JTextField txtCat;
    private javax.swing.JTextArea txtDescrip;
    private javax.swing.JTextField txtEmp;
    private javax.swing.JTextField txtEmpConsole1;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombreConsole1;
    private javax.swing.JTextField txtRate;
    // End of variables declaration//GEN-END:variables
}
