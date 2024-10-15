public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int calculateArea(){
        return (22/7)*this.getRadius()*this.getRadius();
    }

    public int calculatePerimeter(){
        return 2*(22/7)*this.getRadius();
    }
}
