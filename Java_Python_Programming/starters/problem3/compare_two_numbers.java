package starters.problem3;

import java.util.Scanner;

// Compare two numbers and print the larger one or indicate if they are equal.
public class compare_two_numbers {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        if (num1 == num2) {
            System.out.println("Both numbers are equal.");
            return;
        }
        int largerNum = num1 > num2 ? num1 : num2;
        System.out.println("The larger number is: " + largerNum);
    }
}
