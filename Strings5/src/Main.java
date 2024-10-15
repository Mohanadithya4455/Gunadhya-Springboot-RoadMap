//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your first String: ");
      String s1=sc.nextLine();
      System.out.println("Enter your second String: ");
      String s2=sc.nextLine();
      boolean b = s1.equals(s2)||(s1.concat(s1).contains(s2));
      System.out.println(b);
    }
}
