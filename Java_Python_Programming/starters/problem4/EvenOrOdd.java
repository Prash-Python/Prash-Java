package starters.problem4;

import java.util.Scanner;

public class EvenOrOdd {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }
        if (number % 2 == 0) {
            System.out.println("Given Number Is even...");
        } else {
            System.out.println("Given Number Is odd...");
        }
    }
}
