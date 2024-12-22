package InterpolationSearch;

public class InterpolationSearchImplementation implements InterpolationSearch {
    //hasElement method that checks if element exists in array
    @Override
    public boolean hasElement(int[] collection, int searchingValue) {
        //If index number greater than 0, it means it is in the array
        return atIndex(collection, searchingValue) >= 0;
    }

    //atIndex method that determines what is the index, if element exists in array
    @Override
    public int atIndex(int[] collection, int searchingValue) {

        int low = 0;
        int high = collection.length - 1;
        int mid = -1;

        //If value is in the array range and when sub array is created, length of array is not 0
        while (searchingValue >= collection[low] && searchingValue <= collection[high] && low <= high) {

            //Probe calculation
            mid = low + (((high - low) * (searchingValue - collection[low])) / (collection[high] - collection[low]));

            //Comparing the searching value and probe index value
            if (searchingValue == collection[mid]) {
                return mid;
            }
            //Assigning new value for probe calculation
            else if (searchingValue > collection[mid]) {
                low = mid + 1;
            }
            //Assigning new value for probe calculation
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
