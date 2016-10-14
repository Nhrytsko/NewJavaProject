
package ovol;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  class Prog  {

    FunnyClass obj1 = new FunnyClass();
    Exception obj2 = new Exception();

    public void STR(int[] array) throws IOException {
        String choice = getInput("Make your choice 1-FOR, 2-FOREACH, " +
                "3-WHILE, 4-DOWHILE, 5-SWITCH, 6-SimplePrint, 7-Exception : ");
        int ch = Integer.parseInt(choice);
        switch (ch) {
            case 1:
                obj1.FORloop(array);
                break;
            case 2:
                obj1.FOREACHloop(array);
                break;
            case 3:
                obj1.WHILEloop(array);
                break;
            case 4:
                obj1.DOWHILEloop(array);
                break;
            case 5:
                obj1.SWITCHloop(array);
                break;
            case 6:
                obj1.Print(array);
                break;
            case 7:
                obj2.REsult();
                break;
            default:
                System.out.println("Warning. Please make right choice!");
        }
    }


    private static String getInput(String prompt) throws IOException {
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print(prompt);
        System.out.flush();
        try {
            return stdin.readLine();
        } catch (IOException e) {
            e.getMessage();
        }
        return "Please enter numeric value";
    }


}


// System.out.println(chars);
// System.out.println(strings);






