package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int data;
    public List<Node> children;

    public Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}
