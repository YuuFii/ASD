package PBO.StudyCase.PetHouse;

public class Karyawan {
    private String nama;
    private String noTelepon;
    private float gaji;
    private String kelamin;
    private String jabatan;

    // Setter dan Getter Nama
    void setNama(String nama){
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }


    // Setter dan Getter Jabatan
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public String getJabatan() {
        return jabatan;
    }

    // Setter dan Getter Gaji
    public void setGaji(float gaji) {
        this.gaji = gaji;
    }
    public Float getGaji() {
        return gaji;
    }

    // Setter dan Getter Jenis Kelamin
    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }
    public String getKelamin() {
        return kelamin;
    }

    // Setter dan Getter No Telepon
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
    public String getNoTelepon() {
        return noTelepon;
    }

    // Output Data Karyawan
    public void PrintDataKaryawan(){
        System.out.println("Nama\t\t\t : " + getNama());
        System.out.println("No Telepon\t\t : " + getNoTelepon());
        System.out.println("Jenis Kelamin\t : " + getKelamin());
        if (getJabatan().equalsIgnoreCase("Groomer")){
            setGaji(3000000);
        } else if (getJabatan().equalsIgnoreCase("Dokter Hewan")) {
            setGaji(7000000);
        } else if (getJabatan().equalsIgnoreCase("Admin")) {
            setGaji(5000000);
        }
        System.out.println("Gaji\t\t\t : Rp " + getGaji());
        System.out.println("Jabatan\t\t\t : " + getJabatan());
        System.out.println("========================================");
        System.out.println("========================================");
    }
}
