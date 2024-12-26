import SelectionSort.SelectionSort;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        SelectionSort ss = new SelectionSort();

        // Mock array
        int[] array = {30, 10, 15, 9, 25, 38, 40, 2, 22, 19, 1, 4, 3, 32, 35, 0};

        //Method call
        int [] sortedArray = ss.selectionSort(array);

        System.out.println(Arrays.toString(sortedArray));

    }
}