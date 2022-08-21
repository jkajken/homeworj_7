package org.example;

public class Warrior extends Hero implements HavingSuperAbility {

    public Warrior(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior applied superpower : Critical damage");
    }
}
