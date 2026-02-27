import java.util.Scanner;
public class Us2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter a txt: ");
        String text = input.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                isPalindrome = false;
                break;

    }

}

        if (isPalindrome) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

    }
}
