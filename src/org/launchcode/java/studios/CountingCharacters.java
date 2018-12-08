package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String counting = in.next();
        counting += in.nextLine();
        System.out.println(counting);
//        String counting = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        counting = counting.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character, Integer> answer = new HashMap<>();


        for (char character : counting.toCharArray()) {

            if ((!answer.containsKey(character)) && (alphabet.indexOf(character) >= 0)) {
                answer.put(character, 1);
            } else if (!answer.containsKey(character)) {
                continue;
            } else {
                answer.put(character, answer.get(character) + 1);
            }
        }

        for (Map.Entry<Character, Integer> value : answer.entrySet()) {
            System.out.println(value);
        }
    }
}
