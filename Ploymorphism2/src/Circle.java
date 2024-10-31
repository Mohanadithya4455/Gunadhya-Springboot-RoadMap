public class Circle extends Shape{
    int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Draw the Circle...");
    }

    @Override
    public void calculateArea() {
        int tsa= (int) ((22/7)*Math.pow(r,2));
        System.out.println("Total surface area of the circle for the given radius "+r+" is: "+tsa);
    }
}
