import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_2 {

    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student names:");
        String stu_name = scanner.nextLine();
        while (!stu_name.equals("yes")) {
            student.add(stu_name);
            stu_name = scanner.nextLine();
        }


        System.out.println("List of students:");
        for (String stu : student) {
            System.out.println(stu);
        }

        System.out.println("Enter a student name you want to remove:");
        String nameToRemove = scanner.nextLine();
        if (student.contains(nameToRemove)) {
            student.remove(nameToRemove);
            System.out.println(nameToRemove + " removed from the list.");
        } else {
            System.out.println("Student not found in the list.Please enter correct name");
        }

        System.out.println("Updated list of students:");
        for (String s : student) {
            System.out.println(s);
        }
        scanner.close();
    }
}
