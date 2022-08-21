package org.example;

public class Medic extends Hero implements HavingSuperAbility {

    public Medic(int health, int damage) {
        super(health, damage);

    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic applied superpower: Medical damage");
    }

}
