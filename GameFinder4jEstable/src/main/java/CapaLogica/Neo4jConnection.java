package CapaLogica;

// Imports necesarios.

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JOptionPane;
import org.neo4j.cypher.javacompat.ExecutionEngine;
import org.neo4j.cypher.javacompat.ExecutionResult;
import org.neo4j.graphdb.ConstraintViolationException;
import org.neo4j.graphdb.DynamicLabel;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;


public final class Neo4jConnection {
	
	// Atributos:
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
	// Constructor:
	public Neo4jConnection() {
		this.setDirectorio("/home/emmanuel/Desktop/neo4j/data/graph.db"); //Cambiar la dirección por la de cada uno.
		this.setNodo1(null);
		this.setNodo2(null);
		this.setNodo3(null);
		this.setConexion(null);
		this.setBase(null);
		this.setTx(null);
                this.setEtiqueta(NodeType.Console);
        }
	
	public void conectar() {
		this.setBase(new GraphDatabaseFactory().newEmbeddedDatabase(this.getDirectorio())); 
		this.registerShutdownHook(this.getBase()); }
        
         public enum NodeType implements Label{
            Game, Person,Console;}    
   
	public void desconectar() {
		this.getBase().shutdown(); }
	
	private void registerShutdownHook(final GraphDatabaseService graphDb) {
		Runtime.getRuntime().addShutdownHook( new Thread() {
			@Override
			public void run() { graphDb.shutdown(); } }); }
	
    @SuppressWarnings("deprecation")
    public void addConsole(String consoleName, String consoleYear, String consoleBrand) {
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
                    this.getTx().success();
                    JOptionPane.showMessageDialog(null, "Consola Agregado");
                }else{
                    JOptionPane.showMessageDialog(null, "Consola NO Agregado");
                }
            } else {
                this.setNodo1(this.getBase().createNode(NodeType.Console));
                this.getNodo1().setProperty("Name", consoleName);
                this.getNodo1().setProperty("Year", consoleYear);
                this.getNodo1().setProperty("Brand", consoleBrand);
                this.getTx().success();
                JOptionPane.showMessageDialog(null, "Consola Agregado");
            }
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
        } finally {
            this.getTx().finish();
        }
    }

public void addGame(String gameName, String gameYear, String gameCategory,
            String casaCreadora, String gameReview, String stars) {
        this.setTx(this.getBase().beginTx());

        try {
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
                this.getTx().success();
                JOptionPane.showMessageDialog(null, "Juego Agregado");
            }
                        
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
        } finally {
            this.getTx().finish();
        }
    }
           
        
        public ArrayList<String> getData(String query){
	    ArrayList<String> filas = new ArrayList<String>();
            try (Transaction tx = this.getBase().beginTx()){
		ExecutionEngine engine = new ExecutionEngine(this.getBase());
		ExecutionResult resultado;
		resultado = engine.execute(query);
                
		for (Map<String, Object> row : resultado) {
			for (Entry<String, Object> column : row.entrySet()) {
				filas.add(column.getValue().toString()); } }
		
		tx.success();
		tx.finish();
		
            }
            return filas;
       } 
        public void addGamer(String gamerName, String gamerLastname, String email,
               String userName, String password) {
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
            } catch (ConstraintViolationException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
            } finally {
                this.getTx().finish();
        }
    }
        
        public boolean Login(String userName){
            this.setTx(this.getBase().beginTx());
            this.existeUser(userName);
            //this.existePass(password);
            if(getloggin()){
                System.out.println("Inicio");
                this.getTx().success();
                return true;
            } else{
                System.out.println("NO Inicio");
                this.getTx().success();
                return false;
            }
        }
     public void existeUser(String name) { 
            try (Transaction tx = this.getBase().beginTx()){
		ResourceIterator<Node> res = this.getBase().findNodesByLabelAndProperty(this.getEtiqueta(), "userName", name).iterator();
		if (res.hasNext()) {
                        this.setloggin(true);
                        System.out.println(getloggin());}
		else {
                        this.setloggin(false);
                }
                tx.success();
                tx.finish();
            }
        }
	public void existePass(String pass) { 
            try (Transaction tx = this.getBase().beginTx()){
		ResourceIterator<Node> res = this.getBase().findNodesByLabelAndProperty(this.getEtiqueta(), "Password", pass).iterator();
		if (res.hasNext()) {
                        this.setloggin(true);}
		else {
                        this.setloggin(false);
                }
                tx.success();
                tx.finish();
            }
        }
	

       public ArrayList<String> obtenerInfo(String name){
           return getData("match (n:Game) where n.Name = \""+ name +"\" "
                        + "         return n.Year,n.Category,n.CasaCreadora,n.Review,n.Stars");
       }
        
       public ArrayList<String> obtenerInfoConsola(String name){
           return getData("match (n:Console) where n.Name = \""+ name +"\" "
                        + "         return n.Year,n.Brand");
       }
       
       public ArrayList<String> buscarXCategoria(String category){
           return getData("match (n:Game) where n.Category = \""+ category +"\" "
                        + " return n.Name");
       } 
       
         public ArrayList<String> allGames(){
	    return getData("match (n:Game) return n.Name;");
        } 
         
        public ArrayList<String> allConsoles(){
	    return getData("match (n:Console) return n.Name;");
       } 
       
       public ArrayList<String> buscarXAnio(String anio){
           return getData("match (n:Game) where n.Year = \""+ anio +"\" "
                        + "return n.Name;");
       } 
       
	
       public ArrayList<String> buscarXConsola(String consola){
	    return getData("match (n:Game)<-[:Works]-(p) where p.Name = \""+ consola +"\" return n.Name;");
       } 
       
       public boolean relacionExiste(String consola,String Game){
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
	
	private enum tipoConexion implements RelationshipType { Works }

	public void existeNodo(String name) { 
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
			//this.setNodo1(null); } }
	
	@SuppressWarnings("deprecation")
	public ArrayList<String> retonarSeguidores(String correo) {
		this.conectar();
		ExecutionEngine engine = new ExecutionEngine(this.getBase());
		ExecutionResult resultado;
		this.setTx(this.getBase().beginTx());
		resultado = engine.execute("match (n:Console)<-[:Works]-(p) where n.Name = \""+ correo +"\" return p.Name;");
//		CREATE (a)-[r:RELTYPE]->(b)
		ArrayList<String> filas = new ArrayList<String>();
		
		for (Map<String, Object> row : resultado) {
			for (Entry<String, Object> column : row.entrySet()) {
				filas.add(column.getValue().toString()); } }
		
		this.getTx().success();
		this.getTx().finish();
		
		this.desconectar();
		
		return filas; }
	
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
            
        }
}


