import BreadthFirstSearch.*;

public class Main {
        public static void main(String[] args) {

            BreadthFirstSearchImp bfs = new BreadthFirstSearchImp();

            // Create a sample nodes for tree
            Node root = new Node(1);
            Node node2 = new Node(4);
            Node node3 = new Node(10);
            Node node4 = new Node(58);
            Node node5 = new Node(69);
            Node node6 = new Node(99);
            Node node7 = new Node(45);
            Node node8 = new Node(20);

            //Creating the tree with the connections
            root.children.add(node2);
            root.children.add(node3);
            root.children.add(node4);
            node2.children.add(node5);
            node2.children.add(node8);
            node3.children.add(node6);
            node4.children.add(node7);

            //Sample Test Cases
            for (int i = 0; i < 100; i++) {
                System.out.println(bfs.hasElement(root, i));
            }

        }
    }
