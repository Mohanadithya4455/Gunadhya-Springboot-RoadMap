//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Thread{
    static int count=0;

    public static void main(String[] args) {
      Main t1 = new Main();
      t1.start();
      Main t2 = new Main();
      t2.start();
      Main t3 = new Main();
      t3.start();
     // System.out.print("Finally: "+count);
    }
    @Override
    public void run(){
        count++;
        System.out.println(count+"   "+Thread.currentThread().getName());

    }
}