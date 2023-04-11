package PBO.TugasBAB6;

public class Dosen extends CivitasAkademik{
    private String nidn;
    private String gaji;

    public Dosen(){

    }

    public Dosen(String nama, String prodi, String fakultas, String alamat, String nidn, String gaji){
        this.nama = nama;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.alamat = alamat;
        this.nidn = nidn;
        this.gaji = gaji;
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

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public String getGaji() {
        return gaji;
    }

    public void setGaji(String gaji) {
        this.gaji = gaji;
    }

    @Override
    public void tampilkanData() {
        System.out.printf("\t%-13s : %s\n", "Nama Dosen", getNama());
        System.out.printf("\t%-13s : %s\n", "NIDN", getNidn());
        System.out.printf("\t%-13s : %s\n", "Fakultas", getFakultas());
        System.out.printf("\t%-13s : %s\n", "Program studi", getProdi());
        System.out.printf("\t%-13s : %s\n", "Alamat", getAlamat());
        System.out.printf("\t%-13s : Rp%s\n", "Gaji", getGaji());
    }
}
