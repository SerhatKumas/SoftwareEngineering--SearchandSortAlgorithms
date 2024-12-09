import BinarySearchLibrary.BinarySearchImplementation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BinarySearchImplementation bs = new BinarySearchImplementation();

        int[] collection = {11,23,43,54,56,68,97,108,9999,999999};

        //Test cases for binary search methods
        System.out.println("hasElement with Iterative approach");
        System.out.println(Arrays.toString(collection));
        System.out.println("56: " + bs.hasElementIterative(collection,56));
        System.out.println("23: " + bs.hasElementIterative(collection,23));
        System.out.println("68: " + bs.hasElementIterative(collection,68));
        System.out.println("9999: " + bs.hasElementIterative(collection,9999));
        System.out.println("1000: " + bs.hasElementIterative(collection,1000));
        System.out.println("45: " + bs.hasElementIterative(collection,45));
        System.out.println();

        System.out.println("hasElement with Recursive approach");
        System.out.println(Arrays.toString(collection));
        System.out.println("56: " + bs.hasElementRecursive(collection,56));
        System.out.println("23: " + bs.hasElementRecursive(collection,23));
        System.out.println("68: " + bs.hasElementRecursive(collection,68));
        System.out.println("9999: " + bs.hasElementRecursive(collection,9999));
        System.out.println("1000: " + bs.hasElementRecursive(collection,1000));
        System.out.println("45: " + bs.hasElementRecursive(collection,45));
        System.out.println();

        System.out.println("ownHasElement method with Recursive approach");
        System.out.println(Arrays.toString(collection));
        System.out.println("56: " + bs.ownHasElementRecursive(collection,56));
        System.out.println("23: " + bs.ownHasElementRecursive(collection,23));
        System.out.println("68: " + bs.ownHasElementRecursive(collection,68));
        System.out.println("9999: " + bs.ownHasElementRecursive(collection,9999));
        System.out.println("1000: " + bs.ownHasElementRecursive(collection,1000));
        System.out.println("45: " + bs.ownHasElementRecursive(collection,45));
        System.out.println();

        System.out.println("indexAt method with iterative approach");
        System.out.println(Arrays.toString(collection));
        System.out.println("56: " + bs.indexAtIterative(collection,56));
        System.out.println("23: " + bs.indexAtIterative(collection,23));
        System.out.println("68: " + bs.indexAtIterative(collection,68));
        System.out.println("9999: " + bs.indexAtIterative(collection,9999));
        System.out.println("1000: " + bs.indexAtIterative(collection,1000));
        System.out.println("45: " + bs.indexAtIterative(collection,45));
        System.out.println();

        System.out.println("indexAt method with Recursive approach");
        System.out.println(Arrays.toString(collection));
        System.out.println("56: " + bs.indexAtRecursive(collection,56));
        System.out.println("23: " + bs.indexAtRecursive(collection,23));
        System.out.println("68: " + bs.indexAtRecursive(collection,68));
        System.out.println("9999: " + bs.indexAtRecursive(collection,9999));
        System.out.println("1000: " + bs.indexAtRecursive(collection,1000));
        System.out.println("45: " + bs.indexAtRecursive(collection,45));
        System.out.println();


    }
}