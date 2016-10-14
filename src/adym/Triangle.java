package adym;

/**
 * Created by adym on 03.12.2015.
 */

public class Triangle extends Figure {
    public Triangle(double a, double b){
        super(a , b);
    }
    // перевизначення метода area для прямокутного трикутника
    public double area(){
        System.out.println("Плоша Трикутника! ");
        return dim1 * dim2 /2;
    }

    public double perimeter(){

        System.out.println("Периметр Трикутника! ");
        return 3 * dim1;
    }
}

