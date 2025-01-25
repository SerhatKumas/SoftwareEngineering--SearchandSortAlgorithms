import ShellSort.ShellSort;

import java.util.Arrays;

public class Main {
    //Driver test code
    public static void main(String[] args) {
        ShellSort ss = new ShellSort();
        // Mock array
        int[] array = {30, 10, 15, 9, 25, 38, 40, 2, 22, 19, 1, 4, 3, 32, 35, 7, 0, 5, 0, 1};

        int[] sortedArray = ss.shellSort(array);

        System.out.println(Arrays.toString(sortedArray));
    }
}