package LinearSearchLibrary;

public interface ILinearSearchArrayMethods {
    //Method that checks for existence of key
    public boolean hasElement(int[] collection, int key);

    //Method that returns the index of the key
    public int indexAt(int[] collection, int key);

    //Element counter which gives you the number of existence in collection for specific key
    public int countOfSpecificElements(int[] collection, int key);
}
