package QuickSort;

public class QuickSort {

    //Resource : https://www.programiz.com/dsa/quick-sort

    public int[] quickSort(int[] collection){
        //Method call, trigger for the private methods
        return sort(collection, 0, collection.length-1);
    }

    // Method to find the partition position
    private int partition(int[] collection, int low, int high) {

        // choose the rightmost element as pivot
        int pivot = collection[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (collection[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = collection[i];
                collection[i] = collection[j];
                collection[j] = temp;
            }

        }

        // Swap the pivot element with the greater element specified by i
        int temp = collection[i + 1];
        collection[i + 1] = collection[high];
        collection[high] = temp;

        // Return the position from where partition is done
        return (i + 1);
    }

    private int[] sort(int[] collection, int low, int high) {
        if (low < high) {

            // Choose pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(collection, low, high);

            // recursive call on the left of pivot
            sort(collection, low, pi - 1);

            // recursive call on the right of pivot
            sort(collection, pi + 1, high);
        }

        return collection;
    }

}
