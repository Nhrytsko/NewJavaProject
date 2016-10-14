package adym;

/**
 * Created by adym on 03.12.2015.
 */

public class Rectangle extends Figure{
    public Rectangle(double a, double b){
        super(a,b);
    }
    //перевизначення метода area для чотирикутника
   public double area() {
        System.out.println("Плоша Прямокутника! ");
        return dim1 * dim2;
    }

    public double perimeter(){

        System.out.println("Периметр Прямокутника! ");
        return 2 * (dim1 + dim2);
    }
}
