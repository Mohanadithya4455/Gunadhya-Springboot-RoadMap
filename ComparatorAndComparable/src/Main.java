import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Employee emp1=new Employee(1,"Adithya",24,50000);
        Employee emp2=new Employee(2,"Mohan",24,40000);
        Employee emp3=new Employee(3,"Kalyan",40,100000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.forEach(i->System.out.println(i));
        Collections.sort(list);
        System.out.println("-----After Sorting-----");
        list.forEach(i->System.out.println(i));
    }
}