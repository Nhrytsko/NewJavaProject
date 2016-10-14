package npyshchyk;

public class Loops {
	
private static int array[] = new int[10];
	
	public static void printArray() {

		LoopsForArray.fillTheArray(array);
		System.out.println("Array of int values printed with 'For' loop :");
		LoopsForArray.printArrayFor(array);
		System.out.println();
		
		System.out.println("Array of int values printed with 'ForEach' loop :");
		LoopsForArray.printArrayForEach(array);
		System.out.println();
		
		System.out.println("Array of int values printed with 'While' loop :");
		LoopsForArray.printArrayWhile(array);
		System.out.println();
		
		System.out.println("Array of int values printed with 'Do ... While' loop :");
		LoopsForArray.printArrayDoWhile(array);
		System.out.println();
		
		// Strings handling
		WorkWithStrings str = new WorkWithStrings();
		str.strBeforeDot();
		System.out.println();
		System.out.print("Number of Spaces: ");
		str.numberOfSpaces();
		System.out.println();
		
		// Array sorting
		ArraySorting sortedArray = new ArraySorting();
		
		System.out.println("Sorted array :");
		ArraySorting.fillTheArray(array);

		int minimumValue = ArraySorting.minimumElement(array);
		System.out.println("Minimal element:   " + minimumValue);
		System.out.println();
		
		/*try {
			String[] str = {"First"};
			System.out.println(str[1]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("There was an error");
		}
		
		System.out.println("The application is still runing!");*/	
	}

}
