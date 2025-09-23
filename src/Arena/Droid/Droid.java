package Arena.Droid;


import Arena.Battle.Arena.BattleAnimation;

import java.util.Random;

public abstract class Droid {
    protected String name;
    protected int health;
    protected int maxHealth;
    protected int damage;
    protected int energy;

    private static final Random random = new Random();

    public Droid(String name, int health, int damage, int energy) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.damage = damage;
        this.energy = energy;
    }

    public abstract void specialAbility(Droid target);
    public abstract String getType();
    public abstract String[] getModel();

    public Droid attack(Droid target) {
        if (!isAlive()) {
            System.out.println(name + " мертвий і не може атакувати.");
            return this;
        }
        int dealtDamage = damage;
        target.takeDamage(dealtDamage);
        System.out.println(name + " атакує " + target.getName() +
                " на " + dealtDamage + " урон. (HP ворога: " + target.getHealth() + ")");
        return this;
    }

    public Droid animateAttack(Droid target) {
        BattleAnimation.attackAnimation(this, target);
        return this;
    }


    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) health = 0;
    }

    public void heal(int amount) {
        if (health + amount > this.health) System.out.println(name + " має максимальний рівень здоровʼя");
        health = Math.min(health + amount, maxHealth);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getEnergy() {
        return energy;
    }

    public void restoreEnergy(int amount) {
        energy += amount;
    }

    public static Random getRandom() {
        return random;
    }

    @Override
    public String toString() {
        return "[" + getType() + "] " + name +
                " | HP: " + health +
                " | DMG: " + damage +
                " | EN: " + energy;
    }

}
