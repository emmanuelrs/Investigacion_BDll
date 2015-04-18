package gamefinder4j;

import java.util.ArrayList;

/**
 *
 * @author emmanuelrosales
 */

public class Main {

    public static void main(String[] args) {
       
        Neo4jConnection nNodo = new Neo4jConnection();
       // nNodo.conectar();
        nNodo.addConsole("Nintendo", "2007", "Nintendo");
        nNodo.addGame("Mario", "f", "r", "r", "r","r");
        nNodo.relacionar("Nintendo", "Mario");
        
        
        ArrayList<String> lista = nNodo.retonarSeguidores("Nintendo");
		System.out.println(lista.toString()); 
                
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            
        }
    }
}