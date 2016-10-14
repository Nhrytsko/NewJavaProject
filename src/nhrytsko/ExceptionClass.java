package nhrytsko;

public class ExceptionClass {

    public void ExceptionThrowing(int index, int [] someArray) throws ArrayIndexOutOfBoundsException{
        System.out.println(someArray[index]);
    }
}
