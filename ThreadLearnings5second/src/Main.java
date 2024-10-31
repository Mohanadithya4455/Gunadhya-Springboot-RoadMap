import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Thread{
    public static void main(String[] args) {

        Main t1=new Main();
        Main t2=new Main();
        Main t3=new Main();
        Main t4=new Main();
        t1.start();
        //Thread.sleep(5000);
        t2.start();

        t3.start();
        t4.start();
        System.out.println(Thread.activeCount());
        Set<Thread> activeThreads=Thread.getAllStackTraces().keySet();
        for(Thread t:activeThreads){
            System.out.println(t.getName());
        }
    }
    public void run(){

    }
}