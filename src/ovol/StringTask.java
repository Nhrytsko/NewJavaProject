package ovol;


import java.lang.reflect.Array;

/**
 * Created by ovo on 25.11.2015.
 */
public class StringTask  {
    public void charA(char whiteSpace, char dotA, String inText ) {

        int whiteSpaceAmount = 0;
        boolean isFirstDotReached = false;
        System.out.println("String before first dot: ");
        for (int i = 0; i < inText.length(); i++) {
            char c = inText.charAt(i);
            if (c != dotA && !isFirstDotReached) {
                System.out.print(c);
            } else if (!isFirstDotReached) {
                isFirstDotReached = true;
            }
            if (c == whiteSpace) {
                whiteSpaceAmount++;
            }
        }
        System.out.println("\nAmount of whitespaces is: " + whiteSpaceAmount);
    }

    public void charB(char[]textChar, char dotB, char whiteSpace2) {

        int whiteSpaces = 0;
        boolean foundDot = false;
        System.out.println("String before dot is: ");
        for (int i = 0; i < textChar.length; i++) {
            if (textChar[i] != dotB && !foundDot) {
                System.out.print(textChar[i]);
            } else if (!foundDot) {

                foundDot = true;
            }
            if (textChar[i] == whiteSpace2) {
                whiteSpaces++;
            }

        }
        System.out.println("\nNumber of whitespaces is: " + whiteSpaces);
    }

    public void charC(String happyText, char[] toChar, char dotC, char witheSpace3) {

        System.out.println("The string happyText is: " + happyText);//single output
        int i=0 ;
        /*int spacesW = 0;
        for (OperationsWithValues = 0; OperationsWithValues < happyText.charAt(OperationsWithValues); OperationsWithValues++){
            int b = happyText.indexOf(OperationsWithValues);
            if (b == whiteSpace3){
                spacesW++;
                }else if (b!=whiteSpace3);
            }
            System.out.println("There is " + spacesW + " spaces.");
*/        //  //loop for printing
            /*int lookForChar = happyText.indexOf(dotC);
            int lookForSpace = happyText.indexOf(whiteSpace3);*/
       System.out.print("The string before dot:\t ");
        while (i < toChar.length) {
            if (toChar[i] != dotC) {
                System.out.print(toChar[i]);
                i++;
            }else{
                return;
            }

             }
        }


}









