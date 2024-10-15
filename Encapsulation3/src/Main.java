//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Rectangle rectangle=new Rectangle();
      rectangle.setLength(10);
      rectangle.setBreadth(6);
      int area=rectangle.area();
      int perimeter=rectangle.perimeter();
      System.out.println("Area of the rectangle: "+area);
      System.out.println("Perimeter of the rectangle: "+perimeter);
    }
}