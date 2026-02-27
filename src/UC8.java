import java.util.Scanner;
public class UC8 {
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


        System.out.print("enter a string: " );
        String input = sc.nextLine();


        Node head = null;
        Node tail = null;


        for (char c : input.toCharArray()){
            Node newNode = new Node(c);
            if(head == null) {
                head = newNode;
                tail = newNode;


            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        if (head == null || head.next == null){
            System.out.println("is palindrome?: true ");
        }
        Node slow = head;
        Node fast = head;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        Node prev = null;
        Node current = slow;
        Node next = null;


        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }


        Node firstHalf = head;
        Node secondHalf = prev;
        boolean isPalindrome = true;


        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }


        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

