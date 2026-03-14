import java.util.Scanner;

public class PalindromeCheckerApp {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;
        int n = normalized.length();

        for (int i = 0; i < n / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}