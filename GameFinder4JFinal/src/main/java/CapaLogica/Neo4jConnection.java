package CapaLogica;

// Imports de las librerías necesarias para cada uno de los algoritmos

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JOptionPane;
import org.neo4j.cypher.javacompat.ExecutionEngine;
import org.neo4j.cypher.javacompat.ExecutionResult;
import org.neo4j.graphdb.ConstraintViolationException;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;


public final class Neo4jConnection {
    	
    // Atributos necesarios para el trabajo de la aplicación.
    
    private String directorio;
    private Node nodo1;
    private Node nodo2;
    private Node nodo3;
    private Relationship conexion;
    private GraphDatabaseService base;
    private Transaction tx;
    private Label etiquetaC;
    private Label etiquetaG;
    private boolean loggin;
    private boolean paslog;
    private boolean verificaU;
    
// Constructor
    
public Neo4jConnection(){

 /*En el constructor se encuentra la dirección de Neo4j, esta dirección es
   única para cada computadora, además se le asiga valores a los atributos,
   que al inicio se muestran en nulo, conforme la aplicación se va ejecutando
   estos valores se modifican.
 */
    this.setDirectorio("/Users/Luis Flores/Desktop/neo4j/data/graph.db"); 
    this.setNodo1(null);
    this.setNodo2(null);
    this.setNodo3(null);
    this.setConexion(null);
    this.setBase(null);
    this.setTx(null);
    this.setEtiqueta(NodeType.Console);
}
	
public void conectar() {
    
    /*Este método es de suma importancia, ya que Neo4j se debe estar conectando
    y desconectando durante la ejecución de las aplicaciones en las que trabajen
    sobre esta base de datos, ya que si siempre se encuentra encendida va a 
    generar un lock de la base y no va permitir realizar nada, lo cual se crea
    este método y el de desconectar para poder conectar y desconectar la base
    conforme se necesite para que se puedan correr todas las consultas sin 
    errrores.
    */
    // Se crea la BD
    this.setBase(new GraphDatabaseFactory().newEmbeddedDatabase(this.getDirectorio())); 
    this.registerShutdownHook(this.getBase());
}

public void desconectar() {
    this.getBase().shutdown(); 
}

public enum NodeType implements Label{
    /*Neo4j trabaja con Nodos y estos a su vez poseen Labels para clasificar el
    tipo del nodo que se crea, en el caso de GameFinder4j se necesitan 3.
    */
    
    Game, Person,Console;
}    
   

	
private void registerShutdownHook(final GraphDatabaseService graphDb){
    
    //Este método apaga a Neo4j si se produce un error
    Runtime.getRuntime().addShutdownHook( new Thread() {
    @Override
    public void run(){
        graphDb.shutdown(); 
    }}); 
}
	
@SuppressWarnings("deprecation")
public void addConsole(String consoleName, String consoleYear, String consoleBrand,
        String pImagePath){
    
    /*Este método crea y guarda los nodos en Neo4j que tienen que ver con 
      consolas de videojuegos, recibe de la parte gráfica cada uno de los
      parámetros de la función y crea el nodo.
    */
    
    this.setTx(this.getBase().beginTx());
    try {
        this.setEtiqueta(NodeType.Console);
        this.existeNodo(consoleName);
        if(getNodo1() != null){
            if(getNodo1().getProperty("Name") != consoleName){
                this.setNodo1(this.getBase().createNode(NodeType.Console));
                this.getNodo1().setProperty("Name", consoleName);
                this.getNodo1().setProperty("Year", consoleYear);
                this.getNodo1().setProperty("Brand", consoleBrand);
                this.getNodo1().setProperty("ImgPath", pImagePath);
                this.getTx().success();
                JOptionPane.showMessageDialog(null, "Consola Agregado");
                
            }else{
                JOptionPane.showMessageDialog(null, "Consola NO Agregado");
                }
            }else {
                this.setNodo1(this.getBase().createNode(NodeType.Console));
                this.getNodo1().setProperty("Name", consoleName);
                this.getNodo1().setProperty("Year", consoleYear);
                this.getNodo1().setProperty("Brand", consoleBrand);
                this.getNodo1().setProperty("ImgPath", pImagePath);
                this.getTx().success();
                JOptionPane.showMessageDialog(null, "Consola Agregado");
            }
        }catch (ConstraintViolationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
        }finally {
        this.getTx().finish();
        }
    }

public void addGame(String gameName, String gameYear, String gameCategory,
        String casaCreadora, String gameReview, String stars,String pImagePath){
    
    /*Este método crea los nodos de los juegos en Neo4j, recibe los parámetros
      desde la parte gráfica creando y guardándolos en la base.
    */
    
    this.setTx(this.getBase().beginTx());
    try{
        this.setEtiqueta(NodeType.Game);
        this.existeNodo(gameName);
        if(getNodo1() != null){
            if(getNodo1().getProperty("Name") != gameName){
                this.setNodo1(this.getBase().createNode(NodeType.Game));
                this.getNodo1().setProperty("Name", gameName);
                this.getNodo1().setProperty("Year", gameYear);
                this.getNodo1().setProperty("Category", gameCategory);
                this.getNodo1().setProperty("CasaCreadora", casaCreadora);
                this.getNodo1().setProperty("Review", gameReview);
                this.getNodo1().setProperty("Stars", stars);
                this.getNodo1().setProperty("ImgPath",pImagePath);
                this.getTx().success();
                JOptionPane.showMessageDialog(null, "Juego Agregado");
            }else{
                JOptionPane.showMessageDialog(null, "Juego NO Agregado");
            }
        }else{
            this.setNodo1(this.getBase().createNode(NodeType.Game));
            this.getNodo1().setProperty("Name", gameName);
            this.getNodo1().setProperty("Year", gameYear);
            this.getNodo1().setProperty("Category", gameCategory);
            this.getNodo1().setProperty("CasaCreadora", casaCreadora);
            this.getNodo1().setProperty("Review", gameReview);
            this.getNodo1().setProperty("Stars", stars);
            this.getNodo1().setProperty("ImgPath",pImagePath);
            this.getTx().success();
            JOptionPane.showMessageDialog(null, "Juego Agregado");
        }

    }catch(ConstraintViolationException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
    }finally {
        this.getTx().finish();
    }
}

public void addGamer(String gamerName, String gamerLastname, String email,
    String userName, String password){
    
    /*Este método crea y agrega los nodos de los usuarios que se registren
      a la aplicación
    */
    
    this.setTx(this.getBase().beginTx());
    try {
        this.setEtiqueta(NodeType.Person);
        this.setNodo1(this.getBase().createNode(NodeType.Person));
        this.getNodo1().setProperty("Name", gamerName);
        this.getNodo1().setProperty("Last Name", gamerLastname);
        this.getNodo1().setProperty("Email", email);
        this.getNodo1().setProperty("userName", userName);
        this.getNodo1().setProperty("Password", password);
        this.getTx().success();
    }catch(ConstraintViolationException e){
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
    }finally{
        this.getTx().finish();
    }
}           
        
public ArrayList<String> getData(String query){
    
    /*Este método obtiene los datos que se le piden desde la base, es decir
      ejecuta las consultas y retorna una lista con los resultados.
    */
    
    ArrayList<String> filas = new ArrayList<String>();
    try (Transaction tx = this.getBase().beginTx()){
        ExecutionEngine engine = new ExecutionEngine(this.getBase());
        ExecutionResult resultado;
        resultado = engine.execute(query);

        for (Map<String, Object> row : resultado){
            for (Entry<String, Object> column : row.entrySet()){
                    filas.add(column.getValue().toString()); } }
        tx.success();
        tx.finish();
    }
    return filas;
} 

        	
public boolean buscarUsuario(String userName, String password){
    
    /*Este método verifica en el momento del Login a la aplicación si el
    usuario y contraseña son válidos, si ambos dan True el programa se loggea
    */
   
   ArrayList n = getData("match (n:Person) where n.userName = \""+ userName +"\" "
                + "return n.userName;");
   if(!n.isEmpty()){
       if(buscarPassword(password)){
           this.setloggin(true);  
       }else{
           this.setloggin(false);
       }
    return true;
   }
   else{
       this.setloggin(false);
       return false;
   }
} 

public boolean verificaUsuario(String userName){
    
    /*Este método es muy similar al anterior, la diferencia es que se utiliza
    para verificar cuando se está haciendo un registro si el nombre de 
    usuario está disponible, sino ya hay uno registrado con el mismo nombre
    no se le permitira registrarse hasta que lo cambie.
    */
   
    ArrayList n = getData("match (n:Person) where n.userName = \""+ userName +"\" "
   + "return n.userName;");
   if(!n.isEmpty()){
       verificaU = true; 
    }else{
     verificaU = false;
       }
    return verificaU;
}
         

public boolean buscarPassword(String password){
    
    /*Verifica el Password del usuario cuando se está loggeando, si se encuentra
    correcto retorna true, de otra manera retorna false
    */
    
   ArrayList a = getData("match (n:Person) where n.Password = \""+ password +"\" "
                + "return n.userName;");
   if(!a.isEmpty()){
       paslog = true;

   }else{
       paslog = false;
   }
   return paslog;
}

public ArrayList<String> obtenerInfo(String name){
    
   /*Este método obtiene toda la infomación de un juego en especifico*/
   
    return getData("match (n:Game) where n.Name = \""+ name +"\" "
                + "         return n.Year,n.Category,n.CasaCreadora,n.Review,n.Stars,n.ImgPath");
}

public ArrayList<String> obtenerInfoConsola(String name){
    
// Obtiene la información de las consolas
    
   return getData("match (n:Console) where n.Name = \""+ name +"\" "
                + "         return n.Year,n.Brand,n.ImgPath");
}

public ArrayList<String> buscarXCategoria(String category){    
   
// Este método busca los juegos por categoría
    
   return getData("match (n:Game) where n.Category = \""+ category +"\" "
                + " return n.Name");
} 

 public ArrayList<String> allGames(){
     
 // Retorna todos los juegos ordenados alfabeticamente.
     
    return getData("match (n:Game) return n.Name order by n.Name;");
} 

public ArrayList<String> allConsoles(){
    
    // Retorna todas las consolas ordenadas alfabeticamente
    
    return getData("match (n:Console) return n.Name order by n.Name;");
} 

public ArrayList<String> buscarXAnio(String anio){
    
    //Este método busca los juegos por año
   
    return getData("match (n:Game) where n.Year = \""+ anio +"\" "
                + "return n.Name;");
} 


public ArrayList<String> buscarXConsola(String consola){
    
    // Este método busca los juegos que trabajan por consola
    
    return getData("match (n:Game)<-[:Works]-(p) where p.Name = \""+ consola +"\" return n.Name;");
} 

public boolean relacionExiste(String consola,String Game){
    
    // verifica si una relación existe
    
    ArrayList n = getData("match (p:Game)<-[:Works]-(n:Console) where n.Name = \"" + consola +
                "\" and p.Name = \"" + Game +  "\" return p.Name;");
    if(!n.isEmpty()){
        return true;
    }else{
        return false;
    }
} 
       
@SuppressWarnings("deprecation")
public void relacionar(String name, String name2) {
    
    /*En Neo4j los nodos se conectan mediante relaciones, en el caso de 
    GameFinder4j se van a conectar los juegos que puedan ser soportados
    por las consolas.
    */
    try(Transaction tx =  this.getBase().beginTx()){
        this.setEtiqueta(NodeType.Console);
        this.existeNodo(name);
        this.setNodo2(this.getNodo1());

        this.setEtiqueta(NodeType.Game);
        this.existeNodo(name2);
        this.setNodo3(this.getNodo1());
        if(getNodo2() != null & getNodo3()!= null){
            this.setConexion(this.getNodo2().createRelationshipTo(this.getNodo3(), tipoConexion.Works));

            ExecutionEngine engine = new ExecutionEngine(this.getBase());
            ExecutionResult resultado;
            resultado = engine.execute("MATCH (a:Console),(b:Game)\n" +
                                            "WHERE a.Name = 'Node A' AND b.Name = 'Node B'\n" +
                                            "CREATE (b)-[r:Works]->(a)\n" +
                                            "RETURN r;");
        }
        tx.success();
        tx.finish();
    }
}
	
private enum tipoConexion implements RelationshipType{
    
    // Este método da los tipos de relaciones entre nodos.
    
    Works;
}

public void existeNodo(String name) {
    
    // Verifica si exite un nodo en específico.
    
    try (Transaction tx = this.getBase().beginTx()){
        ResourceIterator<Node> res = this.getBase().findNodesByLabelAndProperty(this.getEtiqueta(), "Name", name).iterator();
        if (res.hasNext()) {
                this.setNodo1(res.next());
                System.out.println(getNodo1().getProperty("Name"));}
        else {
                System.out.println("No se encuentra");
        }
        tx.success();
        tx.finish();
    }
}	
@SuppressWarnings("deprecation")
public ArrayList<String> retonarSeguidores(String correo) {
        this.conectar();
        ExecutionEngine engine = new ExecutionEngine(this.getBase());
        ExecutionResult resultado;
        this.setTx(this.getBase().beginTx());
        resultado = engine.execute("match (n:Console)<-[:Works]-(p) where n.Name = \""+ correo +"\" return p.Name;");
        ArrayList<String> filas = new ArrayList<String>();

        for (Map<String, Object> row : resultado) {
                for (Entry<String, Object> column : row.entrySet()) {
                        filas.add(column.getValue().toString()); } }

        this.getTx().success();
        this.getTx().finish();

        this.desconectar();

        return filas;
}

// Los Setters and Getters necesarios para cada uno de los algoritmos.

public String getDirectorio() {
        return directorio; }

public void setDirectorio(String directorio) {
        this.directorio = directorio; }

public Node getNodo1() {
        return nodo1; }

public void setNodo1(Node nodo1) {
        this.nodo1 = nodo1; }

public Node getNodo2() {
        return nodo2; }

public void setNodo2(Node nodo2) {
        this.nodo2 = nodo2; }

public Node getNodo3() {
        return nodo3; }

public void setNodo3(Node nodo3) {
        this.nodo3 = nodo3; }

public Relationship getConexion() {
        return conexion; }

public void setConexion(Relationship conexion) {
        this.conexion = conexion; }

public GraphDatabaseService getBase() {
        return base; }

public void setBase(GraphDatabaseService base) {
        this.base = base; }

public Transaction getTx() {
        return tx; }

public void setTx(Transaction tx) {
        this.tx = tx; }

public Label getEtiqueta() {
        return etiquetaC; }

public void setEtiqueta(Label etiqueta) {
        this.etiquetaC = etiqueta; }
public void setloggin(boolean loggin){
    this.loggin = loggin;
}
public boolean getloggin(){
    return loggin;
}}


