package BubbleSort;

public class BubbleSort {
    public int[] bubbleSort(int[] collection) {
        int size = collection.length;

        // loop to access each array element
        for (int i = 0; i < size - 1; i++)

            // loop to compare array elements
            for (int j = 0; j < size - i - 1; j++)

                // compare two adjacent elements
                // change > to < to sort in descending order
                if (collection[j] > collection[j + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = collection[j];
                    collection[j] = collection[j + 1];
                    collection[j + 1] = temp;
                }
        return collection;
    }

    public int[] optimizedBubbleSort(int[] collection) {
        int size = collection.length;

        // loop to access each array element
        for (int i = 0; i < (size - 1); i++) {

            // check if swapping occurs
            boolean swapped = false;

            // loop to compare adjacent elements
            for (int j = 0; j < (size - i - 1); j++) {

                // compare two array elements
                if (collection[j] > collection[j + 1]) {

                    //Element swapping
                    int temp = collection[j];
                    collection[j] = collection[j + 1];
                    collection[j + 1] = temp;

                    swapped = true;
                }
            }
            // no swapping means the array is already sorted so no need for further comparison
            if (!swapped)
                break;
        }
        return collection;
    }
}
