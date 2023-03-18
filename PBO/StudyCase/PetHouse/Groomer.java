package PBO.StudyCase.PetHouse;

public class Groomer extends Karyawan{
    public float biayaPerawatan;

    public float getTagihanPerawatan(){
        return biayaPerawatan;
    }

    public void setBiayaPerawatan(float biayaPerawatan) {
        this.biayaPerawatan = biayaPerawatan;
    }
}
