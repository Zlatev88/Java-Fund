package TextProcessing_Lab;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();

        while (!word.equals("end")) {
            String reversed = "";
            for (int i = word.length()-1; i >= 0; i--) {
                char currentSymbol = word.charAt(i);
                reversed += currentSymbol;

            }

            System.out.println(word + " = " + reversed);
            word = scanner.nextLine();
        }


    }
}
