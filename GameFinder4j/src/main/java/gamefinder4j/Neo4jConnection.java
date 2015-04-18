package gamefinder4j;

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
	// Constructor:
	public Neo4jConnection() {
		this.setDirectorio("/Users/emmanuelrosales/Documents/GameFinder4j/data/graph.db"); //Cambiar la dirección por la de cada uno.
		this.setNodo1(null);
		this.setNodo2(null);
		this.setNodo3(null);
		this.setConexion(null);
		this.setBase(null);
		this.setTx(null);
                this.setEtiqueta(DynamicLabel.label("Console"));
                etiquetaG = DynamicLabel.label("Game");
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
		this.conectar();
		this.setTx(this.getBase().beginTx());
		
		try {
                        this.setEtiqueta(NodeType.Console);
			this.setNodo1(this.getBase().createNode(etiquetaC));
			this.getNodo1().setProperty("Name", consoleName);
			this.getNodo1().setProperty("Year", consoleYear);
                        this.getNodo1().setProperty("Brand", consoleBrand);
			this.getTx().success(); }
		catch (ConstraintViolationException e) { 
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0); }
		finally {
			this.getTx().finish();
			this.desconectar(); 
			} }
	public void addGame(String gameName, String gameYear, String gameCategory,
                            String casaCreadora, String gameReview, String stars) {
		this.conectar();
		this.setTx(this.getBase().beginTx());
		
		try {
//                        this.setEtiqueta(NodeType.Game);
			this.setNodo1(this.getBase().createNode(etiquetaG));
			this.getNodo1().setProperty("Name", gameName);
			this.getNodo1().setProperty("Year", gameYear);
                        this.getNodo1().setProperty("Category",gameCategory);
                        this.getNodo1().setProperty("CasaCreadora",casaCreadora);
                        this.getNodo1().setProperty("Review",gameReview);
                        this.getNodo1().setProperty("Stars",stars);
			this.getTx().success(); }
		catch (ConstraintViolationException e) { 
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0); }
		finally {
			this.getTx().finish();
			this.desconectar(); 
			} }
	@SuppressWarnings("deprecation")
	public boolean autentificar(String correo, String contraseña) {
		boolean retorno = false;
		this.conectar();
		this.setTx(this.getBase().beginTx());
		
//		this.existeNodo(correo);
		if (this.getNodo1() != null) { retorno = contraseña.equals(this.getNodo1().getProperty("contrasena")); }
		
		this.getTx().success();
		this.getTx().finish();
		
		this.desconectar();
		return retorno; }
	
	@SuppressWarnings("deprecation")
	public ArrayList<String> obtenerNodo(String correo) {
		ArrayList<String> lista = new ArrayList<String>(); 
		this.conectar();
		this.setTx(this.getBase().beginTx());
		
//		this.existeNodo(correo);
		if (this.getNodo1() != null) { 
			lista.add((((String) this.getNodo1().getProperty("nombre")) + " ").concat((String) this.getNodo1().getProperty("apellidos")));
			lista.add((String) this.getNodo1().getProperty("apodo"));
			lista.add((String) this.getNodo1().getProperty("correo"));
			lista.add((String) this.getNodo1().getProperty("fecha"));
			lista.add((String) this.getNodo1().getProperty("pais")); }
		
		this.getTx().success();
		this.getTx().finish();
		
		this.desconectar();
		return lista; }
	
	@SuppressWarnings("deprecation")
	public void relacionar(String name, String name2) {
		this.conectar();
		this.setTx(this.getBase().beginTx());
		this.setEtiqueta(NodeType.Console);
		this.existeNodo(name);
		this.setNodo2(this.getNodo1());
                
                this.setEtiqueta(NodeType.Game);
		this.existeNodo(name2);
		this.setNodo3(this.getNodo1());
		
		this.setConexion(this.getNodo2().createRelationshipTo(this.getNodo3(), tipoConexion.Works));
//		this.getNodo2().createRelationshipTo(this.getNodo3(), tipoConexion.Works);
//                
//                Relationship relacion = this.getNodo2().createRelationshipTo(this.getNodo3(), tipoConexion.Works);
//                relacion.setProperty("Function", "Works");
              
                
                
		this.getTx().success();
		this.getTx().finish();
		
		this.desconectar(); 
		}
	
	private enum tipoConexion implements RelationshipType { Works }

	public void existeNodo(String name) { 
//            this.conectar();
            /*if("Console".equals(etiqueta)){
                this.setEtiqueta(NodeType.Console);
            }else if("Game".equals(etiqueta)){
                this.setEtiqueta(NodeType.Game);
            }*/
            this.setTx(this.getBase().beginTx());
		ResourceIterator<Node> res = this.getBase().findNodesByLabelAndProperty(this.getEtiqueta(), "Name", name).iterator();
		if (res.hasNext()) {
			this.setNodo1(res.next());
                        System.out.println(getNodo1().getProperty("Name"));}
		else {
                        System.out.println("jj");}
            this.getTx().success();
	    this.getTx().finish();
            //this.desconectar();
        }
			//this.setNodo1(null); } }
	
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
}


