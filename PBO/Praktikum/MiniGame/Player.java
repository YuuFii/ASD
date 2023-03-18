package PBO.Praktikum.MiniGame;

public class Player{
    private int health;
    private int damage;
    private int koin;

    public Player(int health, int damage, int koin){
        this.health = health;
        this.damage = damage;
        this.koin = koin;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public void setKoin(int koin){
        this.koin = koin;
    }
    public int getHealth(){
        return health;
    }

    public int getDamage(){
        return damage;
    }

    public int getKoin(){
        return koin;
    }

    public void takeDamage(Monster attacker){
        System.out.println("Monster menyerang Player");
        health -= attacker.getDamage();
    }

    public void upgradeDamage(int plusDamage){
        if(koin >= 1){
            this.damage += plusDamage;
            koin--;
        } else{
            return;
        }
    }

    public void upgradeHealth(int plusHealth){
        if(koin >= 1){
            this.health += plusHealth;
        } else{
            return;
        }
    }

    public boolean isAlive(){
        return this.health > 0;
    }

    public void print(){
        System.out.println("Player");
        System.out.println("HP     : " + getHealth());
        System.out.println("Damage : " + getDamage());
        System.out.println("Koin   : " + getKoin());
    }

}
