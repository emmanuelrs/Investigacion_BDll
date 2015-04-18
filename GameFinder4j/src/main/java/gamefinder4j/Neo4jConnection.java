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
	private Label etiqueta;

	// Constructor:
	public Neo4jConnection() {
		this.setDirectorio("/Users/emmanuelrosales/Documents/neo4j/data/graph.db"); //Cambiar la dirección por la de cada uno.
		this.setNodo1(null);
		this.setNodo2(null);
		this.setNodo3(null);
		this.setConexiÛn(null);
		this.setBase(null);
		this.setTx(null);
		this.setEtiqueta(DynamicLabel.label("Persona")); }
	
	
	public void conectar() {
		this.setBase(new GraphDatabaseFactory().newEmbeddedDatabase(this.getDirectorio())); 
		this.registerShutdownHook(this.getBase()); }
	
	public void desconectar() {
		this.getBase().shutdown(); }
	
	private void registerShutdownHook(final GraphDatabaseService graphDb) {
		Runtime.getRuntime().addShutdownHook( new Thread() {
			@Override
			public void run() { graphDb.shutdown(); } }); }
	
	@SuppressWarnings("deprecation")
	public void agregarNodo(Integer pid, String nombre, Integer edad) {
		this.conectar();
		this.setTx(this.getBase().beginTx());
		
		try {
			this.setNodo1(this.getBase().createNode(this.getEtiqueta()));
			this.getNodo1().setProperty("PId", pid);
			this.getNodo1().setProperty("Name", nombre);
			this.getNodo1().setProperty("Age", edad);
			this.getTx().success(); }
		catch (ConstraintViolationException e) { 
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0); }
		finally {
			this.getTx().finish();
			this.desconectar(); 
			} }
	/*
	@SuppressWarnings("deprecation")
	public boolean autentificar(String correo, String contraseÒa) {
		boolean retorno = false;
		this.conectar();
		this.setTx(this.getBase().beginTx());
		
		this.existeNodo(correo);
		if (this.getNodo1() != null) { retorno = contraseÒa.equals(this.getNodo1().getProperty("contrasena")); }
		
		this.getTx().success();
		this.getTx().finish();
		
		this.desconectar();
		return retorno; }
	*/
	@SuppressWarnings("deprecation")
	public ArrayList<String> obtenerNodo(String correo) {
		ArrayList<String> lista = new ArrayList<String>(); 
		this.conectar();
		this.setTx(this.getBase().beginTx());
		
		this.existeNodo(correo);
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
	/*
	@SuppressWarnings("deprecation")
	public void relacionar(String correo1, String correo2) {
		this.conectar();
		this.setTx(this.getBase().beginTx());
		
		this.existeNodo(correo1);
		this.setNodo2(this.getNodo1());
		this.existeNodo(correo2);
		this.setNodo3(this.getNodo1());
		
		this.setConexiÛn(this.getNodo2().createRelationshipTo(this.getNodo3(), tipoConexiÛn.SIGUE));
		
		this.getTx().success();
		this.getTx().finish();
		
		this.desconectar(); 
		}
	*/
	private enum tipoConexion implements RelationshipType { SIGUE }

	private void existeNodo(String correo) { 
		ResourceIterator<Node> res = this.getBase().findNodesByLabelAndProperty(this.getEtiqueta(), "correo", correo).iterator();
		if (res.hasNext()) {
			this.setNodo1(res.next()); }
		else {
			this.setNodo1(null); } }
	
	@SuppressWarnings("deprecation")
	public ArrayList<String> retonarSeguidores(String correo) {
		this.conectar();
		ExecutionEngine engine = new ExecutionEngine(this.getBase());
		ExecutionResult resultado;
		this.setTx(this.getBase().beginTx());
		resultado = engine.execute("match (n:Persona)<-[:SIGUE]-(p) where n.correo = \""+ correo +"\" return p.nombre, p.apellidos, p.apodo, p.correo;");
		
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

	public Relationship getConexiÛn() {
		return conexion; }

	public void setConexiÛn(Relationship conexiÛn) {
		this.conexion = conexiÛn; }

	public GraphDatabaseService getBase() {
		return base; }

	public void setBase(GraphDatabaseService base) {
		this.base = base; }

	public Transaction getTx() {
		return tx; }

	public void setTx(Transaction tx) {
		this.tx = tx; }

	public Label getEtiqueta() {
		return etiqueta; }

	public void setEtiqueta(Label etiqueta) {
		this.etiqueta = etiqueta; }
}


