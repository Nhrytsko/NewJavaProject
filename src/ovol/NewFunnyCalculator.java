package ovol;


import java.io.IOException;

/**
 * Created by ovo on 26.11.2015.
 */
public class NewFunnyCalculator {

    public void toCalculate() throws IOException {

        double a = InputClass.scannerForInputNum();
        double b = InputClass.scannerForInputNum();
        String op = InputClass.scannerForInputOp();


        switch (op) {
            case "-":
                System.out.println("Result of substraction is: " + OperationsWithValues.SubValues(a, b));
                break;
            case "*":
                System.out.println("Result of multiple is: " + OperationsWithValues.MulValues(a, b));
                break;
            case "/":
                System.out.println("Result of division is: " + OperationsWithValues.DivValues(a, b));
                break;
            case "":
                System.out.println("Result of adding is: " + OperationsWithValues.AddValues(a, b));
                break;
            case "+":
                System.out.println("Result of adding is: " + OperationsWithValues.AddValues(a, b));
                break;
            default:
                System.out.println("Result of adding is: " + OperationsWithValues.AddValues(a, b));
                break;
        }
    }

    }


