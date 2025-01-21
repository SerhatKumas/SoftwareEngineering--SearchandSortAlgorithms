import InsertionSort.InsertionSort;

import java.util.Arrays;

public class Main {
    //Driver Code
    public static void main(String[] args) {

        InsertionSort is = new InsertionSort();

        // Mock array
        int[] array = {30, 10, 15, 9, 25, 38, 40, 2, 22, 19, 1, 4, 3, 32, 35, 0};

        int[] sortedArray = is.insertionSort(array);

        System.out.println(Arrays.toString(sortedArray));

    }
}