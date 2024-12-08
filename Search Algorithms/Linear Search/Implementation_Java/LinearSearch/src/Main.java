import LinearSearchLibrary.LinearSearchArrayMethodsImplementation;

public class Main {

    public static void main(String[] args) {

        //Object creation for Linear Search Array methods
        LinearSearchArrayMethodsImplementation ls = new LinearSearchArrayMethodsImplementation();

        //Array creation
        int[] arr = {1,5,5,2,6,7,8,9,3,4,5,5,4,5,3,6,4,5,5,2};

        //Test cases for hasElement method
        System.out.println("Result of hasElement method : " + ls.hasElement(arr, 1)); // Best Case
        System.out.println("Result of hasElement method : " + ls.hasElement(arr, 9));
        System.out.println("Result of hasElement method : " + ls.hasElement(arr, 35)); //Worst Case
        System.out.println();

        //Test cases for indexAt method
        System.out.println("Result of indexAt method : " + ls.indexAt(arr, 1)); //Best Case
        System.out.println("Result of indexAt method : " + ls.indexAt(arr, 5));
        System.out.println("Result of indexAt method : " + ls.indexAt(arr, 90)); //Worst Case
        System.out.println();

        //Test cases for countOfSpecificElements method
        System.out.println("Result of countOfSpecificElements : " + ls.countOfSpecificElements(arr, 5));
        System.out.println("Result of countOfSpecificElements : " + ls.countOfSpecificElements(arr, 2));


        }
    }
