package nhrytsko;

public class GettersAndSetters {

    //Create a constructor without parameters
    public GettersAndSetters(){}
    public int a;
    public int b;

    //Declare constant as Enum
    public static final long CONSTANT1 = 11111;
    public static final long CONSTANT2 = 22222;

    //Create a constructor with parameter for class
    public GettersAndSetters (int value){
        setSomeValue(value);
    }

    //Declare private field
    private int someValue;

    //Use setter
    public void setSomeValue (int value){
        this.someValue = value;
    }

    //Use getter
    public int getSomeValue(){
        return someValue;
    }
}
