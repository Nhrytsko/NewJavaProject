package ovol;

/**
 * Created by Demon on 28.11.2015.
 */
public class ValuesForAlex {
    String inText = "Hello , have a nice    DAY.   HEY";//create string
    String newText = "Happy New Year. Ho-ho-ho!";//create string
    String happyText = "This   is   a  simple string. Not difficult";//create string
    String[] strings = {"Alex", "Bill", "Colt"};//create string array

    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//create in array

    char[] chars = {'a', 'b', 'c'};//create char array
    char[] textChar = newText.toCharArray();//convert string to array of characters
    char[] toChar = happyText.toCharArray();//convert string to array of characters
    char dotA = '.', whiteSpace = ' ';//create character variables
    char dotB = '.', whiteSpace2 = ' ';//create character variables
    char dotC = '.', whiteSpace3 = ' ';//create character variables

    private double aF = 10, bF = 15, cF = 20;

    public double getValueA() {

        return aF;
    }

    public double getValueB() {

        return bF;
    }

    public double getValueC() {

        return cF;

    }
    static  ValuesForAlex valueS = new ValuesForAlex();
    static double  valueA = valueS.getValueA();
    static double valueB = valueS.getValueB();
    static double valueC = valueS.getValueC();

    /*double valueA = getValueA();
    double valueB = getValueB();
    double valueC = getValueC();*/
}
