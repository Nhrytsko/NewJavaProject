package nhrytsko;

public class WorkingWithArrays {

    int [] arr;
    public WorkingWithArrays(){
    }

    public void showMinVal(int [] arrayOfInts){
        int m;
        if (arrayOfInts.length == 0) System.out.println("You have no arguments in array");

        m = arrayOfInts[0];

        for (int a : arrayOfInts){
            if (a<m) m=a;
        }

        System.out.println("Min value in array is "+m);
    }

    public void showMinValOtherVers(int [] arrayOfInts){
        int m;
        if (arrayOfInts.length == 0) System.out.println("You have no arguments in array");

        m = arrayOfInts[0];

        for (int a : arrayOfInts){
            m = (a<m)? a : m ;
        }

        System.out.println("Min value in array is "+m);
    }

    public void linearSearch(int [] arrayOfInts){
        int a = 10;
        for (int i =0; i<arrayOfInts.length; i++) {
            if (arrayOfInts[i] == a) System.out.println("You've searched for " + arrayOfInts[i] + " with index " + i);
        }
    }

    public int binarySearch(int[] arr, int key) {
       int low = 0;
       int high = arr.length-1;
        int mid;
        while (low <= high){
            mid = (low+high)/2;

            if (arr[mid]>key) high=mid-1;
            else if (arr[mid]<key) low=mid+1;
            else return arr[mid];
        }
        return -1;
    }

    public void insertionSort (int [] arrayOfInts){
        for (int j = 1; j<arrayOfInts.length; j++){
            int key = arrayOfInts[j];
            int i = j-1;
            while ((i>-1) && (arrayOfInts[i] > key)){
                arrayOfInts[i+1] = arrayOfInts[i];
                i--;
            }
            arrayOfInts[i+1] = key;
            showNumbers(arrayOfInts);
        }
    }

    public int [] countingSort(int [] arrayOfInts){
        int max = arrayOfInts[0];
        for (int i = 0; i<arrayOfInts.length; i++){
            if (arrayOfInts[i]>max) max = arrayOfInts[i];
        }
        int [] sortedIntegers = new int[max+1];

        for (int i = 0; i<arrayOfInts.length; i++){
            sortedIntegers[arrayOfInts[i]]++;
        }

        int inserPosition = 0;

        for (int i = 0; i<=max; i++){
            for (int j = 0; j < sortedIntegers[i]; j++){
                arrayOfInts[inserPosition] = i;
                inserPosition++;
            }
        }
        return arrayOfInts;
    }

    public void showNumbers(int [] arrayOfInts){
        for (int i = 0; i<arrayOfInts.length; i++){
            System.out.print(arrayOfInts[i] + ", ");
        }
        System.out.println("\n");
    }
}
