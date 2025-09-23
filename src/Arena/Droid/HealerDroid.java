package Arena.Droid;

public class HealerDroid extends Droid {
    public HealerDroid(String name) {
        super(name, 90, 15, 60);
    }

    @Override
    public void specialAbility(Droid target) {
        if(energy < 20){
            System.out.println(name + " не має достатньо енергії для лікування союзника, або себе!");
            return;
        }
        energy -= 20;
        target.heal(30);

    }

    @Override
    public String getType() {
        return "HealerDroid";
    }

    @Override
    public String[] getModel() {
        return new String[] {
                "    /^^\\",
                "   ( - )",
                "   | + |",
                "   |   |",
                "  /| | |\\",
                "    / \\",
                "   *   *"
        };
    }

}
