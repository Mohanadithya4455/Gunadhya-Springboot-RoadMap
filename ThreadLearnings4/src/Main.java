//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends  Thread{
    public static void main(String[] args) {

        Main t1=new Main();
        Main t2=new Main();
        Main t3=new Main();
        t1.setPriority(10);

        t2.setPriority(1);

        t3.setPriority(5);
        t1.setName("Mohan");
        t2.setName("Adithya");
        t3.setName("Rankireddy");
        t2.start();
        t3.start();
        t1.start();

    }

    @Override
    public void run() {
        System.out.println("hello world"+ "  "+Thread.currentThread().getName());

    }
}