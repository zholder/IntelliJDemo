package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        String lowerCaseSent = sentence.toLowerCase();
        Scanner in;


        in = new Scanner(System.in);
        System.out.println("What term would you like to search?");
        String searchTerm = in.next();

        System.out.println("Searching for " + searchTerm);
        boolean exists = false;
        if (lowerCaseSent.contains(searchTerm)){
            exists = true;
            System.out.println(exists);
        } else {
            System.out.println(exists);
        }
    }
}
