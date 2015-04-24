package CapaLogica;

import CapaGrafica.GUI;
import CapaGrafica.Login;
import java.util.ArrayList;

/**
 *
 * @author emmanuelrosales
 */

public final class Main {

    private GUI gui;
    private Neo4jConnection nNodo;
  
   public Main(){
        nNodo = new Neo4jConnection();
        getnNodo().conectar();
   }
    
 
    public static void main(String[] args) {
        Main main = new Main();
        Login log = new Login(main);
        log.setVisible(true);
    
         
    }


    public void init() {
        gui = new GUI(this);
         /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gui.setVisible(true);
            }
        });
    }
    
    public ArrayList<String> busquedaXCategoria(String category){
        ArrayList n = getnNodo().buscarXCategoria(category);
        
        for (int i = 1; i < n.size()+1; i++) {
            System.out.print(n.get(i-1));
            System.out.print("--");
            if(i % 6 == 0 && i != 0){
                System.out.println("");
            }
        }
        return getnNodo().buscarXCategoria(category);
        
    }
    
     public ArrayList<String> busquedaXConsola(String consola){
        ArrayList n = getnNodo().buscarXConsola(consola);
        
        for (int i = 1; i < n.size()+1; i++) {
            System.out.print(n.get(i-1));
            System.out.print("--");
            if(i % 6 == 0 && i != 0){
                System.out.println("");
            }
        }
        return getnNodo().buscarXConsola(consola);
        
    }
     
     public ArrayList<String> busquedaXAnio(String Anio){
        ArrayList n = getnNodo().buscarXAnio(Anio);
        
        for (int i = 1; i < n.size()+1; i++) {
            System.out.print(n.get(i-1));
            System.out.print("--");
            if(i % 6 == 0 && i != 0){
                System.out.println("");
            }
        }
        return getnNodo().buscarXAnio(Anio);
        
    }
    
    public ArrayList<String> obtenerInfo(String name){
        ArrayList n = getnNodo().obtenerInfo(name);
        
        for (int i = 1; i < n.size()+1; i++) {
            System.out.print(n.get(i-1));
            System.out.print("--");
            if(i % 6 == 0 && i != 0){
                System.out.println("");
            }
        }
        return getnNodo().obtenerInfo(name);
        
    }
    
    public ArrayList<String> obtenerInfoConsola(String name){
        ArrayList n = getnNodo().obtenerInfoConsola(name);
        
        for (int i = 1; i < n.size()+1; i++) {
            System.out.print(n.get(i-1));
            System.out.print("--");
            if(i % 6 == 0 && i != 0){
                System.out.println("");
            }
        }
        return getnNodo().obtenerInfoConsola(name);
        
    }

    /**
     * @return the nNodo*/

    public Neo4jConnection getnNodo() {
        return nNodo;
    }
}

