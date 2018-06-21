package com.gera.javacore.exercises.graph;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 22.04.18
 * Time: 11:53
 * To change this template use File | Settings | File Templates.
 */
public class Edge {
    private final String id;
    private final Vertex start;
    private final Vertex end;
    private final int weight;

    public Edge(String id, Vertex start, Vertex end, int weight) {
        this.start = start;
        this.end = end;
        this.id = id;
        this.weight = weight;
    }

    public Vertex getStart() {
        return start;
    }

    public Vertex getEnd() {
        return end;
    }

    public int getWeight() {
        return weight;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "end=" + end +
                ", start=" + start +
                '}';
    }
}
