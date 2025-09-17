package Arena.Droid;

public class TankDroid extends Droid {

    private int shieldTurns;

    public TankDroid(String name) {
        super(name, 150, 20, 50);
        this.shieldTurns = 0;
    }


    /**
     * This is a special Tank's ability
     * @param target that a target, that droid aim's on
     */
    @Override
    public void specialAbility(Droid target) {
        if(energy < 25){
            System.out.println(name + " не має достатньо енергії для використання щита!");
            return;
        }
        if (shieldTurns > 0) {
            System.out.println(name + " вже має активний щит!");
            return;
        }

        shieldTurns = 2; // щит діє 2 ходи
        energy -= 25;
        System.out.println(name + " активує *Shield Wall*! Урон зменшено на 50% на 2 ходи.");
    }

    @Override
    public void takeDamage(int amount) {
        if (shieldTurns > 0) {
            amount /= 2; // Damage
            shieldTurns--;
            System.out.println(name + " блокує частину урону щитом!");
        }
        super.takeDamage(amount);
    }

    @Override
    public String getType() {
        return "TankDroid";
    }
}
