package CountingSort;

public class CountingSort {

    public int[] countingSort(int[] collection){
        int size = collection.length;
        int[] output = new int[size];

        // Find the largest element of the array
        int max = collection[0];
        for (int i = 1; i < size; i++) {
            if (collection[i] > max)
                max = collection[i];
        }
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        // Store the count of each element
        for (int j : collection) {
            count[j]++;
        }

        // Store the cummulative count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = size - 1; i >= 0; i--) {
            output[count[collection[i]] - 1] = collection[i];
            count[collection[i]]--;
        }

        return output;
    }
}
