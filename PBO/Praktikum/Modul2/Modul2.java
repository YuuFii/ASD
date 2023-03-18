package PBO.Praktikum.Modul2;
import java.util.Scanner;

class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private static int hitungObjek;

    public Student(){
        name = "";
        address = "";
        age = 0;
        hitungObjek++;
    }

    public Student(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
        hitungObjek++;
    }

    public Student(String name, String address, int age, double mathGrade, double englishGrade, double scienceGrade){
        this.name = name;
        this.address = address;
        this.age = age;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
        hitungObjek++;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setMath(double math){
        mathGrade = math;
    }

    public void setEnglish(double english){
        englishGrade = english;
    }

    public void setScience(double science){
        scienceGrade = science;
    }

    private double getAverage(){
        double result = 0;
        result = (mathGrade+scienceGrade+englishGrade)/3;
        return result;
    }

    public static void jumlahObjek(){
        System.out.println("\nJumlah objek yang dibuat sebanyak " + hitungObjek);
    }

    public boolean statusAkhir(){
        return getAverage() >= 61;
    }
    public void displayMessage(){
        System.out.println("\nSiswa dengan nama "+name);
        System.out.println("beramalat di "+address);
        System.out.println("berumur "+age);
        System.out.println("mempunyai nilai rata rata "+getAverage());
        if(statusAkhir()){
            System.out.println("Siswa dinyatakan lolos");
        } else {
            System.out.println("Siswa dinyatakan gagal");
        }
    }
}

public class Modul2  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Jumlah siswa : ");
        int jumlahSiswa = in.nextInt();in.nextLine();

        Student[] dataStudent = new Student[jumlahSiswa];
        for (int i = 0; i < dataStudent.length; i++) {
            dataStudent[i] = new Student();

            System.out.printf("\n%-14s : ", "Nama");
            dataStudent[i].setName(in.nextLine());

            System.out.printf("%-14s : ", "Address");
            dataStudent[i].setAddress(in.nextLine());

            System.out.printf("%-14s : ", "Age");
            dataStudent[i].setAge(in.nextInt());

            System.out.printf("%-14s : ", "Math Grade");
            dataStudent[i].setMath(in.nextDouble());

            System.out.printf("%-14s : ", "English Grade");
            dataStudent[i].setEnglish(in.nextDouble());

            System.out.printf("%-14s : ", "Science Grade");
            dataStudent[i].setScience(in.nextDouble());
            in.nextLine();
        }

        for (int i = 0; i < jumlahSiswa; i++) {
            dataStudent[i].displayMessage();
        }

        Student.jumlahObjek();
    }
}

