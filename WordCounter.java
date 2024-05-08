import java.util.Scanner;
import java.util.regex.Pattern;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Word Counter!");
        System.out.print("Enter a text or provide a file (type 'file' to read from a file): ");
        String input = scanner.nextLine();

        String text;
        if (input.equalsIgnoreCase("file")) {
            text = "This is a sample text. Count the words in this text!";
        } else {
            text = input;
        }
        String[] words = text.split("[\\s.,;!?]+");
        int wordCount = words.length;
        System.out.println("Total words: " + wordCount);

        
        scanner.close();
    }
}