package ASD.Praktikum;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah jenis barang dan stok barang
        int jumlahJenisBarang = input.nextInt();
        int[] stokBarang = new int[jumlahJenisBarang];
        for (int i = 0; i < jumlahJenisBarang; i++) {
            stokBarang[i] = input.nextInt();
        }

        // Input jumlah klien
        int jumlahKlien = input.nextInt();

        // Input request tiap barang oleh tiap klien
        int[][] permintaanKlien = new int[jumlahKlien][jumlahJenisBarang];
        for (int i = 0; i < jumlahKlien; i++) {
            for (int j = 0; j < jumlahJenisBarang; j++) {
                permintaanKlien[i][j] = input.nextInt();
            }
        }

        // Hitung pesanan untuk setiap klien
        int[] pesanan = new int[jumlahKlien];

        for (int i = 0; i < jumlahKlien; i++) {
            for (int j = 0; j < jumlahJenisBarang; j++) {
                if (permintaanKlien[i][j] > stokBarang[i]) {
                    pesanan[i] += stokBarang[i];
                    stokBarang[i] = 0;
                    break;
                } else {
                    pesanan[i] += permintaanKlien[i][j];
                    stokBarang[i] -= permintaanKlien[i][j];
                }
            }
        }

        // Output pesanan untuk setiap klien
        for (int i = 0; i < jumlahKlien; i++) {
            System.out.print(pesanan[i]);
            if (i != jumlahKlien - 1) {
                System.out.print("   ");
            }
        }
    }
}

