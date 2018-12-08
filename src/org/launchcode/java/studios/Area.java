package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in;
        double radius;
        double area;

        in = new Scanner(System.in);
        System.out.println("Enter a radius:");
        radius = in.nextDouble();

        do {
            System.out.println("Enter a radius:");
            radius = in.nextDouble();
            } while (radius < 0);

            if (radius > 0) {
                area = 3.14 * radius * radius;
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
        }
    }
}
