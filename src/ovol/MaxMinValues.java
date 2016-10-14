package ovol;

import java.util.Arrays;

/**
 * Created by ovo on 26.11.2015.
 */
public class MaxMinValues {
    static int[] valuesA = {245, -125, 88, 33, 18, 60, 1, 3, 5, -2, 55, 7, 9, 11, 0, 35};


    public static void compareValues() {
        System.out.println("The original array of values is : " + Arrays.toString(valuesA));
        Arrays.sort(valuesA);
        System.out.println("The sorted array of values is : " + Arrays.toString(valuesA));
        System.out.println("The minimum value of Array is: " + valuesA[0]);
        System.out.println("The maximum value of Arra is : " + valuesA[valuesA.length - 1]);
    }


    public static void anotherMinMaxValue() {
        System.out.println("The original array of values is : " + Arrays.toString(valuesA));
        int minValue = 0;
        int maxValue = 0;
        for (int i = 0; i < valuesA.length; i++) {
            if (valuesA[minValue] > valuesA[i]) {
                minValue = i;

            } else if (valuesA[maxValue] < valuesA[i]) {
                maxValue = i;

            }
        }
        System.out.println("The minimum value is: " + valuesA[minValue]);
        System.out.println("The maximum value is: " + valuesA[maxValue]);

    }

    public static void forEachMaxMin() {
        System.out.println("The original array of values is : " + Arrays.toString(valuesA));
        int valueToCompare =valuesA[0];
        int i;
        for (int b:valuesA){
            valueToCompare=(valueToCompare< b)? valueToCompare:b;}
        System.out.println("Thew minimum value is: " + valueToCompare);

        for (int z:valuesA){
            valueToCompare=(valueToCompare>z)?valueToCompare:z;}
        System.out.println("Thew maximum value is: " + valueToCompare);

        }



        }








