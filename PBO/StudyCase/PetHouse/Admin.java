package PBO.StudyCase.PetHouse;

import java.util.Scanner;

public class Admin extends Karyawan{
    Scanner in = new Scanner(System.in);
    public Admin(){ //constructor sekaligus untuk menginput data karyawan agar bisa dimasukkan ke dalam array di class Main
        System.out.print("Masukkan Nama\t\t\t : ");
        setNama(in.nextLine());
        System.out.print("Masukkan No Telepon\t\t : ");
        setNoTelepon(in.nextLine());
        System.out.print("Masukkan Jenis Kelamin\t : ");
        setKelamin(in.nextLine());
        System.out.print("Masukkan Jabatan\t\t : ");
        setJabatan(in.nextLine());
        System.out.println("========================================");
    }
}
