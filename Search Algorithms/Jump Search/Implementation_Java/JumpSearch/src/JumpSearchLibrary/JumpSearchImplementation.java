package JumpSearchLibrary;

public class JumpSearchImplementation implements IJumpSearch {

    //hasElement method using indexAt
    @Override
    public boolean hasElement(int[] collection, int searchingValue) {
        return indexAt(collection, searchingValue) >= 0;
    }

    //indexAt element that returns the index of the element (if existed)
    @Override
    public int indexAt(int[] collection, int searchingValue) {

        int collectionLength = collection.length;
        int optimalJumpSize = findOptimalJumpSize(collectionLength);
        int i = 0;

        //Iterating through the array
        while (i < collectionLength) {
            if (searchingValue == collection[i])
                return i;
            else if (searchingValue < collection[i]) {
                //After finding a greater value than searching value, we linear search from starting element to starting element + jump size
                return linearSearch(collection, searchingValue, i - optimalJumpSize, i);
            }
            //Increment of the i and safety check if index after jump exceeds array limits
            i = Math.min(i + optimalJumpSize, collectionLength + optimalJumpSize - 1);
        }
        return -1;
    }

    //Different approach to Jump search, more efficient I believe
    public int indexAtSecondVersion(int[] collection, int searchingValue) {

        int collectionLength = collection.length;
        int optimalJumpSize = findOptimalJumpSize(collectionLength);
        int i = 0, prev = 0;


        //Find the block where element may be present
        while (i < collectionLength && collection[i] <= searchingValue) {
            prev = i;
            i += optimalJumpSize;
        }
        return linearSearch(collection, searchingValue, prev, Math.min(i, collectionLength));

    }


    //Private helper method for finding out the optimal jumps size (sqrt)
    private int findOptimalJumpSize(int collectionLength) {
        if (collectionLength == 0)
            return 0;

        return (int) Math.sqrt(collectionLength);
    }

    //Regular linear search method from specific staring point to end point
    private int linearSearch(int[] collection, int searchingValue, int startingIndex, int endIndex) {
        int i;
        //Collection iteration
        startingIndex = Math.max(startingIndex, 0);
        for (i = startingIndex; i < endIndex; i++) {
            //Condition for key comparison
            if (searchingValue == collection[i])
                return i;
        }
        return -1;
    }
}
