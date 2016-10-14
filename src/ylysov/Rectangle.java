package ylysov;

public class Rectangle implements ShapeBasicProperties{

    int a=0;
    int b=0;


    public int getA() {
        return a;
    }
    public void setA() {
        System.out.print("Enter the size of the first side of rectangle:  ");
        InputData x = new InputData();
        int y = x.inputValue();

        if (y > 0) {
            a = y;
            setB();
        }
    }
    public int getB() {
        return b;
    }
    public void setB() {
        System.out.print("Enter the size of the second side of rectangle:  ");
        InputData x = new InputData();
        int y = x.inputValue();

        if (y > 0) {
            b = y;
        }
    }
    public void findSquare(){
        int S = a*b;
        if (S>0) {
            System.out.println("Square of the rectangle equals - "+ S);
        }
    }
    public void findPerimeter(){
        int P = (a+b)*2;
        if (a>0 && b>0) {
            System.out.println("Perimeter of the rectangle equals - "+ P);
        }
    }

}