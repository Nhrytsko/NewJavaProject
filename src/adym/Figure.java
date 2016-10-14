package adym;

/**
 * Created by adym on 03.12.2015.
 */

public class Figure {
  double dim1;
   double dim2;

    public Figure(double dim1,double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }

    public double area(){

        System.out.println("Плоша фігури не визначена.");

        return 0;
    }

    public double perimeter(){
        System.out.println("Периметр фігури не визначений.");

        return 0;
    }
}



/*Figure f = new Figure(10, 10);
Rectangle r = new Rectangle(9, 5);
 Triangle t = new Triangle(10, 8);

      Figure figref;
      figref = r;
        System.out.println("Площа чотирикутника рівна: " + figref.area());
        System.out.println("Периметр чотирикутника рівна: " + figref.perimeter());

        figref = t;
        System.out.println("Площа трикутника рівна: " + figref.area());
        System.out.println("Периметр чотирикутника рівна: " + figref.perimeter());

        figref = f;
        System.out.println("Площа фігури рівна: " + figref.area());
        System.out.println("Периметр чотирикутника рівна: " + figref.perimeter());
*/
