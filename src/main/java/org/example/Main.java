package org.example;

public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic(800, 300);
        Magic magic = new Magic(700, 320);
        Warrior warrior = new Warrior(650, 250);

        Hero[] hero = {
                medic, warrior, magic
        };
        for (int i = 0; i < hero.length; i++) {
            System.out.println(hero[i].printinfo());
            hero[i].applySuperAbility();


        }
    }
}
