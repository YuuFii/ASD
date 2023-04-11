package PBO.TugasBAB6;

public abstract class CivitasAkademik {
    protected String nama;
    protected String prodi;
    protected String fakultas;
    protected String alamat;

    public abstract void setNama(String nama);

    public abstract String getNama();

    public abstract void setProdi(String prodi);

    public abstract String getProdi();

    public abstract void setFakultas(String fakultas);

    public abstract String getFakultas();

    public abstract void setAlamat(String alamat);

    public abstract String getAlamat();

    public abstract void tampilkanData();
}
