import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println(findSymbolOccurance("Hello World!", 'l'));


        System.out.println("Result: " + findWordPosition("Hello World!", "World"));

        String original = "Hello World!";
        String reversed = stringReverse(original);
        System.out.println(original + " -> " + reversed);


        String testPalindrome1 = "ERE";
        System.out.println(isPalindrome(testPalindrome1));

        String testPalindrome2 = "Allo";
        System.out.println(isPalindrome(testPalindrome2));


        String[] words = new String[]{
                "apple", "orange", "lemon",
                "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon",
                "leak", "kiwi", "mango",
                "mushroom", "nut", "olive",
                "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};


        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int randomIndex = random.nextInt(words.length); // Випадковий індекс
        String secretWord = words[randomIndex];

        String guessedWord = "null";

        while (!guessedWord.equals(secretWord)) {
            System.out.print("Guess the word: ");
            guessedWord = console.nextLine();


            if (guessedWord.equals(secretWord)) {
                System.out.println("That’s right! I made a word:" + secretWord);
            } else {
                String result = "";
                for (int i = 0; i < 15; i++) {
                    if (i < guessedWord.length() && i < secretWord.length() && secretWord.charAt(i) == guessedWord.charAt(i)) {
                        result += secretWord.charAt(i);
                    } else {
                        result += "#";
                    }
                }
                System.out.println(result);
            }

        }

    }

    public static int findSymbolOccurance(String str, char symbol) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }


    public static String stringReverse(String string) {
        char[] reverse = string.toCharArray();
        for (int i = 0; i < (string.length() / 2); i++) {
            char temp = reverse[i];
            reverse[i] = reverse[string.length() - 1 - i];
            reverse[string.length() - 1 - i] = temp;
        }
        return new String(reverse);
    }


    public static boolean isPalindrome(String palindrome) {
        char[] palindromes = palindrome.toCharArray();
        for (int i = 0; i < palindrome.length() / 2; i++) {
            if (palindromes[i] != palindromes[palindrome.length() - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}


