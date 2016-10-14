package adym;

import java.io.*;

public class MyCalculator {

	public static void MyCalculatorMethod(){

		String a1 = getInput("Enter a numeric value:");
		String a2 = getInput("Enter a numeric value:");

		Double d1 = Double.parseDouble(a1);
		Double d2 = Double.parseDouble(a2);
		Double result = d1 + d2;

		System.out.println("Result is:" + result);

/*		if (a1, a2) {*/
/*
		} else {

		}*/
	}
	private static String getInput(String prompt){
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.print(prompt);
		System.out.flush();

		try{
			return stdin.readLine();
		}catch (Exception exc){
			return "Error:" + exc.getMessage();

		}
	}



}

