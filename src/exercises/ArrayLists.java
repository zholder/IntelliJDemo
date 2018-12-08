package exercises;

import java.util.ArrayList;
import java.util.Arrays;

/* ArrayList: Write a static method to find the sum of all the even numbers in a list.
    Within main, create a list with at least 10 integers and call your method on the list.
 */


public class ArrayLists {

    public static void main(String[] args) {
        ArrayList <Integer> theList = new ArrayList<>(Arrays.asList(1,2,3,4));
//        for (int i = 1; i< 11; i++) {
//            theList.add(i);
//        }
        printEvens(theList);
    }

    public static void printEvens(ArrayList<Integer> list) {
        for (int i: list) {
            if (i % 2 == 0 ){
            System.out.println(i);
            }
        }
    }
}
