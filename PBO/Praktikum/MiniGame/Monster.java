package PBO.Praktikum.MiniGame;

public class Monster {
    private int health;
    private int damage;

    public Monster(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void takeDamage(Player attacker){
        System.out.println("Player menyerang Monster");
        this.health -= attacker.getDamage();
    }

    public boolean isAlive(){
        return this.health > 0;
    }

    public void print(){
        System.out.println("\nMonster");
        System.out.println("HP     : " + getHealth());
        System.out.println("Damage : " + getDamage());
    }
}
