package gamefinder4j;

import java.util.ArrayList;

/**
 *
 * @author emmanuelrosales
 */

public class Main {

    public static void main(String[] args) {
        
        Neo4jConnection nodo = new Neo4jConnection();
        nodo.agregarNodo(4001, "Rosales", 21);
        Neo4jConnection mNodo = new Neo4jConnection();
        mNodo.agregarNodo(4002, "Miuyin", 18);
        
     
    }
}
