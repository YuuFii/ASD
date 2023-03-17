package ASD.Praktikum;

import java.util.Scanner;

public class Hackerrank1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah jenis barang dan stok masing-masing barang
        int n = sc.nextInt();
        int[] stok = new int[n];
        for (int i = 0; i < n; i++) {
            stok[i] = sc.nextInt();
        }

        // Input jumlah klien dan permintaan tiap klien
        int m = sc.nextInt();
        int[][] permintaan = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                permintaan[i][j] = sc.nextInt();
            }
        }

        // Proses pengaturan distribusi barang
        int[][] pesanan = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int jumlahPesanan = Math.min(stok[i], permintaan[j][i]);
                pesanan[j][i] = jumlahPesanan;
                stok[i] -= jumlahPesanan;
                permintaan[j][i] -= jumlahPesanan;
            }
        }

        // Output jumlah pesanan tiap klien per barang
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pesanan[i][j] + "   ");
            }
            System.out.println();
        }

        sc.close();
    }
}

