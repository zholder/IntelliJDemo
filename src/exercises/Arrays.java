package exercises;

import java.util.ArrayList;

/*
Arrays: Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
Then loop through the array and print out each value.
*/
public class Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> theList = new ArrayList();
        int printNum = 1;
        int incValue = 0;
        int lastNum = 0;

        while (printNum < 9) {
            theList.add(printNum);
            incValue = lastNum;
            lastNum = printNum;
            printNum = incValue + lastNum;
        }

        System.out.println(theList);
    }

    }

