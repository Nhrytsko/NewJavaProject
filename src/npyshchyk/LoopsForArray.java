package npyshchyk;

import java.util.Random;

public class LoopsForArray {
	
	// fill array with random int values
		public static int[] fillTheArray(int[] anArray) {
			
			Random rand = new Random();
		    for(int i=0;i<anArray.length;i++)
		    {
		        anArray[i] = rand.nextInt(100);
		    }
		    return anArray;
		}	
		
		// For loop
		public static void printArrayFor(int[] anArrayToPrint){
	        for(int i = 0; i<anArrayToPrint.length; i++){
	        System.out.println("Element " + i + ":  " + anArrayToPrint[i]);
	        }
	    }	

		// For Each loop
		public static void printArrayForEach(int[] anArrayToPrint){
		int index = 0;
	        for(int n : anArrayToPrint){
	        System.out.println("Element :  " + index + ": " + n);
	        index++;
        }
			
			/*try {
				for(int n: anArrayToPrint){
				    System.out.println("Element " + anArrayToPrint[n]);
				    }
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("There was an error");
			}
			
			System.out.println("The application is still runing!");	*/
	    }
		
		// While loop
		public static void printArrayWhile(int[] anArrayToPrint){
			int i = 0;
			while(i<anArrayToPrint.length){
				System.out.println("Element " + i + ":  " + anArrayToPrint[i]);
				i++;
			}
		}
		
		//Do While
		public static void printArrayDoWhile(int[] anArrayToPrint){
			int i = 0;
			do {
				System.out.println("Element " + i + ":  " + anArrayToPrint[i]);
				i++;
			}while(i<anArrayToPrint.length);
		}

}
