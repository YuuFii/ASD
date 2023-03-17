package ASD.Praktikum.Hackerrank;

import java.util.Scanner;

class Node {
    String data;
    Node pointer;

    Node(){
    }

    Node(String data){
        this.data = data;
        this.pointer = null;
    }
}

class SLL {
    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return head == null && tail == null;
    }

    int getSize(){
        return this.size;
    }

    void addLast(String data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = tail = newNode;
        } else{
            tail.pointer = newNode;
            tail = newNode;
        }
        size++;
    }

    void addFirst(String data){
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
            System.out.println("List masih kosong.");
        } else if(getSize()==1){
            head = tail = null;
        } else{
            head = head.pointer;
        }

        size--;
    }

    void removeLast(){
        Node current = new Node();
        if(isEmpty()){
            System.out.println("List masih kosong.");
        } else if(getSize()==1){
            head = tail = null;
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

        if(getSize() == 0){
            System.out.println("List masih kosong.");
        } else{
            current = head;

            while(current != null){
                System.out.print(current.data + " -> ");
                current = current.pointer;
            }
        }
    }
}

public class Hackerrank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        SLL list = new SLL();

        int jumlahPerintah = in.nextInt();
        in.nextLine();

        String perintah = "";
        String[] perintahSplitted = new String[2];
        for (int i = 0; i < jumlahPerintah; i++) {
            perintah = in.nextLine();
            perintahSplitted = perintah.split(" ");

            if (perintahSplitted[0].equalsIgnoreCase("addfirst")) {
                list.addFirst(perintahSplitted[1]);
            } else if (perintahSplitted[0].equalsIgnoreCase("addlast")) {
                list.addLast(perintahSplitted[1]);
            } else if (perintahSplitted[0].equalsIgnoreCase("remove")) {
                if (perintahSplitted[1].equalsIgnoreCase("last")) {
                  	list.removeLast();
                } else if (perintahSplitted[1].toLowerCase().equals("first")) {
                  	list.removeFirst();
                }
            } else if (perintahSplitted[0].equalsIgnoreCase("print")) {
                list.printList();
            }
        }
    }
}
