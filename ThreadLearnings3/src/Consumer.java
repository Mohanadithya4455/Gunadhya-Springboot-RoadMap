public class Consumer extends Thread{
    Info info;
    public Consumer(Info info){
        this.info=info;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            try {
                info.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
