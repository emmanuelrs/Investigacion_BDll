package CapaGrafica;

import CapaLogica.Main;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.UIManager;
import org.neo4j.graphdb.Node;

/**
 *
 * @author Kenneth
 */

public class GUI extends javax.swing.JFrame {
    
    // Todos los atributos necesarios para la interfaz gráfica principal.

    private GuiDetalles _detalles;
    private GuiAgregar _agregar;
    private GuiRelaciones _relaciones;
    private final Main main;
    private boolean type;
    private ArrayList<String> array;
    public final int _WIDTH;
    public final int _HEIGHT;
    
public GUI(Main pMain) {
    
    // Constructor
    
    main = pMain;
    init();
    initComponents();
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
        lblCategoria = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        busquedaPanel = new javax.swing.JPanel();
        btnXCat = new javax.swing.JButton();
        btnXCon = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        btnXAnio = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuJuego = new javax.swing.JMenuItem();
        menuConsole = new javax.swing.JMenuItem();
        menuRelaciones = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        btnJuegos.setBackground(new java.awt.Color(0, 153, 153));
        btnJuegos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnJuegos.setForeground(new java.awt.Color(255, 255, 255));
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
        btnConsolas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnConsolas.setForeground(new java.awt.Color(255, 255, 255));
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(btnConsolas, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
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

        lblCategoria.setBackground(new java.awt.Color(102, 102, 102));
        lblCategoria.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setText("Busqueda:");
        lblCategoria.setOpaque(true);
        jPanel1.add(lblCategoria);
        lblCategoria.setBounds(0, 0, 790, 40);

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setVisibleRowCount(40);
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 390, 420);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
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
        jButton1.setBounds(210, 480, 200, 40);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        btnXCat.setBackground(new java.awt.Color(0, 102, 102));
        btnXCat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXCat.setForeground(new java.awt.Color(255, 255, 255));
        btnXCat.setText("Por Categoría");
        btnXCat.setBorderPainted(false);
        btnXCat.setFocusable(false);
        btnXCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXCatActionPerformed(evt);
            }
        });

        btnXCon.setBackground(new java.awt.Color(0, 102, 102));
        btnXCon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXCon.setForeground(new java.awt.Color(255, 255, 255));
        btnXCon.setText("Por Consola");
        btnXCon.setBorderPainted(false);
        btnXCon.setFocusable(false);
        btnXCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXConActionPerformed(evt);
            }
        });

        txtBusqueda.setText("Busqueda");
        txtBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBusquedaMouseClicked(evt);
            }
        });
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });

        btnXAnio.setBackground(new java.awt.Color(0, 102, 102));
        btnXAnio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXAnio.setForeground(new java.awt.Color(255, 255, 255));
        btnXAnio.setText("Por Año");
        btnXAnio.setFocusable(false);
        btnXAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXAnioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout busquedaPanelLayout = new javax.swing.GroupLayout(busquedaPanel);
        busquedaPanel.setLayout(busquedaPanelLayout);
        busquedaPanelLayout.setHorizontalGroup(
            busquedaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busquedaPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(busquedaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(busquedaPanelLayout.createSequentialGroup()
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(busquedaPanelLayout.createSequentialGroup()
                        .addComponent(btnXCat, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXCon, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        busquedaPanelLayout.setVerticalGroup(
            busquedaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, busquedaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(busquedaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXCat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXCon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(busquedaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addComponent(busquedaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout infoLayerLayout = new javax.swing.GroupLayout(infoLayer);
        infoLayer.setLayout(infoLayerLayout);
        infoLayerLayout.setHorizontalGroup(
            infoLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoLayerLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(infoLayerLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        infoLayerLayout.setVerticalGroup(
            infoLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        infoLayer.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        infoLayer.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        infoLayer.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));

        jMenu1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
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

        menuRelaciones.setText("Relaciones");
        menuRelaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelacionesActionPerformed(evt);
            }
        });
        jMenu1.add(menuRelaciones);

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

private void init(){
    _agregar = new GuiAgregar(this);
    _agregar.setSize(470, 505);
    _agregar.setVisible(false);
    this.add(_agregar);

    _detalles = new GuiDetalles(this);
   // _detalles.setSize(530, 587);
    _detalles.setSize(590, 657);
    _detalles.setVisible(false);
    this.add(_detalles);

    _relaciones = new GuiRelaciones(this);
    _relaciones.setSize(620, 365);
    _relaciones.setVisible(false);
    this.add(_relaciones);
}
    // Todos los métodos necesarios para la funcionalidad de la interfaz
    // gráfica.

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegosActionPerformed
        // TODO add your handling code here:
        this.type = false;
        DefaultListModel model = new DefaultListModel();
        array = this.getMain().getnNodo().allGames();
        for (int i = 0; i < array.size(); i++) {
            model.addElement(array.get(i));
        }
        this.jList1.setModel(model);
    }//GEN-LAST:event_btnJuegosActionPerformed

    private void btnConsolasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsolasActionPerformed
        // TODO add your handling code here:
        this.type = true;
        DefaultListModel model = new DefaultListModel();
        array = this.getMain().getnNodo().allConsoles();
        for (int i = 0; i < array.size(); i++) {
            model.addElement(array.get(i));
        }
        this.jList1.setModel(model);
    }//GEN-LAST:event_btnConsolasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        // Botón que muestra los detalles tanto de las consolas como 
        // el de los juegos.
        
        this.infoLayer.setVisible(false);
        _detalles.setVisible(true);
        this.setSize(_detalles.getWidth() +10, _detalles.getHeight() + 50);
        if(this.jList1.getSelectedIndex() != -1){
            ArrayList info;
            if(type == false){
                info = this.getMain().obtenerInfo(array.get(this.jList1.getSelectedIndex()));
                Collections.reverse(info);
                for (int i = 0; i < info.size(); i++) {
                    System.out.print(info.get(i) + " -- ");

                }
                String Name = array.get(this.jList1.getSelectedIndex());
                _detalles.mostrarInfo(info, Name);
            }else{
                info = this.getMain().obtenerInfoConsola(array.get(this.jList1.getSelectedIndex()));
                Collections.reverse(info);
                for (int i = 0; i < info.size(); i++) {
                    System.out.print(info.get(i) + " -- ");

                }
                String Name = array.get(this.jList1.getSelectedIndex());
                _detalles.mostrarInfoConsolas(info, Name);
            }
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menuJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJuegoActionPerformed
        // TODO add your handling code here:
        this.infoLayer.setVisible(false);
        _agregar.setVisible(true);
        _agregar.mostrar(0);
        this.setSize(_agregar.getWidth() +10, _agregar.getHeight() + 70);
    }//GEN-LAST:event_menuJuegoActionPerformed

    private void menuConsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsoleActionPerformed
        // TODO add your handling code here:
        this.infoLayer.setVisible(false);
        _agregar.setVisible(true);
        _agregar.mostrar(1);
        this.setSize(_agregar.getWidth() +10, _agregar.getHeight() + 70);
    }//GEN-LAST:event_menuConsoleActionPerformed

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void btnXCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXCatActionPerformed
        // TODO add your handling code here:
        
        // Botón que genera las búsquedas por categoría.
        
        DefaultListModel listModel = new DefaultListModel();
        this.type = false;
        array = getMain().busquedaXCategoria(txtBusqueda.getText());
        for (int i = 0; i < array.size(); i++) {
            listModel.addElement(array.get(i));
        }
        
        this.jList1.setModel(listModel);
    }//GEN-LAST:event_btnXCatActionPerformed

    private void btnXConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXConActionPerformed
        // TODO add your handling code here:
        this.type = false;
        DefaultListModel listModel = new DefaultListModel();
        array = getMain().busquedaXConsola(txtBusqueda.getText());
        for (int i = 0; i < array.size(); i++) {
            listModel.addElement(array.get(i));
        }
        
        this.jList1.setModel(listModel);
        
    }//GEN-LAST:event_btnXConActionPerformed

    private void btnXAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXAnioActionPerformed
        // TODO add your handling code here:
        
        // Este botón ejecuta la búsqueda de juegos por año.
        
        this.type = false;
        DefaultListModel listModel = new DefaultListModel();
        array = getMain().busquedaXAnio(txtBusqueda.getText());
        for (int i = 0; i < array.size(); i++) {
            listModel.addElement(array.get(i));
        }
        
        this.jList1.setModel(listModel);
    }//GEN-LAST:event_btnXAnioActionPerformed

    private void menuRelacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelacionesActionPerformed
        // TODO add your handling code here:
        
        // Muestra la ventana para crear las relaciones entre nodos.
        
        this.infoLayer.setVisible(false);
        _relaciones.setVisible(true);
        this.setSize(_relaciones.getWidth() +10, _relaciones.getHeight() + 70);
        _relaciones.init();
        
        
    }//GEN-LAST:event_menuRelacionesActionPerformed

    private void txtBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBusquedaMouseClicked
        // TODO add your handling code here:
        txtBusqueda.setText("");
    }//GEN-LAST:event_txtBusquedaMouseClicked

    public void Inicio(){
        _agregar.setVisible(false);
        _detalles.setVisible(false);
        _relaciones.setVisible(false);
        this.infoLayer.setVisible(true);
        this.setSize(this._WIDTH, this._HEIGHT);
    }
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsolas;
    private javax.swing.JButton btnJuegos;
    private javax.swing.JButton btnXAnio;
    private javax.swing.JButton btnXCat;
    private javax.swing.JButton btnXCon;
    private javax.swing.JPanel busquedaPanel;
    private javax.swing.JLayeredPane infoLayer;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JMenuItem menuConsole;
    private javax.swing.JMenuItem menuJuego;
    private javax.swing.JMenuItem menuRelaciones;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables

   
    public Main getMain() {
        return main;
    }
}
