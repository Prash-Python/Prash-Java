package starters.problem2;

import java.util.Scanner;

// Print numbers from n to 1 in descending order.
public class print_numbers_desc_order {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        for(int i = n; i>=1; i--) {
            System.out.println(i);
        }
    }
}
