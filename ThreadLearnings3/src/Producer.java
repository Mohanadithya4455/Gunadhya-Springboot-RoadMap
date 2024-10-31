public class Producer extends Thread{

    Info info;

    Producer(Info info){
        this.info=info;
    }
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            try {
                info.produce(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
