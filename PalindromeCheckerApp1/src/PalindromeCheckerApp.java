import java.util.*;

public class PalindromeCheckerApp {

    // 🔹 Algorithm 1: Two Pointer Approach
    public static boolean twoPointerCheck(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // 🔹 Algorithm 2: Stack Approach
    public static boolean stackCheck(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // 🔹 Algorithm 3: Reverse String Approach
    public static boolean reverseCheck(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // 🔥 Measure Two Pointer
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();

        // 🔥 Measure Stack
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        // 🔥 Measure Reverse
        long start3 = System.nanoTime();
        boolean result3 = reverseCheck(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Two Pointer Result: " + result1 + 
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Result: " + result2 + 
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Reverse Result: " + result3 + 
                " | Time: " + (end3 - start3) + " ns");

        scanner.close();
    }
}