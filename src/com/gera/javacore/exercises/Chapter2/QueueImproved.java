package com.gera.javacore.exercises.Chapter2;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 28.12.17
 * Time: 16:13
 * To change this template use File | Settings | File Templates.
 */
public class QueueImproved {
    private class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }

        private void setNext(Node next) {
            this.next = next;
        }
    }

    private class Iterator {
        int index;
        public Node next(){
            try {
                return nodes.get(index);
            } finally {
                index++;
            }
        }

        public boolean hasNext() {
            return index < (nodes.size()-1);
        }

    }

    private Node first;
    private Node last;

    private ArrayList<Node> nodes;

    public QueueImproved() {
        nodes = new ArrayList<>();
    }

    public void add(String data) {
        Node node = new Node(data);
        if (first == null) {
            first = node;
            last = node;
        }
        else {
            last = node;
            nodes.get(nodes.size()-1).setNext(node);
        }

        nodes.add(node);
    }

    public void showNodes() {
        for (Node node : nodes) {
            System.out.println("node data: " + node.data + "; node next: " + node.next);
        }
    }

    public Iterator getIterator(){
        return new Iterator();
    }

    public static void main(String[] args) {
        QueueImproved queue = new QueueImproved();
        queue.add("some node data 1");
        queue.add("some node data 2");
        queue.add("some node data 3");
        Node node = queue.getIterator().next();
        System.out.println("node data: " + node.data + "; node next: " + node.next);

    }
}
