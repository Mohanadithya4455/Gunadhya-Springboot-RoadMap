//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Thread {
    public static void main(String[] args) {
      Main t1 = new Main();
      Main t2 = new Main();
      Main t3 = new Main();
      t1.start();
      t2.start();
      t3.start();

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"  "+Thread.currentThread().getId());
        for(int i=0;i<5;i++)
            System.out.println(i);
    }
}