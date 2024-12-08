package LinearSearchLibrary;

public class LinearSearchArrayMethodsImplementation implements ILinearSearchArrayMethods {

    //Method that checks for existence of key
    // Best Case O(1) - Due to finding our key in first iteration, iteration number will be 1
    // Worst Case O(n) - Due to not finding our key or finding in last iteration, iteration number will be n
    @java.lang.Override
    public boolean hasElement(int[] collection, int key){
        int i;
        //Collection iteration
        for (i=0; i < collection.length; i++) {
            //Condition for key comparison
            if(key == collection[i])
                return true;
        }
        return false;
    }

    //Method that returns the index of the key
    // Best Case O(1) - Due to finding our key in first iteration, iteration number will be 1
    // Worst Case O(n) - Due to not finding our key or finding in last iteration, iteration number will be n
    @java.lang.Override
    public int indexAt(int[] collection, int key){
        int i;
        //Collection iteration
        for (i=0; i < collection.length; i++) {
            //Condition for key comparison
            if(key == collection[i])
                return i;
        }
        return -1;
    }

    //Element counter which gives you the number of existence in collection for specific key
    // Best Case O(n) - because of scanning whole array, minimum iteration number will be n
    // Worst Case O(n) - because of scanning whole array, maximum iteration number will be n
    @java.lang.Override
    public int countOfSpecificElements(int[] collection, int key){
        int i;
        int count = 0;
        //Collection iteration
        for (i=0; i < collection.length; i++) {
            //Condition for key comparison
            if(key == collection[i])
                count++;
        }
        return count;
    }

}
