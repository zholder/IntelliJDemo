package exercises;

import java.util.ArrayList;

/*
 ArrayList and Strings: Write a static method to print out each word in a list that has exactly 5 letters.
 */
public class ArrayListandStrings {

    public static void main(String[] args) {
        ArrayList<String> theList = new ArrayList();
        theList.add("hello");
        theList.add("hi");
        theList.add("nancy");
        theList.add("zach");


        printFiveLetters(theList);
    }

    public static void printFiveLetters(ArrayList<String> list) {
        for (String i: list) {
            if (i.length()==5){
                System.out.println(i);
            }
        }
    }
}
