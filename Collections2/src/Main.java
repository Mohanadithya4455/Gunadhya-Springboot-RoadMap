import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"adithya",24,"Backend",20000));
        list.add(new Employee(2,"Mohan",25,"Testing",25000));
        list.add(new Employee(3,"Pawan",40,"development",40000));
        list.add(new Employee(4,"Kalyan",50,"Frontend",30000));
        list.add(new Employee(5,"Srinivas",38,"development",60000));


        Set<Employee> employees = list.stream().filter(employee -> employee.getSalary()>=30000).collect(Collectors.toSet());
        for(Employee employee:employees){
            System.out.println(employee.toString());
       }
    }
}