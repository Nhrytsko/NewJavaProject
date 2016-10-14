package ylysov;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInput {

    public static void findMultiplier() {

        Scanner in = new Scanner(System.in);

        String notEnd;

        do {

            ArrayList<Integer> multylist = new ArrayList<Integer>();
            System.out.print("Enter a number : ");
            String n1=in.next();
            try {
                int n = Integer.parseInt(n1);
                for (int i=2; i<n; i++) {
                    if ((n % i ) == 0 && i!=0 && i!=1)
                        multylist.add(i);

                }
                if (multylist.isEmpty()) {
                    System.out.println("There are no multipliers for number " + n);
                }
                else if(multylist.size()==1) {
                    System.out.println("The only multiplier of number " + n + " is " + multylist);
                }
                else {
                    System.out.println("The multipliers of number " + n + " are " + multylist);
                }

            }  catch (NumberFormatException e) {System.out.println("Wrong format. You should enter a number!");
            }
            finally {
                System.out.print("Do you want to enter a next number? (Y/N) ");
                notEnd = in.next();

            }

        } while(notEnd.equals("Y")||notEnd.equals("y"));
    }

    public static void findAnswer() {

        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;
        String notEnd;

        do {
            System.out.print("Enter a number : ");
            s1=sc.next();
            try {
                double d1 = Double.parseDouble(s1);
                System.out.print("Enter a number : ");
                s2=sc.next();

                    double d2 = Double.parseDouble(s2);
                    System.out.print("Enter a math operator or press enter (values will be added by default) : ");
                    s3=sc.nextLine();
                    s3=sc.nextLine();

                    double result = 0;
                    switch (s3) {
                        case "+":
                            result = MathOperations.addValues(d1, d2);
                            break;
                        case "-":
                            result = MathOperations.subtractValues(d1, d2);
                            break;
                        case "*":
                            result = MathOperations.multiplyValues(d1, d2);
                            break;
                        case "/":
                            result = MathOperations.divideValues(d1, d2);
                            break;
                        case "":
                            result = MathOperations.addValues(d1, d2);
                            break;
                        default:
                            System.out.println("You should enter a math operator");
                            break;
                    }
                    if (result>0){
                System.out.println("The answer is " + result);}


            } catch (NumberFormatException e) {
                System.out.println("Wrong format. You should enter a number!");
            }
            finally {
                System.out.print("Calculate again? (Y/N) ");
                notEnd = sc.next();
            }

        } while(notEnd.equals("Y")||notEnd.equals("y"));
    }

}