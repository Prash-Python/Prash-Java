package starters.problem1;

import java.util.Scanner;

// Print numbers from 1 to n.
public class PrintNumbers {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
