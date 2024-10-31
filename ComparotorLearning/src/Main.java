import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"adithya",25000));
        list.add(new Employee(1,"mohan",10000));
        list.add(new Employee(3,"Kalyan",70000));

        Comparator<Employee> com=(o1, o2)->{
                if(o1.getSalary()<o2.getSalary()){
                      return 1;
                }
                else{
                    return -1;
                }
        };
        Collections.sort(list,com);
        list.forEach(i->System.out.println(i));
    }
}