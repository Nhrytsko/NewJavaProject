package ovol;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static ovol.Regex.RegexNumInp;
import static ovol.Regex.RegexOpInp;

/**
 * Created by ovo on 27.11.2015.
 */
public class InputClass {
    public static double scannerForInputNum() throws IOException {
        Scanner lookForNum = new Scanner(System.in);
        String y = lookForNum.toString();
        //double x = Double.parseDouble(y);

        do {
            try {
                System.out.print("Please enter numeric value: ");
                String getInputNum = lookForNum.nextLine();
                double numericValue = Double.parseDouble(getInputNum);
                System.out.println("The numeric value is: " + getInputNum);
                return numericValue;
            } catch (NumberFormatException e) {
                System.out.println("You entered wrong value!");
            } catch (InputMismatchException e) {
                System.out.println("You entered wrong value!");
            }
        } while (RegexNumInp(y));
        return scannerForInputNum();

    }


    public static String scannerForInputOp() throws IOException {
        Scanner lookForVal = new Scanner(System.in);
        String z = lookForVal.toString();

        do {
            try {
                System.out.print("Please enter operator +,-,*,/:  ");
                String getStringInput = lookForVal.nextLine();
                System.out.println("Chosen operator is: " + getStringInput);
                return getStringInput;
            } catch (InputMismatchException e) {
                System.out.println("Wrong choice!.Please choose operator *, /, -");
            } catch (TypeNotPresentException e) {
                System.out.println("Wrong choice!.Please choose operator *, /, -");
            }
        } while (RegexOpInp(z));
        return scannerForInputOp();
    }
}






