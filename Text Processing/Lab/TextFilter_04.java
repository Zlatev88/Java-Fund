package TextProcessing_Lab;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();


        for(String word : bannedWords) {

            if (text.contains(word)) {
                String replacement = replacement("*", word.length());
                 text = text.replace(word, replacement);
            }

        }System.out.println(text);

    }

    private static String replacement (String str, int length) {
        String replacement = "";
        for (int i = 0; i < length; i++) {
            replacement+= str;

        }return  replacement;

    }
}
