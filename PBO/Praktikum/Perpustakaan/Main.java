package PBO.Praktikum.Perpustakaan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Jumlah buku : ");
        int jumlahBuku = in.nextInt(); in.nextLine();

        Buku[] buku = new Buku[jumlahBuku];

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nBuku ke-" + (i+1));

            System.out.print("Kategori buku : ");
            String kategori = in.nextLine();

            System.out.print("Judul buku : ");
            String judul = in.nextLine();

            System.out.print("Penulis (pisahkan dengan koma jika lebih dari satu, ex.: penulis1, penulis2, ...) : ");
            String[] penulis = in.nextLine().split(", ");

            System.out.print("Sinopsis buku (min. 20 kata) : ");
            String sinopsis = in.nextLine();
            while (sinopsis.split(" ").length < 20) {
                System.out.print("Sinopsis harus terdiri minimal 20 kata, silahkan input kembali : ");
                sinopsis = in.nextLine();
            }

            System.out.print("Royalti berapa persen : ");
            double royalti = in.nextDouble(); in.nextLine();

            buku[i] = new Buku(kategori, judul, penulis, sinopsis, royalti);
            buku[i].kapitalAwalKalimat();

        }
        Buku.print(buku);
        in.close();
    }
}