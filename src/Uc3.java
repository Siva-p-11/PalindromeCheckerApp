import java.util.Scanner;
public class Uc3 {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.print("enter a txt: ");
      String text = input.nextLine();

      String reversed = "";

      for (int i = text.length() - 1; i >= 0; i--) {
          reversed = reversed + text.charAt(i);
          }



      if (text.equals(reversed)) {
          System.out.println("It is a Palindrome.");
      } else {
          System.out.println("It is NOT a Palindrome.");
      }

  }
}
