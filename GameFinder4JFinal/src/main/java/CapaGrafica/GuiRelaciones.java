
package CapaGrafica;

import CapaGrafica.GUI;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Kenneth
 */
public class GuiRelaciones extends javax.swing.JPanel {

    private final GUI frame;
    private DefaultListModel modelGames;
    private DefaultListModel modelConsoles;

public GuiRelaciones(GUI pFrame) {
    frame = pFrame;
    initComponents();

}

public void init(){
    modelGames = new DefaultListModel();
    modelConsoles = new DefaultListModel();
    ArrayList<String> games = this.frame.getMain().getnNodo().allGames();
    ArrayList<String> consoles = this.frame.getMain().getnNodo().allConsoles();
    for (int i = 0; i < games.size(); i++) {
        modelGames.addElement(games.get(i));
    }
    for (int i = 0; i < consoles.size(); i++) {
        modelConsoles.addElement(consoles.get(i));
    }
    this.listGames.setModel(modelGames);
    this.listConsoles.setModel(modelConsoles);


}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listGames = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        listConsoles = new javax.swing.JList();
        btnRelacion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        listGames.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listGames.setVisibleRowCount(20);
        jScrollPane1.setViewportView(listGames);

        jSeparator1.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setOpaque(true);

        listConsoles.setVisibleRowCount(20);
        jScrollPane2.setViewportView(listConsoles);

        btnRelacion.setBackground(new java.awt.Color(0, 102, 102));
        btnRelacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRelacion.setForeground(new java.awt.Color(255, 255, 255));
        btnRelacion.setText("Relacionar");
        btnRelacion.setBorderPainted(false);
        btnRelacion.setFocusable(false);
        btnRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelacionActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Inicio");
        jButton1.setBorderPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRelacion, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frame.Inicio();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelacionActionPerformed
        // TODO add your handling code here:
        int[] consolas = this.listConsoles.getSelectedIndices();
        int game =this.listGames.getSelectedIndex();
        if(consolas.length != 0 & game != -1){
            String nameGame = (String) modelGames.getElementAt(game);
            for (int i = 0; i < consolas.length; i++) {
                String nameConsola = (String) modelConsoles.getElementAt(consolas[i]);
                if(this.frame.getMain().getnNodo().relacionExiste(nameConsola, nameGame) == false){
                    this.frame.getMain().getnNodo().relacionar(nameConsola, nameGame);
                    JOptionPane.showMessageDialog(null, "Relación realizada");
                }else{
                    JOptionPane.showMessageDialog(null, "Relación existente");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Datos no seleccionados");
        }
    }//GEN-LAST:event_btnRelacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRelacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList listConsoles;
    private javax.swing.JList listGames;
    // End of variables declaration//GEN-END:variables
}
