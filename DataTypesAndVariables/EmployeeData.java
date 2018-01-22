package DataTypesAndVariables;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 2.10.2017 г..
 */
public class EmployeeData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = scanner.nextByte();
        char genfer = scanner.next().charAt(0);
        long personalID = scanner.nextLong();
        int uniqueNumber = scanner.nextInt();
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+genfer);
        System.out.println("Personal ID: "+personalID);
        System.out.println("Unique Employee number: "+uniqueNumber);
    }
}