package PBO.TugasBAB6;

public class Mahasiswa extends CivitasAkademik{
    private String nim;
    private String ukt;

    public Mahasiswa(String nama, String prodi, String fakultas, String alamat, String nim, String ukt){
        this.nama = nama;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.alamat = alamat;
        this.nim = nim;
        this.ukt = ukt;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getProdi() {
        return prodi;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setUkt(String ukt) {
        this.ukt = ukt;
    }

    public String getUkt() {
        return ukt;
    }

    @Override
    public void tampilkanData() {
        System.out.printf("%-13s : %s\n", "Nama", getNama());
        System.out.printf("%-13s : %s\n", "NIM", getNim());
        System.out.printf("%-13s : %s\n", "Fakultas", getFakultas());
        System.out.printf("%-13s : %s\n", "Program studi", getProdi());
        System.out.printf("%-13s : %s\n", "Alamat", getAlamat());
        System.out.printf("%-13s : %s\n", "UKT", getUkt());
    }
}
