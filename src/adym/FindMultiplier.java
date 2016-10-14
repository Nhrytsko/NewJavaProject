package adym;
import java.util.Scanner;

/**
 * Created by adym on 29.11.2015.
 */
public class FindMultiplier {
    //To check if num1 is a multiple of num2


        public static void MultiplierOperation() {

            Scanner reader = new Scanner(System.in);
            Scanner readerTwo = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num1 = reader.nextInt();
            System.out.println("Enter another number:");
            int num2 = readerTwo.nextInt();

            if((num1 % num2) == 0) {
                System.out.println("Yes! " + num1 + " is a multiple of " + num2 + "!");
            }
            else {
                System.out.println("No! " + num1 + " is not a multiple of " + num2 + "!");
            }
            reader.close();
            readerTwo.close();
        }
    }

//   FindMultiplier.MultiplierOperation();
