package ylysov;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionWD {
    public static void typeDay() {
        String [] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thurthday", "Friday", "Saturday"};

        String input=getInput("Type number between 1 to 7 for corresponding day of week: ");

        try {
            int dayN=Integer.parseInt(input);
            int n=0;
            n = dayN-1;
            try {
                System.out.println("It is " + weekdays[n] + " today.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("You are out of the range! Please select number between 1 to 7.");
            }

        } catch (NumberFormatException e) {
            System.out.println("You need to enter a number!");
        }


    }

    private static String getInput(String prompt) {
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print(prompt);
        System.out.flush();

        try {
            return stdin.readLine();
        } catch (IOException e) {
            return "Error: " + e.getMessage();
        }
    }
}

