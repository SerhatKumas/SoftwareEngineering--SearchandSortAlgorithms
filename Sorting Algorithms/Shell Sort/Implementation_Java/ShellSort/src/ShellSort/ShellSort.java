package ShellSort;

public class ShellSort {

    public int[] shellSort(int[] collection){

        int length = collection.length;
            // Rearrange elements at each n/2, n/4, n/8, ... intervals
        for (int interval = length / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < length; i += 1) {
                int temp = collection[i];
                int j;
                for (j = i; j >= interval && collection[j - interval] > temp; j -= interval) {
                    collection[j] = collection[j - interval];
                }
                collection[j] = temp;
                }
            }
        return collection;
    }
}
