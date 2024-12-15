package ExponentialSearch;

public class ExponentialSearchImplementation implements IExponentialSearch {

    //has element method by using indexAt method
    @Override
    public boolean hasElement(int[] collection, int searchingValue) {
        return indexAt(collection, searchingValue) >= 0;
    }

    @Override
    public int indexAt(int[] collection, int searchingValue) {
        //Checking first element manually
        if (collection[0] == searchingValue)
            return 0;

        //Assignments for range determination and exponential calculation
        int i = 1, length = collection.length, rangeStart = 0, rangeEnd = 0;

        //Exponential and binary search range calculation
        while (i < length && collection[i] <= searchingValue) {
            rangeStart = i; // Range start
            i = i * 2; // Math pow
            rangeEnd = i; // Range ending
        }

        return binarySearch(collection, searchingValue, rangeStart, Math.min(rangeEnd,length-1));

    }

    //Binary search for given range
    private int binarySearch(int[] collection, int searchingValue, int low, int high) {
        int mid = (low + high) / 2;

        //Array.length > 0
        for (; low <= high; mid = (low + high) / 2) {

            //Searching element comparison
            if (searchingValue == collection[mid]) return mid;

            else if (searchingValue > collection[mid]) low = mid + 1;

            else high = mid - 1;
        }
        return -1;
    }
}
