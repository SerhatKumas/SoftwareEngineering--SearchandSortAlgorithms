package MergeSort;

public class MergeSort {

    //Main method call
    public int[] mergeSort(int[] collection){
        //Sort trigger
        sort(collection,0, collection.length-1);
        return collection;
    }

    private void sort(int[] array, int low, int high) {
        if (low < high) {
            //Middle of the array calculation
            int middle = low + (high - low) / 2;

            //Recursively sorting until array is separated halves until syb arrays has one element
            sort(array, low, middle);
            sort(array, middle + 1, high);

            //Merge the sorted halves
            merge(array, low, middle, high);
        }
    }

    private void merge(int[] array, int low, int middle, int high) {
        // Find sizes of two sub arrays to be merged
        int leftArrayLength = middle - low + 1;
        int rightArrayLength = high - middle;

        //Index creation
        int i = 0, j = 0;

        //Create temporary arrays
        int[] leftArray = new int[leftArrayLength];
        int[] rightArray = new int[rightArrayLength];

        //Copy data to temporary arrays
        System.arraycopy(array, low, leftArray, 0, leftArrayLength);
        System.arraycopy(array, middle+1, rightArray, 0, rightArrayLength);

        //Initial index of merged subarray
        int k = low;
        while (i < leftArrayLength && j < rightArrayLength) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        //Copy remaining elements of leftArray[] if any
        while (i < leftArrayLength) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < rightArrayLength) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
