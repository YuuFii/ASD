package ASD.Praktikum;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // membaca input
        int numItems = Integer.parseInt(input.nextLine());
        int[] stock = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int numClients = Integer.parseInt(input.nextLine());
        int[][] requests = new int[numClients][numItems];
        for (int i = 0; i < numClients; i++) {
            requests[i] = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        // menghitung jumlah pesanan setiap klien
        int[] totalRequests = new int[numClients];
        for (int i = 0; i < numClients; i++) {
            for (int j = 0; j < numItems; j++) {
                totalRequests[i] += requests[i][j];
            }
        }

        // memeriksa apakah stok barang mencukupi untuk memenuhi pesanan setiap klien
        for (int i = 0; i < numClients; i++) {
            boolean enoughStock = true;
            for (int j = 0; j < numItems; j++) {
                if (totalRequests[i] > stock[j]) {
                    enoughStock = false;
                    totalRequests[i] -= totalRequests[i] - stock[j];
                    stock[j] = 0;
                    break;
                } else {
                    stock[j] -= totalRequests[i];
                }
            }
            if (enoughStock) {
                stock = subtract(stock, requests[i]);
            }
        }

        // mencetak jumlah pesanan setiap klien
        for (int i = 0; i < numClients; i++) {
            for (int j = 0; j < numItems; j++) {
                System.out.print(requests[i][j] - totalRequests[i]);
                if (j != numItems - 1) {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    // mengurangkan setiap elemen array A dengan elemen yang sesuai dari array B
    private static int[] subtract(int[] A, int[] B) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = A[i] - B[i];
        }
        return result;
    }
}
