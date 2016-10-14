package ylysov;


public class ArrayLoop {
    public static int[] arrayX = {1,2,3,5,8,13,21,34};

    public static void findMinMax(){
        int min=arrayX[0];
        int max=arrayX[0];
        for(int c=0;c<arrayX.length;c++){
            if(arrayX[c]<min){
                min=arrayX[c];
            }
            else if(arrayX[c]>max){
                max=arrayX[c];
            }
        }
        System.out.println("The minimum value in the array is: "+ min);
        System.out.println("The maximum value in the array is: "+ max);
    }


    public void printValues () {
        System.out.println("Using forEach method: ");
        for (int x : arrayX) {
            System.out.print(x + " ");
        }
    }

    public void printValuesWhile () {
        System.out.println(" ");
        System.out.println("Using While method: ");

        int i=0;
        while (i< arrayX.length ) {
            System.out.print(arrayX[i] + " ");
            i++;
        }
    }

    public void printValuesDoWhile () {
        System.out.println(" ");
        System.out.println("Using DoWhile method: ");

        int i=0;
        do {
            System.out.print(arrayX[i] + " ");
            i++; }
        while (i< arrayX.length );
    }

    public void printValuesFor () {
        System.out.println(" ");
        System.out.println("Using For method: ");
        int sum = 0;
        for (int x=0; x < arrayX.length; x++) {
            sum = sum + arrayX[x];
            System.out.println("The sum of all previous values is: " + sum);	}

    }
}
