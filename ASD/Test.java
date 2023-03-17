package ASD;

class Node{
    int data;
    Node next;
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
class Circular{
    private Node head;
    public void addData(int data){
        Node nodeBaru = new Node(data);
        if (head == null) {
            head = nodeBaru;
            nodeBaru.next = head;
        }else{
            Node current = head;
            while (current.next != head){
                current = current.next;
            }
            current.next = nodeBaru;
            nodeBaru.next = head;
        }
    }
    //menghapus data
    public void deleteData(int data){
        if (head == null){
            return;
        }
        Node current = head;
        Node prev = null;
        while (current.data != data){
            if(current.next == head){
                return;
            }
            prev = current;
            current = current.next;
        }
        if (current == head){
            Node last = head;
            while(last.next != head){
                last = last.next;
            }
            head = head.next;
            last.next = head;
        }else{
            prev.next = current.next;
        }
    }
    //untuk menampilkan data
    public void displayData(){
        if (head == null){
            return;
        }
        Node current = head;
        do{
            System.out.print(current.data + " ");
            current = current.next;
        }while(current != head);
    }
}

public class Test {
    public static void main(String[] args) {
        Circular singleList = new Circular();
        singleList.addData(5);
        singleList.addData(50);
        singleList.addData(55);
        singleList.addData(15);
        singleList.addData(19);
        singleList.displayData();
        System.out.println();
        singleList.deleteData(55);
        singleList.displayData();
    }
}
