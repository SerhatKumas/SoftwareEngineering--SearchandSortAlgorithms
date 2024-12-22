package DepthFirstSearch;

public class DepthFirstSearch {

    public boolean hasElement(Node root, int searchingValue) {

        //We will do all the comparison and checking everything over the root node
        //If root node is null which means either there is no tree, or it does not have child on recursive call
        if (root == null) {
            return false;
        }
        // Compare current node's data with searching value
        else if (root.data == searchingValue) {
            return true;
        }

        // Recursively search children similar to divide and conquer. Dividing tree into smaller trees
        for (Node child : root.children) {
            if (hasElement(child, searchingValue)) {
                return true;
            }
        }

        // Not found in current node or its children
        return false;
    }
}
