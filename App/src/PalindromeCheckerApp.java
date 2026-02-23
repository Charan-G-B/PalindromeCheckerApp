import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("UC7: Deque-Based Optimized Palindrome Checker");
        System.out.print("Input : ");
        String input = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        // 1. Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // 2. Remove first & last and compare
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // 3. Print result
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}