package com.sheepdogdynamics;

/**
 * Created by Nick on 11/29/2017.
 */
public class Edge {

    Node endNode = null;
    int edgeLength = -1;

    Edge(Node initNode, int initLength){
        endNode = initNode;
        edgeLength = initLength;
    }

    public int getLength() { return edgeLength;}
    public Node getEndNode() { return endNode; }
}
