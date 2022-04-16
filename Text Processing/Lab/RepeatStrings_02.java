package TextProcessing_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();
        for (String element : words) {
            int wordLength = element.length();

            for (int i = 0; i < wordLength; i++) {
                result.append(element);
            }

        }
        System.out.println(result);

        }
    }

