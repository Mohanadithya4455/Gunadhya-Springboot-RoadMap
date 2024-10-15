//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int even=0;
    int odd=1;
    public static void main(String[] args) {
        Main obj=new Main();
      A t1=new A(obj);
      B t2=new B(obj);
      t1.start();
      t2.start();
    }
    public void fun(int data){
        synchronized(this) {
            while (data <= 100) {
                System.out.println(data);
                data += 2;
            }
            System.out.println("Thread is terminated....");
        }
    }
}