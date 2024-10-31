public class Rectangle extends Shape{
    int l;
    int b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public void getArea() {
        int area=l*b;
        System.out.println("Area of the Rectangle: "+area);
    }

    @Override
    public void getParameter() {
        int perimeter=2*(l+b);
        System.out.println("Perimeter of the Rectangle: "+perimeter);
    }
}
