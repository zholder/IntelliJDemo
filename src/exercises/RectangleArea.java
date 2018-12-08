package exercises;

import java.util.Scanner;

public class RectangleArea {
        public static void main(String[] args) {
            double width;
            double length;
            Scanner in;

            in = new Scanner(System.in);
            System.out.println("What is your width?");
            width = in.nextDouble();

            System.out.println("What is your length?");
            length = in.nextDouble();

            System.out.println("The area of your rectange is " + width*length);
        }
}
