import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker App");
        System.out.println("UC5: Stack-Based Palindrome Checker");
        System.out.print("Input : ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // 1. Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // 2. Pop and compare
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // 3. Print result
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}