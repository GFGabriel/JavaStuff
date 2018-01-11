package com.gflauta;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.regex.Pattern;

public class Graph {
    private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

    public static class Node {
        private int id;
        LinkedList<Node> adjacent = new LinkedList<Node>();
        private Node(int id) {
            this.id = id;
        }
    }

    private Node getNode(int id) {
        return nodeLookup.get(id);
    }
//
//    public void addEdge(int source, int destination) {
//
//    }
//
//    public boolean hasPathDFS(int source, int destination)  {
//        ret
//    }

    public static void main(String[] args) {
        String str = "Hello!";
        System.out.println(str.charAt(str.length()-1));
        char test = str.charAt(str.length()-1);
        System.out.println(str.substring(str.length()-1, str.length()).matches(".*\\p{Punct}"));
        System.out.println(str.endsWith("!"));
        System.out.println(str.substring(0, str.length()-1));
    }

}
