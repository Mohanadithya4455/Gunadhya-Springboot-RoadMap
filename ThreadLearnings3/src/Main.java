//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Info info=new Info(5);
        //info.capacity=10;
        Producer p=new Producer(info);
        Consumer c=new Consumer(info);
        p.start();
        c.start();
        p.join();
        c.join();
        System.out.println(info.q);
    }
}