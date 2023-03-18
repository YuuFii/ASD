package PBO.StudyCase.PetHouse;

import java.util.Scanner;
import java.util.Random;

public class Hewan {
    public int IDMember;
    public String namaHewan;
    public String tahunKelahiran;
    public String jenisHewan;
    String answer;
    float tagihan;
    Scanner in = new Scanner(System.in);
    Groomer Bill = new Groomer(); // Instansiasi Objek Groomer
    DokterHewan Tagihan = new DokterHewan(); // Instansiasi Objek Dokter Hewan

    public Hewan(){ //constructor sekaligus menginput data hewan agar bisa disimpan di array di class Main
        System.out.println("========================================");
        System.out.print("Masukkan Jenis Hewan\t : ");
        setJenisHewan(in.nextLine());
        System.out.print("Masukkan Nama Hewan \t : ");
        setNamaHewan(in.nextLine());
        System.out.print("Masukkan Tahun Kelahiran : ");
        setTahunKelahiran(in.nextLine());
        System.out.print("Apakah Hewan Anda ingin digrooming (ya/tidak): ");
        answer = in.nextLine();

        // If-else untuk mengisi harga sesuai jenis hewan
        if (answer.equalsIgnoreCase("ya")){
            if (getJenisHewan().equalsIgnoreCase("kucing")){
                Bill.setBiayaPerawatan(300000);
            } else if (getJenisHewan().equalsIgnoreCase("anjing")){
                Bill.setBiayaPerawatan(250000);
            } else if (getJenisHewan().equalsIgnoreCase("kelinci")){
                Bill.setBiayaPerawatan(250000);
            }
        }else {
            Bill.setBiayaPerawatan(0);
        }

        System.out.print("Apakah Hewan Anda Ada Gejala Penyakit (ya/tidak): ");
        answer = in.nextLine();
        if (answer.equalsIgnoreCase("ya")){
            if (getJenisHewan().equalsIgnoreCase("kucing")){ //if else untuk mengese harga sesuai jenis hewan
                Tagihan.setBiayaCheckUp(200000);
            } else if (getJenisHewan().equalsIgnoreCase("anjing")){
                Tagihan.setBiayaCheckUp(200000);
            } else if (getJenisHewan().equalsIgnoreCase("kelinci")){
                Tagihan.setBiayaCheckUp(250000);
            }
        }else {
            Tagihan.setBiayaCheckUp(0);
        }

        System.out.print("Apakah Hewan Anda Ingin divaksin (ya/tidak): ");
        answer = in.nextLine();
        if (answer.equalsIgnoreCase("ya")){
            if (getJenisHewan().equalsIgnoreCase("kucing")){ //if else untuk mengese harga sesuai jenis hewan
                Tagihan.setBiayaVaksin(150000);
            } else if (getJenisHewan().equalsIgnoreCase("anjing")){
                Tagihan.setBiayaVaksin(150000);
            } else if (getJenisHewan().equalsIgnoreCase("kelinci")){
                Tagihan.setBiayaVaksin(200000);
            }
        }else {
            Tagihan.setBiayaVaksin(0);
        }

        tagihan = Tagihan.getTagihanCheckUp() + Tagihan.getTagihanVaksin() + Bill.getTagihanPerawatan();
        System.out.println("========================================");
    }

    // Random Nomor Unik untuk ID Member
    public int getIDMember(){
        int minimum = 100000;
        int maximum = 999999;
        int range = maximum - minimum + 1;
        Random random = new Random ();
        this.IDMember = random.nextInt(range) + minimum;
        return IDMember;
    }

    public String getNamaHewan(){
        return namaHewan;
    }

    public String getTahunKelahiran(){
        return tahunKelahiran;
    }

    public String getJenisHewan(){
        return jenisHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public void setTahunKelahiran(String tahunKelahiran) { //set tahun lahir pelanggan/hewan
        this.tahunKelahiran = tahunKelahiran;
    }

    // Output Data Hewan
    public void printDataHewan(){
        System.out.println("\n");
        System.out.println("================PET-SHOP================");
        System.out.println("========================================");
        System.out.printf( "%-17s : %s\n", "ID Member", getIDMember());
        System.out.printf( "%-17s : %s\n", "Nama Hewan", getNamaHewan());
        System.out.printf("%-17s : %s\n", "Tahun Kelahiran", getTahunKelahiran());
        System.out.printf("%-17s : %s\n", "Jenis Hewan", getJenisHewan());
        System.out.println("========================================");
        System.out.printf("%-17s : Rp %s\n", "Tagihan Check Up", Tagihan.getTagihanCheckUp());
        System.out.printf("%-17s : Rp %s\n", "Tagihan Vaksin", Tagihan.getTagihanVaksin());
        System.out.printf("%-17s : Rp %s\n", "Tagihan Grooming", Bill.getTagihanPerawatan());
        System.out.println("========================================");
        System.out.printf("%-17s : Rp %s\n", "Total Tagihan", tagihan);
        System.out.println("========================================");
        System.out.println("              TERIMA KASIH              ");
        System.out.println("      TELAH MENGGUNAKAN JASA KAMI       ");
        System.out.println("========================================");
        System.out.println("");
    }
}