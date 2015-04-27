package CapaLogica;

import CapaGrafica.GUI;
import CapaGrafica.Login;
import java.util.ArrayList;

/**
 *
 * @author emmanuelrosales
 */

public class Main {

    // Variables locales
    
    private GUI gui;
    private Neo4jConnection nNodo;
    
public Main(){
    
    // Llama al método init cuando es convocado.
    
    init();
}
    
public static void main(String[] args) {
    
    // crea un objeto main el cual se le pasa como parámetro al objeto
    // de login que se muestra cuando el programa se ejecuta.
    
    Main main = new Main();
    Login login = new Login(main);
    login.setVisible(true);
}

private void init() {
    
    // El método init crea los objetos y la conexión de la ventana principal
    // y neo4j
    
    nNodo = new Neo4jConnection();
    gui = new GUI(this);

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            gui.setVisible(false);
        }
    });
}
    
public void abra(){
    
    // Este método le settea true a la ventana principal
    // para que sea visible
    
    getnNodo().conectar();
    gui.setVisible(true);

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

    
public Neo4jConnection getnNodo() {
    return nNodo;
}}

