import BubbleSort.BubbleSort;

import java.util.Arrays;

public class Main {
    //Driver test code
    public static void main(String[] args) {

        BubbleSort bs = new BubbleSort();
        // Mock array
        int[] array = {30, 10, 15, 9, 25, 38, 40, 2, 22, 19, 1, 4, 3, 32, 35, 0, 5};

        //Bubble Sort Test
        int[] sortedArray = bs.bubbleSort(array);
        System.out.println("Bubble Sort : " + Arrays.toString(sortedArray));

        //Optimized Bubble Sort Test
        sortedArray = bs.optimizedBubbleSort(array);
        System.out.println("Optimized Bubble Sort : " + Arrays.toString(sortedArray));

    }
}