/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

/**
 *
 * @author Kenneth
 */
public class main {
    
    public enum NodeType implements Label{
        Person,Course;
    }
    
    public enum RelationType implements RelationshipType{
        Knows, BelongsTo;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
        GraphDatabaseService graphDb = dbFactory.newEmbeddedDatabase("var/graphDb");
    
        try(Transaction tx = graphDb.beginTx()){
             Node botNode = graphDb.createNode(NodeType.Person);
             botNode.setProperty("pid", 5001);
             botNode.setProperty("Name", "Kenneth");
             botNode.setProperty("Age", 23);
        
             Node aliceNode = graphDb.createNode(NodeType.Person);
             aliceNode.setProperty("pid", 5002);
             aliceNode.setProperty("Name", "Alice");
             aliceNode.setProperty("Age", 19);
             
             Node valeNode = graphDb.createNode(NodeType.Person);
             valeNode.setProperty("pid", 5003);
             valeNode.setProperty("Name", "Vale");
        
             Node cNode = graphDb.createNode(NodeType.Course);
             cNode.setProperty("id", 1);
             cNode.setProperty("Name", "Curso 1");
             cNode.setProperty("Location", "Class 123");
             
             Node eNode = graphDb.createNode(NodeType.Course);
             cNode.setProperty("Name", "Curso 2");
             
             botNode.createRelationshipTo(aliceNode, RelationType.Knows);
             
             Relationship bobRelCurso1 = botNode.createRelationshipTo(cNode, RelationType.BelongsTo);
             bobRelCurso1.setProperty("Function", "Student");
             
             Relationship aliceRelCurso2 = aliceNode.createRelationshipTo(eNode, RelationType.BelongsTo);
             aliceRelCurso2.setProperty("Function", "Teacher");
             
             tx.success();
        }
        graphDb.shutdown();
    }
    
}
