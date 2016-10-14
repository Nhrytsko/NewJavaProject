package nhrytsko;

public class Operators {

    public void CaseOperator(char input, char answer){
        if (input == answer) i = 1;
        else i = 0;

        switch (i){
            case 0: System.out.println("You can try once more");
                break;
            case 1: System.out.println("You're right");
                break;
            default: System.out.println("Well done!");
        }
    }

    public void ForOperator(String [] arrayOfStrings){
        for (i = 0; i<=arrayOfStrings.length; i++){
            if (i == 2) break;
            System.out.println(arrayOfStrings[i]);
        }
    }

    public void ForEachOperator(String [] arrayOfStrings){
        for (String arr: arrayOfStrings) {
            System.out.println(arr);
        }
    }

    public void WhileOperator(String [] arrayOfStrings){
        while ( i < arrayOfStrings.length){
            System.out.println(arrayOfStrings[i]);
            i++;
        }
    }

    public void DoWhileOperator(String [] arrayOfStrings){
        i = 0;
        do {
            System.out.println("1");
            i++;
        }
        while (i < arrayOfStrings.length);
        }
    int i = 0;

    public void PassParametersByValue (double ... values){
        for (double val : values){
            val++;
            System.out.println("Value inside the method that is passed by value: "+val);
        }
    }

    public double PassParametersByReference(double [] arrayOfDoubles) {
        arrayOfDoubles[0]++;
            System.out.println("Value is passed by value: "+arrayOfDoubles[0]);
        return arrayOfDoubles[0];
}
}
