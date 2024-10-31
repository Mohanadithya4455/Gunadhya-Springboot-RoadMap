public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private int age;
    private double salary;


    @Override
    public int compareTo(Employee o) {
        if(this.salary<o.salary){
            return 1;
        }
        else{
            return -1;
        }
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
