package SelectionSort;

public class SelectionSort {

    public int[] selectionSort( int[] collection){
        //Temp is used for keeping of the value of the value that will be changed if there is any smaller number
        //Min is used to keep the lower value than the compared element
        int temp = 0, min = 0;

        for (int i = 0; i < collection.length; i++) {
            //Setting up the min to compared value's index
            min = i;
            for (int j =  i +1; j < collection.length; j++) {

                //If there is smaller value than compared value, we set new small value's index
                if (collection[j] < collection[min]){
                    min = j;
                }
            }

            //Switching the values
            temp = collection[i]; //Compared value is written to temp
            collection[i] = collection[min]; //Lower value is written to compared value position
            collection[min] = temp; //Higher value is written to lower value's old position
        }

        return collection;

    }

}
