public class B extends Thread{
    Main m;
    B(Main m){
        this.m=m;
    }
    public void run(){
        m.fun(m.odd);
    }
}
