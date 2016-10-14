package ylysov;


public class Circle implements ShapeBasicProperties {


    static double Pi=3.14;
    int  r=0;

    public int getR() {
        return r;
    }

    public void setR() {
        System.out.print("Enter radius of the circle:  ");
        InputData x = new InputData();
        int y = x.inputValue();

        if (y > 0) {
            r = y;
        }


    }

    public void findSquare(){
        double	S= Pi*r*r;
        if (S>0) {
            System.out.println("Square of the circle equals - "+ S);
        }
    }

    public void findPerimeter(){
        double P= 2*r*Pi;
        if (P>0) {
            System.out.println("Perimeter of the circle equals - "+ P);
        }
    }
}