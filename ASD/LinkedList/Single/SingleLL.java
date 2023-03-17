package ASD.LinkedList.Single;

public class SingleLL {
    Node kepala;
    Node ekor;
    int size;

    SingleLL(){
        kepala = ekor = null;
        size = 0;
    }

    public void addFirst(Node nodeBaru){
        if(kepala == null){
            kepala = ekor = nodeBaru;
        } else {
            nodeBaru.pointer = kepala;
            kepala = nodeBaru;
        }
        size++;
    }

    public void print(){

    }
}
