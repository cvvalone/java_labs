package Arena.Droid;

public class WarriorDroid extends Droid {

    public WarriorDroid(String name) {
        super(name, 100, 30, 40); // HP = 100, DMG = 30, Energy = 40
    }

    @Override
    public void specialAbility(Droid target) {
        if (energy < 10) {
            System.out.println(name + " не має достатньо енергії для критичного удару!");
            return;
        }

        energy -= 10;
        int chance = getRandom().nextInt(100); // 0..99
        if (chance < 25) { // 25% шанс на крит
            int critDamage = damage * 2;
            target.takeDamage(critDamage);
            System.out.println(name + " наносить КРИТИЧНИЙ удар " +
                    target.getName() + " на " + critDamage + " урон! (HP ворога: " + target.getHealth() + ")");
        } else {
            target.takeDamage(damage);
            System.out.println(name + " наносить звичайний удар " +
                    target.getName() + " на " + damage + " урон. (HP ворога: " + target.getHealth() + ")");
        }
    }

    @Override
    public String getType() {
        return "WarriorDroid";
    }
}

