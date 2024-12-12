import JumpSearchLibrary.JumpSearchImplementation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        JumpSearchImplementation js = new JumpSearchImplementation();

        int[] collection = {1, 2, 3, 5, 7, 8, 11, 12, 14, 15, 16, 19, 20, 22, 23, 25, 26, 27, 28, 31, 33, 34, 36, 38, 40, 42, 43, 45, 46, 47, 48, 49, 50, 51, 56, 67, 68, 69, 71, 74, 87, 89, 90, 110, 120, 130, 1400, 1500};

        //Test Cases

        //Test with first approach to Jump search
        for (int i = 0; i <= 150; i++) {
            System.out.println(i + " => Has element : " + js.hasElement(collection, i) + " - index at : " + js.indexAt(collection, i));
        }

        System.out.println();

        //Test with second approach to Jump Search
        for (int i = 0; i <= 150; i++) {
            System.out.println(i + " => Has element : " + js.hasElement(collection, i) + " - index at : " + js.indexAtSecondVersion(collection, i));
        }


    }
}