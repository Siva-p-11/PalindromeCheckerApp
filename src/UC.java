import java.util.Scanner;

class PalindromeService {

    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        input = input.replaceAll("\\s+", "").toLowerCase();

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
}