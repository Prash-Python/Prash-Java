package starters.problem5;

import java.util.Scanner;

public class DeterminePrimeNum {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 2; i<=number/2; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number.");
                return;
            }
        }
        System.out.println(number + " is a prime number.");
    }
}
