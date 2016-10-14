package ylysov;

import java.util.Scanner;

public class SelectDialog {

    public static void SelectShape() {

        Scanner in = new Scanner(System.in);
        String notEnd;
        String s1;

        do {
            System.out.print("Select shape: 1 - circle, 2 - rectangle, 3 - triangle:  ");
            s1=in.next();
            try {
                int n = Integer.parseInt(s1);

                switch (n) {
                    case 1 :

                        Circle circle = new Circle();
                        circle.setR();
                        circle.findPerimeter();
                        circle.findSquare();
                        break;
                    case 2:

                        Rectangle rectangle = new Rectangle();
                        rectangle.setA();
                        rectangle.findPerimeter();
                        rectangle.findSquare();
                        break;
                    case 3:

                        Triangle triangle = new Triangle();
                        triangle.setA();
                        triangle.findPerimeter();
                        triangle.findSquare();

                        break;

                    default:
                        System.out.println("You need to enter number between 1 to 3.");
                        break;
                }

            } catch (NumberFormatException e) {System.out.println("You have entered wrong value!");
            }
            finally {
                System.out.print("Do you want to select another shape (Y/N) ");
                notEnd = in.next();
            }

        } while(notEnd.equals("Y")||notEnd.equals("y"));
    }
}