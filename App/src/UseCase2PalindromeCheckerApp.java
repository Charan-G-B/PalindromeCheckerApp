import java.util.Scanner;

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Input text: ");
        String word = scanner.nextLine();

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome and store boolean result
        boolean isPalindrome = word.equals(reversed);

        // Print result in required format
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
