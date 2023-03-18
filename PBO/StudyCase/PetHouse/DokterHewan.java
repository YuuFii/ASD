package PBO.StudyCase.PetHouse;

public class DokterHewan extends Karyawan{
    public float biayaCheckUp;
    public float biayaVaksin;

    public float getTagihanCheckUp(){
        return biayaCheckUp;
    }
    public float getTagihanVaksin(){
        return biayaVaksin;
    }

    public void setBiayaCheckUp(float biayaCheckUp) {
        this.biayaCheckUp = biayaCheckUp;
    }

    public void setBiayaVaksin(float biayaVaksin) {
        this.biayaVaksin = biayaVaksin;
    }
}
