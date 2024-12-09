package BinarySearchLibrary;

public class BinarySearchImplementation implements IBinarySearchMethods {

    //Binary search with iterative approach
    @Override
    public boolean hasElementIterative(int[] collection, int searchingValue) {
        int low = 0, high = collection.length - 1, mid;

        //While array size > 0
        while (low <= high) {

            mid = (low + high) / 2;

            //Searching element comparison
            if (searchingValue == collection[mid]) return true;

            else if (searchingValue > collection[mid]) low = mid + 1;

            else high = mid - 1;
        }
        return false;
    }

    //Binary search with iterative approach - returns the index of searched element
    @Override
    public int indexAtIterative(int[] collection, int searchingValue) {
        int low = 0, high = collection.length - 1, mid = (low + high) / 2;

        //Array.length > 0
        for (; low <= high; mid = (low + high) / 2) {

            //Searching element comparison
            if (searchingValue == collection[mid]) return mid;

            else if (searchingValue > collection[mid]) low = mid + 1;

            else high = mid - 1;
        }
        return -1;
    }

    //My perspective of binary search with recursive, may be less efficient
    @Override
    public boolean ownHasElementRecursive(int[] collection, int searchingValue) {

        int low = 0, high = collection.length - 1, mid = (low + high) / 2;
        int[] subSet;

        //Array.length > 0
        if (collection.length != 0) {
            //Searching value comparison
            if (searchingValue == collection[mid]) {
                return true;
            } else if (searchingValue > collection[mid]) {
                int length = high - mid;
                //Creating the right subset for search in that part
                subSet = new int[length];
                System.arraycopy(collection, mid + 1, subSet, 0, length);
                //Sending it to the method again like it's a separate array
                return hasElementRecursive(subSet, searchingValue);
            } else {
                int length = mid - low;
                //Creating the left subset for search in that part
                subSet = new int[length];
                System.arraycopy(collection, low, subSet, 0, length);
                //Sending it to the method again like it's a separate array
                return hasElementRecursive(subSet, searchingValue);
            }

        } else {
            return false;
        }
    }

    //Call method for binary search with regular recursive approach
    @Override
    public boolean hasElementRecursive(int[] collection, int searchingValue) {
        int low = 0, high = collection.length - 1;
        return hasElementHelperMethod(collection, searchingValue, high, low) != -1;
    }

    //Call method for binary search with regular recursive approach - returns index of searched element
    public int indexAtRecursive(int[] collection, int searchingValue) {
        int low = 0, high = collection.length - 1;
        return hasElementHelperMethod(collection, searchingValue, high, low);
    }

    //Binary search with regular recursive approach
    private int hasElementHelperMethod(int[] collection, int searchingValue, int high, int low) {
        if (high >= low) {
            int mid = (high + low) / 2;

            // If found at mid, then return it
            if (searchingValue == collection[mid]) return mid;

            // Search the right half
            if (searchingValue > collection[mid])
                return hasElementHelperMethod(collection, searchingValue, high, mid + 1);

            // Search the left half
            return hasElementHelperMethod(collection, searchingValue, mid - 1, low);
        }

        return -1;
    }
}
