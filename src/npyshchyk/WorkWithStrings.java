package npyshchyk;

public class WorkWithStrings {
	
	private static String str = "Simple. manipulations. with. Strings.";
	private char charArray[] = str.toCharArray();
	
	public void strBeforeDot(){
		int indexOfDot = str.indexOf(".");
		
		System.out.println("Original string is:");	
		System.out.println(str);
		System.out.println("String before first dot is:");	
		
	// Print string till the first dot
		for (int i = 0; i<indexOfDot; i++) {			
				System.out.print(charArray[i]);				
			}			
	}
	
	// Count spaces in initial string
	public void numberOfSpaces() {
		int countSpaces = 0;
		
		for (int i = 0; i<charArray.length; i++){
			if (charArray[i] == ' ') {
				countSpaces++;			
			}
		}
		
		System.out.print(countSpaces);	
	}

}
