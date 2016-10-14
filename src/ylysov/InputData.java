package ylysov;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputData {

    static int x = 0;
    public static  int inputValue() {

        Scanner in = new Scanner(System.in);
        int s1 = 0;

        try {
            s1=in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You have entered wrong value!");
        }
        return s1;

    }

}
