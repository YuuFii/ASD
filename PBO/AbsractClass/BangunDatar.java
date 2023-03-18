package PBO.AbsractClass;

// Class abstract tidak dapat dilakukan instansiasi

public abstract class BangunDatar {
    public void print(){
        System.out.println("\nIni adalah kelas abstrak");
    }

    public abstract double luas();
    public abstract double keliling();
}

