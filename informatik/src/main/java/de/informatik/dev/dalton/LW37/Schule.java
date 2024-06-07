package de.informatik.dev.dalton.LW37;

import de.informatik.dev.include.*;

public class Schule {

    private Graph wegenetz; 

    public Schule(){
        
    }
    public void ausgabeAllerWegpunkte(){
        List<Vertex> vertices = wegenetz.getVertices();
        vertices.toFirst(); 
        while (vertices.hasAccess()){
            System.out.println(vertices.getContent().getID());
            vertices.next();
        }
    }
    public void ausgabeAllerWege(){
        List<Edge> edges = wegenetz.getEdges();
        edges.toFirst();
        while (edges.hasAccess()){
            System.out.println(edges.getContent());
            edges.next();
        }
    }
    public void ausgabeEntfernung(String von, String nach){
        // wegesuche aus sanktaugustin projekt 
    }
}
