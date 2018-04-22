package com.gera.javacore.exercises.Chapter7;


/*
* Реализуйте алгоритм Дейкстры для поиска кратчайших путей между города ми,
* связанными сетью автомобильных дорог. (Описание этого алгоритма мож но найти
 * в популярной литературе по алгоритмам или в соответствующей ста тье Википедии.)
 * Воспользуйтесь вспомогательным классом Neighbor для хране ния названия соседнего
 * города и расстояния до него. Представьте полученный граф в виде преобразования
 * названий городов в множества соседних городов.
 * Воспользуйтесь в данном алгоритме классом PriorityQueue<Neighbor>.
 * Reference: http://www.vogella.com/tutorials/JavaAlgorithmsDijkstra/article.html
*
* */

import java.util.*;

public class DjaxtraShortPathEx10 {
    /*
    * Class represents a graph data structure
    * */
    private Set<NeighborEx10<DjaxtraShortPathEx10>> neighbors;
    private String name;

    private static class Result {
        private HashMap<String, Integer> result;
        private HashMap<String, String> predecessor;

        private Result(HashMap<String, Integer> result, HashMap<String, String> predecessor) {
            this.result = result;
            this.predecessor = predecessor;
        }

        public String getShortestPath(String target) {
            StringBuilder s = new StringBuilder();
            s.append("Distance: ");
            s.append(result.get(target));
            s.append(" Path: ");

            String result = target;
            while (result != null) {
                s.append(String.format("%s -", result));
                result = predecessor.get(result);
            }
            return s.toString();
        }
    }

    public String getName() {
        return name;
    }

    public DjaxtraShortPathEx10(String name) {
        this.name = name;

    }

    public Set<NeighborEx10<DjaxtraShortPathEx10>> getNeighbors() {
        return neighbors != null ? neighbors : new HashSet<>();
    }

    public void setNeighbors(NeighborEx10 ...edges) {
        neighbors= new HashSet<>();
        for (NeighborEx10 item: edges) {
            neighbors.add(item);
        }
    }

    public static Result shortestPath(DjaxtraShortPathEx10 source, DjaxtraShortPathEx10 ...nodes) {
        HashMap<String, Integer> distances = new HashMap<>();
        // initialize distances to infinity
        for (DjaxtraShortPathEx10 node: nodes) {
            distances.put(node.getName(), Integer.MAX_VALUE);
        }
        //distances
        distances.put(source.name, 0);

        PriorityQueue<NeighborEx10> unSettledNodes =
                new PriorityQueue<>(nodes.length + 1, (a,b)-> a.getDistance() - b.getDistance());
        Set<DjaxtraShortPathEx10> visited  = new HashSet<>();
        HashMap<String, String> predecessors = new HashMap<>();

        if (!visited.contains(source)) {visited.add(source);}

        // add source to the queue
        unSettledNodes.add(new NeighborEx10<DjaxtraShortPathEx10>(source, 0));

        while (!unSettledNodes.isEmpty()) {
            NeighborEx10 edge = unSettledNodes.remove();
            DjaxtraShortPathEx10 targ = (DjaxtraShortPathEx10) edge.getTarget();
            visited.add(targ);
            //
            for (NeighborEx10 items: targ.getNeighbors()) {
                int newDistance = distances.get(targ.getName()) + items.getDistance();
                String name = ((DjaxtraShortPathEx10) items.getTarget()).getName();

                if (newDistance < distances.get(name)) {
                    distances.put(name, newDistance);
                    unSettledNodes.add(items);
                    predecessors.put(name, targ.getName());
                }
            }
        }
        return new Result(distances, predecessors);

    }

    public static void main(String[] args) {
        // initialize cities
        DjaxtraShortPathEx10 zhytomyr = new DjaxtraShortPathEx10("Zhytomyr");
        DjaxtraShortPathEx10 khmelnytsky = new DjaxtraShortPathEx10("Khmelnytsky");
        DjaxtraShortPathEx10 vinnytsia = new DjaxtraShortPathEx10("Vinnytsia");
        DjaxtraShortPathEx10 shygorod = new DjaxtraShortPathEx10("shygorod");
        DjaxtraShortPathEx10 krakiv = new DjaxtraShortPathEx10("Krakiv");
        DjaxtraShortPathEx10 kyiv = new DjaxtraShortPathEx10("Kyiv");

        // set up relations
        // set entry point
        NeighborEx10 KyivKyiv = new NeighborEx10<DjaxtraShortPathEx10>(zhytomyr, 0);

        NeighborEx10 KyivZhytomyr = new NeighborEx10<DjaxtraShortPathEx10>(zhytomyr, 150);
        NeighborEx10 KyivKhmelnytsky = new NeighborEx10<DjaxtraShortPathEx10>(khmelnytsky, 350);
        NeighborEx10 KyivVinnytsia = new NeighborEx10<DjaxtraShortPathEx10>(vinnytsia, 300);

        NeighborEx10 VinnytsiaKhemlnytsky = new NeighborEx10<DjaxtraShortPathEx10>(khmelnytsky, 120);
        NeighborEx10 VinnytsiaShygorod= new NeighborEx10<DjaxtraShortPathEx10>(shygorod, 80);

        NeighborEx10 KhmelnytskyKrakiv= new NeighborEx10<DjaxtraShortPathEx10>(krakiv, 700);
        NeighborEx10 KhmelnytskyShygorod= new NeighborEx10<DjaxtraShortPathEx10>(shygorod, 60);

        zhytomyr.setNeighbors(KyivZhytomyr);
        kyiv.setNeighbors(KyivZhytomyr, KyivKhmelnytsky, KyivVinnytsia);
        vinnytsia.setNeighbors(KyivVinnytsia, VinnytsiaKhemlnytsky, VinnytsiaShygorod);
        khmelnytsky.setNeighbors(KyivKhmelnytsky, VinnytsiaKhemlnytsky, KhmelnytskyShygorod, KhmelnytskyKrakiv);
        shygorod.setNeighbors(KhmelnytskyShygorod, VinnytsiaShygorod);


        // find shortest path to shygorod
        Result r = shortestPath(kyiv, zhytomyr, kyiv, vinnytsia, shygorod, khmelnytsky, krakiv);
        System.out.println(r.getShortestPath("shygorod"));

    }
}
