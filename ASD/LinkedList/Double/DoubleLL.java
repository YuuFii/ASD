package ASD.LinkedList.Double;

// Double Linked List

public class DoubleLL {
    Node kepala;
    Node ekor;
    int size;

    DoubleLL(){
        kepala = ekor = null;
        size = 0;
    }

    public void addFirst(Node nodeBaru){
        if(kepala == null){
            kepala = ekor = nodeBaru;
        } else {
            kepala.prev = nodeBaru;
            nodeBaru.next = kepala;
            kepala = nodeBaru;
        }
    }

    public void addLast(Node nodeBaru){
        if(kepala == null){
            kepala = ekor = nodeBaru;
        } else {
            ekor.next = nodeBaru;
            nodeBaru.prev = ekor;
            ekor = nodeBaru;
        }
    }

    public void addAfter(int key, Node nodeBaru){
        Node temp = kepala;
        while(temp != null){
            if(key == temp.data){
                break;
            }
            nodeBaru.prev = temp;
            nodeBaru.next = temp.next;
            temp.next.prev = nodeBaru;
            temp.next = nodeBaru;
        }
    }

    public void deleteFirst(){
        kepala = kepala.next;
        kepala.prev.next = null;
        kepala.prev = null;
    }

    public void print(){
        Node temp = kepala;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
    }
}

