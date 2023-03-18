package PBO.Praktikum.MiniGame;
import java.util.Scanner;

public class Main {
    /*
        hC = 25,  dC = 4
        hM = 9,  dM = 20
        koin = 1, upDamage = 1, upHP = 10

        25/20 = 1,...

        9/4 = 2,...

        hC = 9,  dC = 2
        hM = 69,  dM = 2
        koin = 4, upDamage = 2, upHP = 7
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fight = in.nextInt();
        for (int i = 0; i < fight; i++) {
            int healthP = in.nextInt();
            int damageP = in.nextInt();

            int healthM = in.nextInt();
            int damageM = in.nextInt();

            int coin = in.nextInt();
            int upDamage = in.nextInt();
            int upHealth = in.nextInt();

            Player astolfo = new Player(healthP, damageP, coin);
            Monster monster = new Monster(healthM, damageM);

            if(astolfo.getHealth()/monster.getDamage() < monster.getHealth()/ astolfo.getDamage()){

            }



            while(astolfo.isAlive() && monster.isAlive()){
                System.out.println("-----------------------------------------");
                astolfo.print();
                monster.print();

                if(astolfo.isAlive()){
                    monster.takeDamage(astolfo);
                } else{
                    break;
                }

                if(monster.isAlive()){
                    astolfo.takeDamage(monster);
                } else {
                    break;
                }


            }

            if(astolfo.isAlive()){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }

            System.out.println("-----------------------------------------");
            astolfo.print();
            monster.print();
        }
        


    }
}
