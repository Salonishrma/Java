import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assessment_2 {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Get Student Score");
            System.out.println("3. Exit");

            int choice = 0;
            try {
                choice = sc.nextInt();
                sc.nextLine(); // Consume newline
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // Consume invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter the Student's name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Student score:");
                    int score = sc.nextInt();
                    studentScores.put(name, score);
                    break;

                case 2:
                    System.out.println("Enter the student's name to get score:");
                    String studentName = sc.nextLine();
                    Integer studentScore = studentScores.get(studentName);
                    if (studentScore != null) {
                        System.out.println("Score for " + studentName + " is: " + studentScore);
                    } else {
                        System.out.println("Student does not exist.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close(); // Closing scanner before exiting
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
