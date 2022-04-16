package TextProcessing_Lab;

import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder digit = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder other = new StringBuilder();


        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);

            if (Character.isDigit(currentSymbol)) {
                digit.append(currentSymbol);


            }
             else if (Character.isLetter(currentSymbol))  {
                letter.append(currentSymbol);



            }
            else {
                other.append(currentSymbol);


            }


        }
        System.out.println(digit);
        System.out.println(letter);
        System.out.println(other);

    }
}
