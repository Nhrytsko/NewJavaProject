package adym;

/**
 * Created by adym on 27.11.2015.
 */
public class StringManipulation {
        public static void StringManipulation(){

//1. Написати аплікацію, яка буде виводити символи з стрічки(стрічку придумуєте якусь таку, де є і пробіли і крапки) до першої крапки.
            String str = "Hello Everybody.!.!.17656 ";
            char[] c1 = str.toCharArray(); //convert string to characters
            char c2= '.';
            char c3= ' ';
            for (char c : c1) {
                if (c != c2) System.out.println(c);
                else break;

            }    //2.Також в кінці програми повинна виводитись кількість пробілів.
            int k=0;
            for (char c : c1) {
                if (c==c3){
                    k++;
                }
            }
            System.out.println();
            System.out.println("Number of whitespaces is:"+k);
        }
    }

