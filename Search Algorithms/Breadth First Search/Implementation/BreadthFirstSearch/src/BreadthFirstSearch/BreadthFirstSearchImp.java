package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchImp {

    //hasElement method that returns boolean if the element is existed in tree structure
    public boolean hasElement(Node root, int searchingValue) {

        //Checks if the tree is empty or not
        if (root == null) {
            return false;
        }

        //Queue instantiation
        Queue<Node> queue = new LinkedList<>();
        //First root node is done manually
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll(); // Remove the node from the front of the queue
            //Checking the tree value with the searching value
            if (current.data == searchingValue) {
                return true;
            }
            // Add the children of the current node to the queue
            for (Node child : current.children) {
                queue.offer(child);
            }
        }

        return false;
    }
}
