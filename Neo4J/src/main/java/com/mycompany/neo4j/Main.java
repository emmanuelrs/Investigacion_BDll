package com.mycompany.neo4j;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.cypher.ExecutionEngine;
import org.neo4j.cypher.ExecutionResult;
import org.neo4j.kernel.impl.util.StringLogger;

public class Main {
    public enum NodeType implements Label{
        Person, Course;
    }
    
    public enum RelationType implements RelationshipType{
      Knows, BelogsTo;  
    }
    
    public static void main(String[] args) {
       
        GraphDatabaseService db = new GraphDatabaseFactory().newEmbeddedDatabase("C:\\Users\\Emmanuel\\Documents\\Neo4j\\TestNeo");
        ExecutionEngine engine = new ExecutionEngine(db,StringLogger.SYSTEM);
        ExecutionResult result;
        
        try ( Transaction tx = db.beginTx()){
            engine.execute("MATCH (n)-[r]-()DELETE n, r");
            Node eNode = db.createNode(NodeType.Person);
            eNode.setProperty("Name","Emmanuel");
            
            Node gNode = db.createNode(NodeType.Person);
            gNode.setProperty("Name","Gloriana");
            
            Node jNode = db.createNode(NodeType.Person);
            jNode.setProperty("Name","Jose");
            
            Node rNode = db.createNode(NodeType.Person);
            rNode.setProperty("Name","Roberto");
            
            Node bNode = db.createNode(NodeType.Course);
            bNode.setProperty("Name","Bases de Datos");
            
            Node aNode = db.createNode(NodeType.Course);
            aNode.setProperty("Name","Analisis");
            
            Relationship reNode = eNode.createRelationshipTo(bNode,RelationType.BelogsTo);
            Relationship rgNode = gNode.createRelationshipTo(aNode,RelationType.BelogsTo);
            
            result = engine.execute("match (n:Person) return n");
           
            System.out.println(result);
            System.out.println("result");
            
            tx.success();}
       
    }  
}