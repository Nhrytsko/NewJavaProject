package ovol;

/**
 * Created by ovo on 30.11.2015.
 */
public class OperationsWithValues  {


    public static double AddValues(double a, double b){
        double sum = a + b;
        return sum;
    }

    public static double SubValues(double a, double b){
        double sub = a - b;
        return sub;
    }
    public static double MulValues(double a, double b){
        double mul = a * b;
        return mul;
    }
    public static double DivValues(double a, double b) {
        double div = a / b;
        return div;
    }
    static  ValuesForAlex valueS = new ValuesForAlex();
    static double  valueA = valueS.getValueA();
    static double valueB = valueS.getValueB();
    static double valueC = valueS.getValueC();

    public static void rectangleSquare(){

        double recSQ = valueA*valueB;
        //return recSQ;
        System.out.println("The triangle square is: " + recSQ);
    }
    public static void rectanglePerimeter(){
        double recPM = 2*(valueA+valueB);
        //return recPM;
        System.out.println("The triangle perimeter is: " + recPM);
    }
    public static void triangleSquare() {
        double triP =(valueA+valueB+valueC)/2;
        double triSQ =Math.sqrt((triP*(triP-valueA)*(triP-valueB)*(triP-valueC)));
        //return triSQ;
        System.out.println("The triangle square is: " + triSQ);
    }
    public static void trianglePerimeter(){
        double triPM =(valueA+valueB+valueC)/2;
        //return triPM;
        System.out.println("The triangle perimeter is: " +  triPM);
    }


}
