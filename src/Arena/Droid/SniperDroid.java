package Arena.Droid;

public class SniperDroid extends Droid
{
    private int specialShotsRemaining;

    public SniperDroid(String name) {
        super(name, 70, 25, 50);
        this.specialShotsRemaining = 0;
    }

    @Override
    public void specialAbility(Droid target) {
        if(energy < 15){
            System.out.println(name + " не має достатньо енергії для використання уміння HeadShot!");
            return;
        }
        int chance = getRandom().nextInt(100);
        if(chance < 50){
            int missChance = getRandom().nextInt(100);
            if(missChance < 50){
                target.takeDamage(0);
                System.out.println(name + " промахнувся!");
                return;
            }
            target.takeDamage(damage*3);

        }else{
            takeDamage(damage);
            System.out.println(name + " наносить звичайний удар " +
                    target.getName() + " на " + damage + " урон. (HP ворога: " + target.getHealth() + ")");
        }
    }

    @Override
    public String getType() {
        return "SniperDroid";
    }

    @Override
    public String[] getModel() {
        return new String[] {
                "    /^^\\",
                "   |o  o|",
                "   |    |",
                "   |---|======>",
                "    / \\",
                "   /   \\"
        };
    }
}
