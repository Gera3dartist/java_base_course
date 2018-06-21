package com.gera.javacore.exercises.graph;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 22.04.18
 * Time: 11:56
 * To change this template use File | Settings | File Templates.
 */
public class Graph {
    private List<Vertex> vertices;
    private List<Edge> edges;

    public Graph(List<Vertex> vertices, List<Edge> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }
}
