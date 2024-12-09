package BinarySearchLibrary;

public interface IBinarySearchMethods {

    boolean hasElementIterative(int[] collection, int searchingValue);

    int indexAtIterative(int[] collection, int searchingValue);

    boolean hasElementRecursive(int[] collection, int searchingValue);

    boolean ownHasElementRecursive(int[] collection, int searchingValue);
}
