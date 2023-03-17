package ASD.Stack.Array;

public class StackArray {
    public int top; // Top menyimpan array paling atas
    public int[] tumpukan;
    public int size;

    public StackArray(int size){
        this.size = size;
        tumpukan = new int[this.size];
        top = -1;
    }

    public boolean isEmpty(){ // Cek kosong
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){ // Cek penuh
        if(top == size-1){
            return true;
        } else {
            return false;
        }
    }

    public void push(int value){
        if(!isFull()){
            top++;
            tumpukan[top] = value;
        } else {
            System.out.println("Stack penuh, nilai " + value + " gagal masuk");
        }
    }

    public int pop(){
        if(!isEmpty()){
            int temp = tumpukan[top];
            top--;
            return temp;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }

    }

    public void print(){
        System.out.println("Stack Array : ");
        for (int i = top; i >= 0; i--) {
            System.out.println(" - " + tumpukan[i]);
        }
    }


}
