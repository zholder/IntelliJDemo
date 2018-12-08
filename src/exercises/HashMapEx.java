package exercises;
/*
HashMap: Make a program similar to GradebookHashMap, but which takes in students names and ID numbers (as integers) instead of names and grades.
In this case, however, the keys should be integers (the IDs) and the values should be strings (the names).
Modify the roster printing code accordingly.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;
        Integer studentID;

        System.out.println("Enter your students names (or ENTER to finish):");

        do {

            System.out.print("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                studentID = (students.size() + 1);
                students.put(studentID, newStudent);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudent.equals(""));

            // Print class roster
            System.out.println("\nClass roster:");

            for (Map.Entry<Integer, String> student : students.entrySet()) {
                System.out.println(student.getKey() + " (" + student.getValue() + ")");
            }

        }

    }

