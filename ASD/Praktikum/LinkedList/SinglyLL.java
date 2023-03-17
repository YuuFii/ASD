package ASD.Praktikum.LinkedList;

class Node{
    int data;
    Node pointer;

    Node(){

    }

    Node(int data){
        this.data = data;
        this.pointer = null;
    }
}

class LinkedList{
    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return head == null && tail == null;
    }

    int getSize(){
        return this.size;
    }

    void addLast(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = tail = newNode;
        } else{
            tail.pointer = newNode;
            tail = newNode;
        }
        size++;
    }

    void addFirst(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = tail = newNode;
        } else{
            newNode.pointer = head;
            head = newNode;
        }
        size++;
    }

    void removeFirst(){
        if(isEmpty()){
            System.out.println("List kosong.");
        } else{
            head = head.pointer;
        }
        size--;
    }

    void removeLast(){
        Node current = new Node();
        if(isEmpty()){
            System.out.println("List kosong.");
        } else if(getSize()==1){
            head = tail = null;
            size--;
        } else{
            current = head;
            while(current.pointer != tail){
                current = current.pointer;
            }
            tail = current;
            tail.pointer = null;
        }
        size--;
    }

    void printList(){
        Node current = new Node();

        if(size == 0){
            System.out.println("List kosong.");
        } else{
            current = head;

            while(current != null){
                System.out.print(current.data + " --> ");
                current = current.pointer;
            }
        }
    }
}

public class SinglyLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(0);
        list.addFirst(1);
        list.addLast(3);
        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(8);
        list.removeFirst();
        list.printList();
    }
}
