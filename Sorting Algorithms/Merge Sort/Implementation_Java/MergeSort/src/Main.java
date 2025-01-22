import MergeSort.MergeSort;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Driver test code
    public static void main(String[] args) {

        MergeSort ms = new MergeSort();
        // Mock array
        int[] array = {30, 10, 15, 9, 25, 38, 40, 2, 22, 19, 1, 4, 3, 32, 35, 0, 5};

        int[] sortedArray = ms.mergeSort(array);

        System.out.println(Arrays.toString(sortedArray));

    }
}