package exercises;

import java.util.Scanner;

public class MilesPerGallon {
        public static void main(String[] args) {
            double miles;
            double gallons;
            Scanner in;

            in = new Scanner(System.in);
            System.out.println("How many miles have you traveled?");
            miles = in.nextDouble();

            System.out.println("How many gallons have you consumed?");
            gallons = in.nextDouble();

            System.out.println("You are getting " + miles/gallons + " mpg.");
        }
    }
