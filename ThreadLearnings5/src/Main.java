//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Main t1=new Main();
        Main t2=new Main();
        Main t3=new Main();
        Main t4=new Main();
        t1.start();
        //Thread.sleep(5000);
        t2.start();
        Thread.sleep(1000);
        t3.start();
        t4.start();
        int active_threads=Thread.activeCount();
        ThreadGroup threadGroup=Thread.currentThread().getThreadGroup();

        Thread arr[]=new Thread[active_threads];
        threadGroup.enumerate(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(Thread.currentThread().getName());
        }

    }

    @Override
    public void run() {

    }
}