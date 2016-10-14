package nhrytsko;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator {
    public static String getInput(String prompt){
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(prompt);
        System.out.flush();

        try{
            return stdin.readLine();
        } catch (Exception e){
            return "Error: " + e.getMessage();
        }
    }

    public static void ScInput(){
        Scanner sc = new Scanner(System.in);

        Double s1, s2;

        s1 = sc.nextDouble();
        s2 = sc.nextDouble();

        System.out.println(s1+s2);
    }
}
