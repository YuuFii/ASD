package PBO.Praktikum.Perpustakaan;

public class Buku {
    public String judul;
    public String[] penulis;
    public String kategori;
    public String sinopsis;
    public double persenRoyalti;

    public static final String[] kategoriBuku = {"Teknologi", "Filsafat", "Sejarah", "Agama", "Psikologi", "Politik", "Fiksi"};

    public Buku(String kategori, String judul, String[] penulis, String sinopsis, double persenRoyalti) {
        this.kategori = kategori;
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = sinopsis.toLowerCase();
        this.persenRoyalti = persenRoyalti;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        String kalimat = "";
        for (int i = 0; i < penulis.length; i++) {
            kalimat += penulis[i];
            if (i < penulis.length - 1) {
                kalimat += ", ";
            }
        }
        return kalimat;
    }

    public String getKategori() {
        return kategori;
    }

    public String getSinopsis(){
        return sinopsis;
    }

    public double getPersenRoyalti(){
        return persenRoyalti;
    }

    public int hitungJumlahKata(){
        String[] hitungKata = sinopsis.split(". ");
        return hitungKata.length;
    }

    public void kapitalAwalKalimat() {
        String[] kalimat = sinopsis.split("\\.\\s+");
        String sinopsis = "";
        for (String s : kalimat) {
            sinopsis += s.substring(0, 1).toUpperCase() + s.substring(1) + ". ";
        }
        this.sinopsis = sinopsis;
    }

    // Penggunaan konsep overloading
    public double hitungRoyalti(double hargaBuku){
        return hargaBuku * 0.1;
    }

    public double hitungRoyalti(double hargaBuku, double persen){
        return hargaBuku * (persen * 0.01);
    }

    // Output
    public static void print(Buku[] buku){

        for (int i = 0; i < Buku.kategoriBuku.length; i++) {
            int hitungBuku = 0;
            double hargaBuku = 0;

            System.out.println("--------------------------------------------------------");
            System.out.println("Buku dalam kategori " + Buku.kategoriBuku[i] + " : ");

            for (int j = 0; j < buku.length; j++) {
                if(buku[j].getKategori().equalsIgnoreCase("teknologi") || buku[j].getKategori().equalsIgnoreCase("sejarah") || buku[j].getKategori().equalsIgnoreCase("agama")){
                    hargaBuku = 100000;
                } else if(buku[j].getKategori().equalsIgnoreCase("filsafat") || buku[j].getKategori().equalsIgnoreCase("politik")){
                    hargaBuku = 90000;
                } else if(buku[j].getKategori().equalsIgnoreCase("psikologi") || buku[j].getKategori().equalsIgnoreCase("fiksi")){
                    hargaBuku = 80000;
                }

                if(buku[j].getKategori().equalsIgnoreCase(Buku.kategoriBuku[i])){
                    hitungBuku++;
                    System.out.println("\t\tJudul buku   : " + buku[j].getJudul());
                    System.out.println("\t\tPenulis buku : " + buku[j].getPenulis());
                    System.out.println("\t\tSinopsis     : " + buku[j].getSinopsis());
                    System.out.println("\t\tJumlah kata  : " + buku[j].hitungJumlahKata());
                    System.out.println("\t\tRoyalti 10%  : " + buku[j].hitungRoyalti(hargaBuku));
                    System.out.println("\t\tRoyalti " + buku[j].getPersenRoyalti() + "%  : " + buku[j].hitungRoyalti(hargaBuku, buku[j].getPersenRoyalti()));

                }
            }

            if(hitungBuku == 0){
                System.out.println("\tTidak ditemukan buku dalam kategori ini.");
            }
        }
    }
}
