public class A extends Thread {
    Main m;
    A(Main m){
        this.m=m;
    }
    public void run(){
        m.fun(m.even);
    }
}
