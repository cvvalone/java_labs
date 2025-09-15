package Arena.Droid;

public class TankDroid extends Droid {


    public TankDroid(String name, int health, int damage, int energy) {
        super(name, health, damage, energy);
    }


    /**
     * This is a special Tank's ability
     * @param target that a target, that droid aim's on
     */
    @Override
    public void specialAbility(Droid target) {
        target.damage =
    }

    @Override
    public String getType() {
        return "";
    }
}
