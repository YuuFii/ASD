package PBO.TugasBAB6;

public class KRS {
    private Mahasiswa mhs;
    private MataKuliah[] matkul;

    public KRS(){
        matkul = new MataKuliah[8];
    }

    public void setMhs(Mahasiswa mhs) {
        this.mhs = mhs;
    }

    public Mahasiswa getMhs() {
        return mhs;
    }

    public void tambahMatkul(MataKuliah mataKuliah) {
        int i = 0;
        int totalSKS = 0;

        for (int j = 0; j < matkul.length; j++) {
            if (matkul[j] != null) {
                totalSKS += matkul[j].getSks();
            }
        }

        if (totalSKS + mataKuliah.getSks() <= 24) {
            while (i < matkul.length && matkul[i] != null) {
                i++;
            }
            if (i < matkul.length) {
                matkul[i] = mataKuliah;
            } else {
                System.out.println("Mata kuliah sudah penuh");
            }
        } else {
            System.out.println("!!!PERINGATAN!!!\nSKS melebihi batas maksimal atau penuh.");
        }
    }

    public void tampilKRS(){
        System.out.println("-------------------------------------");
        System.out.println("Data Mahasiswa");
        mhs.tampilkanData();
        System.out.println("-------------------------------------");
        System.out.println("\nMata kuliah yang dipilih : ");

        for (int i = 0; i < matkul.length; i++) {
            if(matkul[i] != null) {
                System.out.println("\n" + (i + 1) + ".  " + matkul[i].getKodeMatkul() + " - " + matkul[i].getNamaMatkul());
            } else {
                break;
            }
            matkul[i].getDsn();
        }
    }
}
