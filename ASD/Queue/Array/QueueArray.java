package ASD.Queue.Array;

public class QueueArray {
    int front;
    int rear;
    int[] antrean;
    int size;

    QueueArray(int size){
        this.size = size;
        antrean = new int[size];
        front = 0;
        rear = -1;
    }

    public boolean isFull(){
        if(rear == size-1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if(rear == -1){
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int value){
        if(!isFull()){
            rear++;
            antrean[rear] = value;
        } else {
            System.out.println("Queue penuh, nilai " + value + " gagal masuk");
        }
    }

    public int dequeue(){
        if(!isEmpty()){
            int temp = antrean[front];
            for (int i = 0; i < rear; i++) {
                antrean[i] = antrean[i+1];
            }
            rear--;
            return temp;
        } else {
            System.out.println("Antrean is empty");
            return -1;
        }


    }

    public void display(){
        for (int i = 0; i <= rear; i++) {
            System.out.print(antrean[i] + " ");
        }
    }

}
