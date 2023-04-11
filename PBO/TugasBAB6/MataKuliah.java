package PBO.TugasBAB6;

public class MataKuliah {
    private String kodeMatkul;
    private String namaMatkul;
    private int sks;
    private Dosen dsn;

    public MataKuliah(){

    }

    public MataKuliah(String kodeMatkul, String namaMatkul, int sks, Dosen dsn){
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.dsn = dsn;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getSks() {
        return sks;
    }

    public void setDsn(Dosen dsn) {
        this.dsn = dsn;
    }

    public void getDsn(){
        this.dsn.tampilkanData();
    }
}
