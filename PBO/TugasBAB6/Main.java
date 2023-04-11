package PBO.TugasBAB6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen : ");
        int jmlDosen = in.nextInt(); in.nextLine();
        Dosen[] dosen = new Dosen[jmlDosen];

        for (int i = 0; i < dosen.length; i++) {
            dosen[i] = new Dosen();
            System.out.print("Masukkan nama dosen : ");
            dosen[i].setNama(in.nextLine());
            System.out.print("Masukkan NIDN : ");
            dosen[i].setNidn(in.nextLine());
            System.out.print("Masukkan program studi : ");
            dosen[i].setProdi(in.nextLine());
            System.out.print("Masukkan fakultas : ");
            dosen[i].setFakultas(in.nextLine());
            System.out.print("Masukkan alamat dosen : ");
            dosen[i].setAlamat(in.nextLine());
            System.out.print("Masukkan gaji dosen : ");
            dosen[i].setGaji(in.nextLine());
        }

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMahasiswa = in.nextInt(); in.nextLine();
        KRS[] krs = new KRS[jmlMahasiswa];
        for (int i = 0; i < krs.length; i++) {
            krs[i] = new KRS();

        }

        Dosen d1 = new Dosen("Budi", "TIF", "FILKOM", "Malang", "123", "4.500.000");
        Dosen d2 = new Dosen("Tri", "TIF", "FILKOM", "Malang", "124", "5.000.000");
        Dosen d3 = new Dosen("Edy", "TIF", "FILKOM", "Malang", "125", "4.700.000");

        KRS krsKe1 = new KRS();
        KRS krsKe2 = new KRS();

        MataKuliah sisop = new MataKuliah("CIF62002", "Sistem Operasi", 4, d2);
        MataKuliah asd = new MataKuliah("CIF62004", "Algoritma dan Struktur Data", 4, d1);
        MataKuliah stp = new MataKuliah("CIF62006", "Statistika dan Teori Peluang", 3, d2);
        MataKuliah pbo = new MataKuliah("CIF62003", "Pemrograman Berorientasi Objek", 5, d1);
        MataKuliah alin = new MataKuliah("CIF62005", "Aljabar Linear", 3, d3);
        MataKuliah kwn = new MataKuliah("MPK60006", "Kewarganegaraan", 4, d3);
        MataKuliah kwu = new MataKuliah("UBU60003", "Kewirausahaan", 3, d1);


        krsKe1.setMhs(new Mahasiswa("Nico", "TIF", "FILKOM", "Batu", "225150207111045", "7.500.000"));
        krsKe1.tambahMatkul(sisop);
        krsKe1.tambahMatkul(asd);
        krsKe1.tambahMatkul(stp);
        krsKe1.tambahMatkul(pbo);
        krsKe1.tambahMatkul(alin);
        krsKe1.tambahMatkul(kwn);

        krsKe2.setMhs(new Mahasiswa("Arya", "TIF", "FILKOM", "Malang", "225150207111102", "7.500.000"));
        krsKe2.tambahMatkul(pbo);
        krsKe2.tambahMatkul(asd);
        krsKe2.tambahMatkul(kwn);
        krsKe2.tambahMatkul(sisop);
        krsKe2.tambahMatkul(alin);
        krsKe2.tambahMatkul(kwu);

        krsKe1.tampilKRS();
        krsKe2.tampilKRS();
    }
}
