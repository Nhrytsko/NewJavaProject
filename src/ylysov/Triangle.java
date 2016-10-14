package ylysov;

public class Triangle implements ShapeBasicProperties{

    double a=0;
    double b=0;
    double c=0;


    public double getA() {
        return a;
    }
    public void setA() {
        System.out.print("Enter the size of the first side of triangle:  ");
        InputData x = new InputData();
        double y = x.inputValue();

        if (y > 0) {
            a = y;
            setB();
        }
    }

    public double getB() {
        return b;
    }
    public void setB() {
        System.out.print("Enter the size of the second side of triangle:  ");
        InputData x = new InputData();
        double z=0;
        z = x.inputValue();

        if (z > 0) {
            b = z;
            setC();

        }

    }

    public double getC() {
        return c;
    }
    public void setC() {
        System.out.print("Enter the size of the third side of triangle:  ");
        InputData x = new InputData();
        double y = x.inputValue();

        if (y > 0) {
            c = y;
        }
    }

    public void findPerimeter(){
        double P = a+b+c;
        if (a>0 && b>0 && c>0) {
            System.out.println("Perimeter of the triangle equals - "+ P);
        }
    }
    public void findSquare(){
        double p1 = (a+b+c)/2;
        double d =p1*(p1-a)*(p1-b)*(p1-c);
        double S = Math.sqrt(d);

        if (a>0 && b>0 && c>0) {
            System.out.println("Square of the triangle equals - "+ S);
        }
    }
}