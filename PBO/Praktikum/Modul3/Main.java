package PBO.Praktikum.Modul3;

class Akun{
    private String name;
    private String password;

    public void setName(String name){
        this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }
}

public class Main {
    public static void main(String[] args) {
        Akun akun = new Akun();
        akun.setName("Nico");
        akun.setPassword("123456");
        System.out.println();
    }
}
