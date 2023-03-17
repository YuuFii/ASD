package ASD.LinkedList.Single;

// Node Single Linked List

public class Node {
    int data;
    Node pointer;

    Node(){

    }

    Node(int data){
        this.data = data;
    }

    Node(int data, Node pointer){
        this.data = data;
        this.pointer = pointer;
    }
}
