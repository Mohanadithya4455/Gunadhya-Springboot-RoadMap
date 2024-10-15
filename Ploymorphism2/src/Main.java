//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Circle circle=new Circle();
     circle.setR(4);
     circle.calculateArea();
     Cylinder cylinder=new Cylinder(10,5);
     cylinder.calculateArea();
    }
}