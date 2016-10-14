package ovol;

import java.util.Arrays;

public class AM {

    int i;

    public void Print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public void FORloop(int[] array) {

        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void FOREACHloop(int[] array) {

        for (int b : array) {
            System.out.println(array[i]);
            i = +b;
        }
    }

    public void WHILEloop(int[] array) {

        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }

    public void DOWHILEloop(int[] array) {

        do {
            System.out.println(array[i]);
            i++;
        } while (i < array.length);
    }

    public void SWITCHloop(int[] array) {

        for (i = 0; i < array.length; i++)
            switch (i) {
                case 0:
                    System.out.println(array[i]);
                    break;
                case 1:
                    System.out.println(array[i]);
                    break;
                case 2:
                    System.out.println(array[i]);
                    break;
                case 3:
                    System.out.println(array[i]);
                    break;
                case 4:
                    System.out.println(array[i]);
                    break;
                case 5:
                    System.out.println(array[i]);
                    break;
                case 6:
                    System.out.println(array[i]);
                    break;
                case 7:
                    System.out.println(array[i]);
                    break;
                case 8:
                    System.out.println(array[i]);
                    break;
                case 9:
                    System.out.println(array[i]);
                    break;
                default:
                    System.out.println("Out of boundaries");


            }

    }

}





