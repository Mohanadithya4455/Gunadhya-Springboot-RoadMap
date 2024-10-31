//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main implements Runnable{
    public static void main(String[] args) {
         Main t1=new Main();
         Main t2=new Main();
         Thread thread1=new Thread(t1);
         Thread thread2=new Thread(t2);
         thread1.start();
         thread2.start();
         //thread1.start();
    }


    @Override
    public void run() {
        for(int i=0;i<=5;i++)
            System.out.println(i);
    }
}