package com.gera.javacore.exercises.Chapter7;


/*
* Реализуйте алгоритм Дейкстры для поиска кратчайших путей между города ми,
* связанными сетью автомобильных дорог. (Описание этого алгоритма мож но найти
 * в популярной литературе по алгоритмам или в соответствующей ста тье Википедии.)
 * Воспользуйтесь вспомогательным классом Neighbor для хране ния названия соседнего
 * города и расстояния до него. Представьте полученный граф в виде преобразования
 * названий городов в множества соседних городов.
 * Воспользуйтесь в данном алгоритме классом PriorityQueue<Neighbor>.
*
* */

import org.omg.CORBA.INTERNAL;

import java.util.*;

public class GraphDaijxtraEx10 {

    /*
     * the class to represent a graph
     *
     * static methods implement the algorithm itself
     * */
    private HashSet<String> vertices;
    private HashMap<String, ArrayList<String>> edges;
    private HashMap<String, Integer> weights;


    public GraphDaijxtraEx10() {
        this.vertices = new HashSet<>();
        this.edges = new HashMap<>();
        this.weights = new HashMap<>();
    }
    private String getVertKey(String ...keys) {
        return String.join("-", keys);
    }
    public void addVertex(String vertex) {vertices.add(vertex);}


    public void addEdge(String fromVertex, String toVertex, int distance) {
        if (edges.get(fromVertex) == null) {
            ArrayList<String> neighbors = new ArrayList<>();
            neighbors.add(toVertex);
            edges.put(fromVertex, neighbors);
        } else {
            edges.get(fromVertex).add(toVertex);
        }
        weights.put(getVertKey(fromVertex, toVertex), distance);
    }

    public ArrayList<String> getEdge(String fromVertex, String toVertex) {
        return edges.get(getVertKey(toVertex, fromVertex));
    }

    public int getWeight(String fromVertex, String toVertex) {
        return weights.get(getVertKey(fromVertex, toVertex));
    }

    public HashSet<String> getVertices() {
        return vertices;
    }

    public HashMap<String, ArrayList<String>> getEdges() {
        return edges;
    }

    /*------STATIC PART------*/

    public static class DijxtraResult {
        HashMap<String, Integer> delta;
        HashMap<String, String> visited;

        public DijxtraResult(HashMap<String, Integer> delta, HashMap<String, String> visited) {
            this.delta = delta;
            this.visited = visited;
        }
    }

    public static class DeltaDistance {
        String vertex;
        int distance;

        public DeltaDistance(String vert) {
            this.vertex = vert;
            this.distance = Integer.MAX_VALUE;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public String getVertex() {
            return vertex;
        }

        public int getDistance() {
            return distance;
        }
    }

    public static DijxtraResult dijxtra(GraphDaijxtraEx10 graph, String start) {
        //pythonic way
        // placeholder to vertices to visit
        HashSet<String> s = new HashSet<>();

        //initialize delta set infinity for all
        PriorityQueue<DeltaDistance> pq = new PriorityQueue<>((a,b) -> a.distance - b.distance);
        HashMap<String, Integer> delta = new HashMap<>();

        for (String vertex: graph.getVertices()){
            // for start set to 0
            if (vertex.equals(start)){
                DeltaDistance foo = new DeltaDistance(vertex);
                foo.setDistance(0);
                pq.add(foo);
                delta.put(vertex, 0);
                continue;
            }

//            pq.add(new DeltaDistance(vertex));
            delta.put(vertex, Integer.MAX_VALUE);

        }

//        delta.put(start, 0);


        //initialize previous
        HashMap<String, String> visited = new HashMap<>();
        for (String vertex: graph.getVertices()){
            visited.put(vertex, null);
        }

        HashSet<String> lookUpRange = (HashSet<String>)graph.getVertices().clone();
        // iterate while s obtain all vetices from graph
        while (!s.equals(graph.getVertices())) {
            String v  = pq.poll().getVertex();

            //remove all visited from neighbors

            lookUpRange.removeAll(s);
            ArrayList<String> iterable = graph.getEdges().get(v);
            if (iterable == null) {
                s.add(v);
                continue;
            }
            for (String neighbor: graph.getEdges().get(v)) {
                int min_path = graph.getWeight(v, neighbor) + delta.get(v);
                if (min_path < delta.get(neighbor)) {
                    delta.put(neighbor, min_path);
                    // update pq
                    DeltaDistance pqItem = new DeltaDistance(neighbor);
//                    pq.remove(pqItem);
                    pqItem.setDistance(min_path);
                    pq.offer(pqItem);
                    visited.put(neighbor, v);
                }
            }
            s.add(v);
        }
        DijxtraResult result = new DijxtraResult(delta, visited);
        return result;
    }

    public static void shortestPath(GraphDaijxtraEx10 graph, String start, String end) {

        DijxtraResult result = dijxtra(graph, start);
        ArrayList<String> path = new ArrayList<>();
        String vertex = end;
        while (vertex != null) {
            path.add(vertex);
            vertex = result.visited.get(vertex);
        }
        Collections.reverse(path);
        path.forEach(v -> System.out.print(v+'-'));

    }

    public static void main(String[] args) {
        System.out.println("({'e': 6, 'a': 0, 'd': 5, 'b': 2, 'c': 3}, {'e': 'd', 'a': None, 'd': 'a', 'b': 'a', 'c': 'b'})\n" +
                "['a', 'd', 'e']");
        GraphDaijxtraEx10 graph = new GraphDaijxtraEx10();

        graph.addVertex("a");
        graph.addVertex("b");
        graph.addVertex("c");
        graph.addVertex("d");
        graph.addVertex("e");

        graph.addEdge("a", "b", 2);
        graph.addEdge("a", "c", 8);
        graph.addEdge("a", "d", 5);
        graph.addEdge("b", "c", 1);
        graph.addEdge("c", "e", 3);
        graph.addEdge("d", "e", 4);

        shortestPath(graph, "a", "e");



    }
}
