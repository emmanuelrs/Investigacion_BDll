package CapaLogica;

import CapaGrafica.GUI;
import java.util.ArrayList;

/**
 *
 * @author emmanuelrosales
 */

public class Main {

    private GUI gui;
    private Neo4jConnection nNodo;
    
   public Main(){
        init();
   }
    
   
    public static void main(String[] args) {
       
//        Neo4jConnection nNodo = new Neo4jConnection();
//        nNodo.conectar();
//        nNodo.addConsole("Nintendo", "2007", "Nintendo");
//        nNodo.addGame("Mario", "F0", "0", "A0", "R0","4");
//        nNodo.addGame("Samus", "F1", "1", "A1", "R1","3");
//        nNodo.addGame("Kirby", "F2", "2", "A2", "R2","4");
//        nNodo.addGame("Spiderman", "F3", "0", "A3", "R3","2");
//        nNodo.addGame("Yoshi", "F4", "0", "A4", "R4","5");
//        nNodo.addGame("Wario", "F5", "0", "A5", "R5", "4");
//        
//        nNodo.relacionar("Nintendo", "Mario");
//        nNodo.relacionar("Nintendo", "Yoshi");
//        
//        
//        ArrayList<String> lista = nNodo.retonarSeguidores("Nintendo");
//		System.out.println(lista.toString()); 
//                
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i));
//            
//        }
        Main main = new Main();
    }

    private void init() {
        nNodo = new Neo4jConnection();
        getnNodo().conectar();
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
     * @return the nNodo
     */
    public Neo4jConnection getnNodo() {
        return nNodo;
    }
}

