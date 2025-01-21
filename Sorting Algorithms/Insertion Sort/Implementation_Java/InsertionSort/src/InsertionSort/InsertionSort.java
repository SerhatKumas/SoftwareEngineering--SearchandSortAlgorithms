package InsertionSort;

public class InsertionSort {

    public int[] insertionSort(int[] collection){

        //Length of the collection that is sent to the method
        int collectionLength = collection.length;

        //Traversal of the collection
        for (int i = 1; i < collectionLength; ++i) {
            //Marking the element to be sorted
            int key = collection[i];
            //Marking the last sorted element
            int j = i - 1;

            //Compare key with each element on the left of it until an element smaller than itself
            //While last sorted array > element to be sorted
            while (j >= 0 && collection[j] > key) {
                //Element to be sorted = last sorted element
                collection[j + 1] = collection[j];
                //Decreasing J till finding last sorted element < element to be sorted
                --j;
            }
            //Swapping the element to the sport where last sorted element < element to be sorted
            collection[j + 1] = key;
        }
        //Returning the collection
        return collection;
    }

}
