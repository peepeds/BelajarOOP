package Polymorphism;

public class Hero {
    private String name;
    private double speed;
    private boolean isDead;
    private double damage;
    private double health;

    Hero(String name, double speed, double damage, double health){
        this.name = name;
        this.speed = speed;
        this.damage = damage;
        this.health = health;
        this.isDead = false;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setDead(boolean dead) {
        this.isDead = dead;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void Attack(Hero hero ){
        hero.health -= this.damage;
        System.out.println(hero.name + " is attack by " +this.name);

        if(hero.health <=0){
           hero.setDead(true);
           System.out.println(hero.name + " is Dieeeeeee");
        }
    }

    public void display(){
        System.out.println("Name\t : " + name);
        System.out.println("Health\t : " + health);
        System.out.println("Damage\t : " + damage);
        System.out.println("Speed\t : " + speed + "\n");
    }
}
