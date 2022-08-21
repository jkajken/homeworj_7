package org.example;

public class Magic extends Hero implements HavingSuperAbility {
    public Magic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic applied superpower: Magical damage");

    }

}
