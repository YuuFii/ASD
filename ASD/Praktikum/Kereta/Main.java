package ASD.Praktikum.Kereta;

import java.util.Scanner;

class Gerbong {
    int penumpang;
    int dewasa;
    int anak;
    Gerbong next;

    Gerbong(int dewasa, int anak) {
        this.dewasa = dewasa;
        this.anak = anak;
    }
}

class LinkedList {
    Gerbong head;
    Gerbong tail;

    boolean isEmpty(){
        return head == null && tail == null;
    }

    void addLast(int dewasa, int anak) {
        Gerbong node = new Gerbong(dewasa, anak);

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void reverse() {
        Gerbong prev = null;
        Gerbong sekarang = head;
        Gerbong next = null;

        while (sekarang != null) {
            next = sekarang.next;
            sekarang.next = prev;
            prev = sekarang;
            sekarang = next;
        }
        head = prev;
    }

    void deleteNode(int data) {
        Gerbong prev = null;
        Gerbong current = head;

        while (current != null) {
            if (current.dewasa + current.anak == data) { // mengecek apakah jumlah penumpang pada gerbong sama dengan x
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                if (current == tail) {
                    tail = prev;
                }
                break;
            }
            prev = current;
            current = current.next;
        }
    }


    void printList() {
        Gerbong node = head;
        while (node != null) {
            System.out.print("[" + node.dewasa + ", " + node.anak + "]");
            if (node.next != null) {
                System.out.print("-");
            }
            node = node.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int banyakGerbong = in.nextInt();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < banyakGerbong; i++) {
            int dewasa = in.nextInt();
            int anak = in.nextInt();
            linkedList.addLast(dewasa, anak);
        }

        int gerbongPilihan = in.nextInt();
        linkedList.reverse();
        linkedList.deleteNode(gerbongPilihan);
        linkedList.printList();
    }
}


