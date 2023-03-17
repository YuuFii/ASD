package ASD.Queue.Array;

public class Main {
    public static void main(String[] args) {
        QueueArray antrean = new QueueArray(5);
        antrean.enqueue(10);
        antrean.enqueue(20);
        antrean.enqueue(30);
        antrean.dequeue();
        antrean.dequeue();
        antrean.display();
    }
}
