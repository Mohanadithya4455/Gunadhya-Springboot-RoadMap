public class Cylinder extends Shape{
    private int height;
    private int radius;
    Cylinder(int height,int radius){
        this.height=height;
        this.radius=radius;
    }
    @Override
    public void draw() {
        System.out.println("Draw the Cylinder...");
    }

    @Override
    public void calculateArea() {
       int tsa=2*(22/7)*radius*(height+radius);
       System.out.println("Total surface area of the circle for the given radius "+height+" and "+radius+" is: "+tsa);
    }
}
