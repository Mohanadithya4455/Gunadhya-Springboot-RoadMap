public class Circle extends Shape{
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void getParameter() {
        int perimeter=2*(22/7)*r;
        System.out.println("Perimeter of the circle: " +perimeter);
    }

    @Override
    public void getArea() {
        int area=22/7*(r*r);
        System.out.println("Area of the circle: "+area);
    }
}
