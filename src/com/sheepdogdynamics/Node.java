package com.sheepdogdynamics;

/**
 * Created by Nick on 11/29/2017.
 */
public class Node {
    private String name;
    private Edge[] edges = null;
    private int distanceFromOrigin = -1;
    private Node previousNode = null;
    private boolean isVisited = false;

    Node(String initName, int initDist, Node initPreviousNode, Edge... initEdges)
    {
        edges = initEdges;
        name = initName;
        distanceFromOrigin = initDist;
        previousNode = initPreviousNode;
    }
    public Edge[] getEdges() { return edges; }
    public int getDistanceFromOrigin () { return distanceFromOrigin; }
    public Node getPreviousNode() { return previousNode; }
    public boolean getIsVisited () { return isVisited; }

    public void setEdges(Edge[] initEdges) { edges = initEdges; }
    public void setDistanceFromOrigin(int value) { distanceFromOrigin = value; }
    public void setPreviousNode(Node someNode) { previousNode = someNode; }
    public void setVisited(boolean val) { isVisited = val; }

    public String getName() {return name; }

    public void reset() {
        setDistanceFromOrigin(Integer.MAX_VALUE);
        setPreviousNode(null);
        setVisited(false);
    }
}
