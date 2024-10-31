import java.util.LinkedList;
import java.util.Queue;

public class Info {

    Queue<Integer> q;
    int capacity;

    public Info(int capacity) {
        this.q = new LinkedList<>();
        this.capacity=capacity;
    }

    public synchronized void produce(int data) throws InterruptedException {
        if(q.size()==capacity){
            System.out.println("Queue is full....");
            wait();
           // return;

        }
            q.add(data);
            System.out.println(data + "  is added successfully");
            System.out.println(q);
            notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        if(q.size()==0){
            System.out.println("Queue is Empty....");

            wait();
        }
            q.poll();
            System.out.println("Number is removed successfully");
             notifyAll();
    }
}
