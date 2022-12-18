import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {
            if (people >= 4) {
                if (arr[i] == 0) {
                    arr[i] = 4;
                    people -= 4;
                }else {
                    if (arr[i] <0) {
                        break;
                    }
                    int element = arr[i];
                    arr[i] = 4;
                    int peopleNeeded = 4 - element;
                    people = people - peopleNeeded;
                }
            } else {
                arr[i] = people;
                people-=arr[i];
            }

        }
        boolean areEmptySlots = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=4){
                areEmptySlots = true;
            }
        }
        if (areEmptySlots && people==0){
            System.out.println("The lift has empty spots!");
        }
        else if (people > 0 && !areEmptySlots){
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);}


        for (int e : arr) {
            System.out.print(e + " ");
        }


    }
}
