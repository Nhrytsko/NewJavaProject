package adym;

/**
 * Created by adym on 27.11.2015.
 */
public class FindMinArray {
        public static void FindMinArray1(){

            int[] numbers={1,2,3,-8}; //declare the integer
//Where we going to Find the minimum
            int min = numbers[0]; //declare the min variable and we initialize it to the first element of the array
            for (int i=1;i<numbers.length;i++){ //we going to do a loop,we create a little counter(e.g "int OperationsWithValues") that going to go through all elements from array until it find the min value from there
                if(numbers[i]<min) ///here we going to check each value whether it is less then min
                    min=numbers[i]; //then if value will be less then min it will be stored here
            }
            System.out.println("Minimum: "+min);
        }
    }



//   FindMinArray.FindMinArray1();