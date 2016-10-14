package ovol;

/**
 * Created by ovo on 24.11.2015.
 */
public class Exception {

    int a = 10;
    int b = 0;

    public void REsult() {

        try {
            int y = a / b;
            System.out.println(y);
        } catch (ArithmeticException e) {
            System.out.println("You couldn't divide on zero");
        }


    }
}
