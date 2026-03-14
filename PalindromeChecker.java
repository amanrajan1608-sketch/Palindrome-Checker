import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker{

    public static boolean stackPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static boolean twoPointerPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        long startTime = System.nanoTime();
        boolean result1 = stackPalindrome(input);
        long endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean result2 = twoPointerPalindrome(input);
        endTime = System.nanoTime();
        long pointerTime = endTime - startTime;

        System.out.println("Stack Method Result: " + result1);
        System.out.println("Execution Time (Stack): " + stackTime + " ns");

        System.out.println("Two Pointer Result: " + result2);
        System.out.println("Execution Time (Two Pointer): " + pointerTime + " ns");

        sc.close();
    }
}