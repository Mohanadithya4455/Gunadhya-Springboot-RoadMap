public class Triangle extends Shape{
    int s1;
    int s2;
    int s3;
    int b;
    int h;

    public Triangle(int s1, int s2, int s3, int b, int h) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.b = b;
        this.h = h;
    }

    @Override
    public void getArea() {
      int area=(b*h)/2;
      System.out.println("Area of the Triangle: "+area);
    }

    @Override
    public void getParameter() {
        System.out.println("Perimeter of the Traingle: "+s1+s2+s3);
    }
}
