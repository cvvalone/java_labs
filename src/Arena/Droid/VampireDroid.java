package Arena.Droid;

public class VampireDroid extends Droid {
    public VampireDroid(String name) {
        super(name, 100, 20, 60);
    }

    @Override
    public void specialAbility(Droid target) {
        if(energy < 15){
            System.out.println(name + " не має достатньо енергії для використання спеціальної можливості!");
            return;
        }
        energy -= 15;
        target.takeDamage(20);
        heal(20);
        System.out.println(name + " наносить атаку і краде собі 20 HP!");
    }

    @Override
    public String getType() {
        return "VampireDroid";
    }

    @Override
    public String[] getModel() {
        return new String[] {
                "    /^^\\",
                "   (O  O)",
                "   ( ^ )",
                "   | V |",
                "  /|_|_|\\",
                "    / \\",
                "   /   \\"
        };
    }

}
