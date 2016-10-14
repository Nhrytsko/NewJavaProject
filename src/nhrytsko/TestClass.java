package nhrytsko;

public class TestClass extends Operators {
    String variable = "Class Method Variable";

    public  void lambdaExpression(){
        String variable = "Method Local Variable";

        new Thread(() -> {
                System.out.println("->" + variable);
                System.out.println("->" + this.variable);
        }).start();
    }
}