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

import java.util.HashSet;
import java.util.Set;

public class NeighborEx10<V> {
    private V target;
    private int distance;

    public NeighborEx10(V target, int distance) {
        this.distance = distance;
        this.target = target;
    }

    public V getTarget() {
        return target;
    }

    public int getDistance() {
        return distance;
    }
}
