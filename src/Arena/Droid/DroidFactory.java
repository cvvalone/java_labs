package Arena.Droid;
import java.util.*;

public class DroidFactory {
    private static final Random random = new Random();

    public static List<Droid> generateDroids(int count) {
        List<Droid> droids = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int type = random.nextInt(4); // 0..3 (наприклад 4 види)
            Droid droid;

            switch (type) {
                case 0 -> droid = new WarriorDroid("Warrior#" + (i + 1));

                case 1 -> droid = new SniperDroid("Sniper#" + (i + 1));

                case 2 -> droid = new HealerDroid("Healer#" + (i + 1));

                default -> droid = new VampireDroid("Vampire#" + (i + 1));
            }

            droids.add(droid);
        }

        return droids;
    }
}
