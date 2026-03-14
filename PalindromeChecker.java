

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine();

        boolean isPalindrome = true;
        int n = input.length() - 1;

        for (int i = 0; i <= n / 2; i++) {
            if (input.charAt(i) != input.charAt(n - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("It is a Palindrome ? : " + isPalindrome);
        sc.close();
    }
    
}