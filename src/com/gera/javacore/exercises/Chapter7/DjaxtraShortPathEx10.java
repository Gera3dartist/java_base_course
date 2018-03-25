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

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class DjaxtraShortPathEx10 {
    private Set<NeighborEx10<DjaxtraShortPathEx10>> neighbors;
    private String name;

    public DjaxtraShortPathEx10(String name) {
        this.name = name;

    }

    public Set<NeighborEx10<DjaxtraShortPathEx10>> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(NeighborEx10 ...edges) {
        neighbors= new HashSet<NeighborEx10<DjaxtraShortPathEx10>>();
        for (NeighborEx10 item: edges) {
            neighbors.add(item);
        }
    }

    public static void shortestPath(DjaxtraShortPathEx10 source, DjaxtraShortPathEx10 ...nodes) {
        HashMap<String, Integer> distances = new HashMap<>();

        PriorityQueue<NeighborEx10> nearCities =
                new PriorityQueue<>(nodes.length + 1, (a,b)-> a.getDistance() - b.getDistance());
        Set<DjaxtraShortPathEx10> visited  = new HashSet<>();

        if (!visited.contains(source)) {visited.add(source);}

        // add source to the queue
        nearCities.add(new NeighborEx10<DjaxtraShortPathEx10>(source, 0));
        //distances
        distances.put(source.name, 0);
        while (!nearCities.isEmpty()) {
            System.out.println(">>>queue: " + nearCities);
            NeighborEx10 edge = nearCities.remove();
            DjaxtraShortPathEx10 targ = (DjaxtraShortPathEx10) edge.getTarget();
            visited.add(targ);
            //
            for (NeighborEx10 items: targ.neighbors) {
                if (!visited.contains(edge.getTarget())) {nearCities.add(edge);}
            }
        }
        System.out.println(nearCities);





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
        shortestPath(kyiv, zhytomyr, kyiv, vinnytsia, shygorod, khmelnytsky);


    }
}
