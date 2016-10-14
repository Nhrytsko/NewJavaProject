package npyshchyk;

import java.util.Random;

public class ArraySorting {
	
	// fill array with random int values
			public static int[] fillTheArray(int[] anArray) {
				
				Random rand = new Random();
			    for(int i=0;i<anArray.length;i++)
			    {
			        anArray[i] = rand.nextInt(100);
			    }
			    return anArray;
			}	
			
			
			public static int minimumElement(int[] anArray){

				int min = anArray[0];
				for (int i = 1; i < anArray.length; i++){
					if(anArray[i]< min){
						min = anArray[i];
					}
					System.out.println(anArray[i]);
				}
				return min;
			}

}
