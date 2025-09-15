package Arena.Droid;


import java.util.Random;

public abstract class Droid {
    protected String name;
    protected int health;
    protected int damage;
    protected int energy;

    private static final Random random = new Random();

    public Droid(String name, int health, int damage, int energy) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.energy = energy;
    }

    public abstract void specialAbility(Droid target);
    public abstract String getType();

    public void attack(Droid target) {
        if (!isAlive()) {
            System.out.println(name + " мертвий і не може атакувати.");
            return;
        }
        int dealtDamage = damage;
        target.takeDamage(dealtDamage);
        System.out.println(name + " атакує " + target.getName() +
                " на " + dealtDamage + " урон. (HP ворога: " + target.getHealth() + ")");
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) health = 0;
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
