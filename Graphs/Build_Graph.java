/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;

import java.util.*;

/**
 *
 * @author Shanmuga Priya M
 */
public class Build_Graph {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode("1");
        graph.addNode("2");
        graph.addNode("3");
        graph.addNode("4");
        graph.addNode("5");

        graph.addEdge("1", "2");
        graph.addEdge("1", "4");
        graph.addEdge("2", "3");
        graph.addEdge("2", "4");
        graph.addEdge("3", "4");
        graph.addEdge("4", "5");
        
        graph.print();
        
    }

}

class Graph {

    HashMap<String, Node> nodes = new HashMap<>();
    HashMap<Node, List<Node>> AdjList = new HashMap<>();

    class Node {

        String label;

        Node(String label) {
            this.label = label;
        }
        
        public String toString(){
            return label;
        }
    }
    

    public void addNode(String s) {
        Node node = new Node(s);
        nodes.putIfAbsent(s, node);
        AdjList.put(node, new ArrayList<>());

    }

    public void addEdge(String from, String to) {
        Node fromNode = nodes.get(from);
        Node toNode = nodes.get(to);

        if (fromNode == null) {
            System.out.println("cant add - Node doesnt exist");
            return;
        }
        AdjList.get(fromNode).add(toNode);
    }

    public void print() {
        for (Node source : AdjList.keySet()) {
            List<Node> target = AdjList.get(source);
            if(!target.isEmpty()){
                for(Node n:target)
                System.out.println("Source "+source+" is connected to "+n);
            }
        }
    }
}
