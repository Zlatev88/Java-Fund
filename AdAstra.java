import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "(?<symbols>[#\\|])(?<name>[A-za-z\\s]+)(\\1)(?<date>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2})(\\1)(?<calories>[\\d]{1,5})(\\1)";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int sumCalories = 0;
        List<String> items = new ArrayList<>();
        while (matcher.find()) {

            String product = matcher.group("name");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            sumCalories+= calories;
            items.add(String.format("Item: %s, Best before: %s, Nutrition: %d%n", product,date,calories));

        }

        System.out.printf("You have food to last you for: %d days!%n", sumCalories/2000);
        for (String item : items) {
            System.out.print(item);
        }
    }
}