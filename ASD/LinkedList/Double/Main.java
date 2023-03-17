package ASD.LinkedList.Double;

public class Main {
    public static void main(String[] args) {

        DoubleLL barisan = new DoubleLL();

        Node node1 = new Node(5);
        barisan.addFirst(node1);

        Node node2 = new Node(10);
        barisan.addLast(node2);

        Node node3 = new Node(15);
        barisan.addFirst(node3);

        barisan.print();
    }
}
