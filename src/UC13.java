import java.util.*;

public class UC13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();

        long start1 = System.nanoTime();
        boolean result1 = checkUsingReverse(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = checkUsingStack(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = checkUsingTwoPointer(input);
        long end3 = System.nanoTime();

        System.out.println("Reverse Method -> " + result1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method   -> " + result2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Two Pointer    -> " + result3 + " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }

    public static boolean checkUsingReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static boolean checkUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkUsingTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}