package org.example;

public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String SuperAbility;


    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperAbility() {
        return SuperAbility;
    }

    public void setSuperAbility(String superAbility) {
        SuperAbility = superAbility;
    }

}

