package PBO.Bab4;
import java.util.Scanner;
import java.util.Random;

class Pelanggan{
    private String nama;
    private String noPelanggan;
    private double saldo;
    private String PIN;
    private String jenisPelanggan;
    Scanner in = new Scanner(System.in);

    public Pelanggan(){
        System.out.printf("%-30s : ","Masukkan nama Anda");
        setNama(in.nextLine());

        System.out.println("1. Silver");
        System.out.println("2. Gold");
        System.out.println("3. Platinum");
        System.out.printf("%-30s : ", "Pilih jenis pelanggan");
        setJenisPelanggan(in.nextLine());

        setNoPelanggan();

        System.out.printf("%-30s : %s\n", "Nomer pelanggan Anda", getNoPelanggan());

        System.out.printf("%-30s : ","Masukkan PIN Anda (6 digit)");
        setPIN(in.nextLine());

        System.out.printf("%-30s : ", "Masukkan saldo akun Anda");
        setSaldo(in.nextDouble()); in.nextLine();

        while(getSaldo() < 10000){
            System.out.println("\nMinimal saldo tidak terpenuhi.");
            System.out.printf("%-30s : ", "Masukkan saldo akun Anda");
            setSaldo(in.nextDouble()); in.nextLine();
        }
        System.out.println("\nSelamat Anda berhasil membuat akun Anda.");
    }

    // SETTER
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoPelanggan() {
        Random random = new Random();
        int angkaRandom = random.nextInt(100000000);

        if(getJenisPelanggan().equalsIgnoreCase("Silver")){
            this.noPelanggan = "38" + String.format("%06d", angkaRandom);
        } else if(getJenisPelanggan().equalsIgnoreCase("Gold")){
            this.noPelanggan = "56" + String.format("%06d", angkaRandom);
        } else if(getJenisPelanggan().equalsIgnoreCase("Platinum")){
            this.noPelanggan = "74" + String.format("%06d", angkaRandom);
        }
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private void setPIN(String PIN) {
        this.PIN = PIN;
    }
    public void setJenisPelanggan(String pilihan) {
        switch (pilihan) {
            case "1" -> this.jenisPelanggan = "Silver";
            case "2" -> this.jenisPelanggan = "Gold";
            case "3" -> this.jenisPelanggan = "Platinum";
            default -> System.out.println("Pilihan tidak valid");
        }
    }

    // GETTER
    public String getNama() {
        return nama;
    }
    public String getNoPelanggan() {
        return noPelanggan;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getJenisPelanggan() {
        return jenisPelanggan;
    }

    // CEK INFORMASI AKUN
    public void cekAkun(){
        System.out.println("\nInformasi Akun Anda");
        System.out.println("Nama akun       : " + getNama());
        System.out.println("Nomer pelanggan : " + getNoPelanggan());
        System.out.println("Jenis Pelanggan : " + getJenisPelanggan());
        System.out.println("Saldo           : Rp" + getSaldo());
    }
    // ISI SALDO KE REKENING
    public void isiSaldo(double tambahSaldo){
        this.saldo += tambahSaldo;
        System.out.println("Sukses menambahkan saldo sebanyak " + tambahSaldo + ".");
    }
    // GANTI NAMA AKUN
    public void gantiNama(String namaBaru){
        this.nama = namaBaru;
        System.out.println("Nama akun Anda berhasil diganti");
    }

    // TARIK SALDO
    public void tarikSaldo() {
        System.out.print("Masukkan nominal tarik tunai : ");
        double tarikTunai = in.nextDouble();
        in.nextLine();
        if (tarikTunai > this.saldo) {
            System.out.println("Saldo tidak mencukupi.");
            while (tarikTunai > this.saldo) {
                System.out.print("Masukkan nominal tarik tunai : ");
                tarikTunai = in.nextDouble();
                in.nextLine();
            }
        } else if (this.saldo - tarikTunai < 10000) {
            System.out.println("Tarik tunai gagal dilakukan. Sisa saldo Anda kurang dari Rp10000.");
        } else {
            this.saldo -= tarikTunai;
            System.out.println("Berhasil melakukan tarik tunai sebanyak Rp" + tarikTunai + ".");
        }
    }

    // TARIK SALDO UNTUK TRANSAKSI
    public void tarikSaldo(double tarikTunai){
        if (tarikTunai > getSaldo()) {
            System.out.println("Saldo tidak mencukupi.");
        } else if (getSaldo() - tarikTunai < 10000) {
            System.out.println("Tarik tunai gagal dilakukan. Sisa saldo Anda kurang dari 10000.");
        } else {
            this.saldo -= tarikTunai;
            System.out.println("Berhasil melakukan pembayaran sebesar " + tarikTunai);
        }
    }

    // LOGIN AKUN
    public void loginAkun(){
        System.out.println("LOGIN AKUN");
        System.out.print("No. Pelanggan : ");
        String noRekening = in.nextLine();
        System.out.print("PIN          : ");
        String PIN = in.nextLine();
        int count = 0;

        while (!noRekening.equals(this.noPelanggan) || !PIN.equals(this.PIN)) {
            count++;
            if (count == 3) {
                System.out.println("Akun anda telah diblokir.");
                System.exit(0);
            }
            System.out.println("No. Pelanggan atau PIN salah.");
            System.out.print("No. Pelanggan : ");
            noRekening = in.nextLine();
            System.out.print("PIN          : ");
            PIN = in.nextLine();
        }
        System.out.println("Anda berhasil melakukan login.");
    }
    // TRANSAKSI
    public void transaksi(){
        System.out.println("\nMenu");
        System.out.println("1. Pembelian");
        System.out.println("2. Top-up");
        System.out.print("Pilihan menu : ");
        String answer = in.nextLine();
        if(answer.equalsIgnoreCase("1")){
            loginAkun();
            System.out.print("1. Oviv\n2. Epple\n3. Oddo\n4. Xiaomee\nPilih handphone yang ingin Anda beli : ");
            String pilihan = in.nextLine();
            Handphone hp = new Handphone();
            switch (pilihan) {
                case "1" -> hp.setTipe("Oviv");
                case "2" -> hp.setTipe("Epple");
                case "3" -> hp.setTipe("Oddo");
                case "4" -> hp.setTipe("Xiaomee");
                default -> {
                    System.out.println("Pilihan tidak valid, Anda dikembalikan ke menu awal.");
                    return;
                }
            }

            hp.penentuanHarga();

            if(getJenisPelanggan().equalsIgnoreCase("Platinum")){
                double pembayaran = hp.getHarga();
                double cashback;
                if(pembayaran > 1000000){
                    cashback = 0.1;
                } else {
                    cashback = 0.05;
                }
                pembayaran = pembayaran - (pembayaran * cashback);
                tarikSaldo(pembayaran);
            } else if(getJenisPelanggan().equalsIgnoreCase("Gold")){
                double pembayaran = hp.getHarga();
                double cashback;
                if(pembayaran > 1000000){
                    cashback = 0.07;
                } else {
                    cashback = 0.02;
                }
                pembayaran = pembayaran - (pembayaran * cashback);
                tarikSaldo(pembayaran);
            } else if(getJenisPelanggan().equalsIgnoreCase("Silver")){
                double pembayaran = hp.getHarga();
                if(pembayaran > 1000000){
                    double cashback = 0.05;
                    pembayaran = pembayaran - (pembayaran * cashback);
                    tarikSaldo(pembayaran);
                }
            }
        } else if(answer.equalsIgnoreCase("2")){
            loginAkun();
            System.out.print("Nominal saldo yang ingin ditambahkan : ");
            double pembayaran = in.nextDouble(); in.nextLine();
            isiSaldo(pembayaran);
        }
    }
}

class Handphone{
    private String tipe;
    private double harga;
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public double getHarga() {
        return harga;
    }
    public String getTipe() {
        return tipe;
    }
    public void penentuanHarga(){
        switch (getTipe().toLowerCase()) {
            case "oviv" -> harga = 3000000;
            case "epple" -> harga = 8000000;
            case "oddo" -> harga = 4000000;
            case "xiaomee" -> harga = 800000;
            default -> {
                System.out.println("Tipe handphone tidak valid.");
                harga = 0;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pelanggan pelanggan = new Pelanggan();

        boolean menu = true;
        do{
            System.out.println("------------------------------------------");
            System.out.print("1. Ganti Nama Akun\n2. Cek Informasi Akun\n3. Transaksi\n4. Keluar\nPilih Menu : ");
            String pilihan = in.nextLine();
            System.out.println("------------------------------------------");

            if(pilihan.equalsIgnoreCase("1")) {
                System.out.print("Masukkan Nama Baru : ");
                String namaBaru = in.nextLine();
                pelanggan.gantiNama(namaBaru);
            } else if (pilihan.equalsIgnoreCase("2")){
                pelanggan.cekAkun();
            } else if (pilihan.equalsIgnoreCase("3")){
                pelanggan.transaksi();
            } else if (pilihan.equalsIgnoreCase("4")){
                break;
            } else {
                System.out.println("Pilihan tidak valid");
            }
        } while (menu);
    }
}