import java.util.Scanner;

public class QueuesandStackes18 { 
    

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        scanner.close();

       
        checkAndPrintPalindrome(input);
    }

    public static void checkAndPrintPalindrome(String str) {
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false; // Characters do not match, not a palindrome
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("The word, " +str+ ", is a palindrome.");
        } else {
            System.out.println("The word, " +str+ ", is not a palindrome.");
        }
    }
}