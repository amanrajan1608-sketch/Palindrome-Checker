

import java.util.Scanner;

public class PalindromeChecker {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Reversed text: " + reversed);
        System.out.println("It is a Palindrome ? : " + isPalindrome);

        sc.close();
    }
}