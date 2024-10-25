package Polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Fighter("Leomord", 20, 40, 100);
        Hero hero2 = new Marksman("Layla", 30, 60, 80);
        Hero hero3 = new Tank("Tigreal",20,20,200);

        //wrong example

        /*
        Fighter hero4 = new Marksman("Layla", 30, 60, 80);
        Fighter hero5 = new Hero("Layla", 30, 60, 80);
         */

        hero1.display();
        hero2.display();
        hero3.display();

        hero2.Attack(hero1);
        hero2.Attack(hero1);
    }
}
