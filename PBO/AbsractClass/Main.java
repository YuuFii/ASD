package PBO.AbsractClass;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(3);
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 7);

        persegi.print();
        System.out.println("=====\nRumus Persegi\n=====");
        System.out.println("Luas Persegi : " + persegi.luas());
        System.out.println("Keliling Persegi : " + persegi.keliling());

        persegiPanjang.print();
        System.out.println("=====\nRumus Persegi Panjang\n=====");
        System.out.println("Luas Persegi Panjang : " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang : " + persegiPanjang.keliling());

    }
}
