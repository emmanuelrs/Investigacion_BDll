/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaGrafica;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 *
 * @author Jose
 */
public class Imagen extends javax.swing.JPanel{
    int x, y;

    public Imagen(JPanel jPanel1) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
    }

    @Override
    public void paint(Graphics g) {
        ImageIcon Img = new ImageIcon(getClass().getResource("/Images/imagen1.png"));
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
    }    
    
}
