import java.util.Scanner;

public class PalindromeCheckerApp {

    // Node class for Singly Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker App");
        System.out.println("UC8: Linked List Based Palindrome Checker");
        System.out.print("Input : ");
        String input = sc.nextLine();

        // 1. Convert string to linked list
        Node head = null, tail = null;

        for (int i = 0; i < input.length(); i++) {
            Node newNode = new Node(input.charAt(i));
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        boolean isPalindrome = true;

        if (head != null && head.next != null) {

            // 2. Find middle using Fast & Slow pointer
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // 3. Reverse second half
            Node prev = null;
            Node current = slow;

            while (current != null) {
                Node nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }

            // 4. Compare first half and reversed second half
            Node firstHalf = head;
            Node secondHalf = prev;

            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data) {
                    isPalindrome = false;
                    break;
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }
        }

        // 5. Print result
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}