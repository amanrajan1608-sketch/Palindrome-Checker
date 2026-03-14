import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}