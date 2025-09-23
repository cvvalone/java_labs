package Arena.Battle.Arena;

import Arena.Droid.Droid;

public class BattleAnimation {
    public static void attackAnimation(Droid attacker, Droid defender) {
        String[] attackerModel = attacker.getModel();
        String[] defenderModel = defender.getModel();
        int widthBetween = 30; // кількість пробілів між дроїдами
        int modelHeight = Math.max(attackerModel.length, defenderModel.length);

        try {
            for (int step = 0; step <= widthBetween; step++) {
                // Очищаємо консоль
                System.out.print("\033[H\033[2J");
                System.out.flush();

                for (int i = 0; i < modelHeight; i++) {
                    String aLine = i < attackerModel.length ? attackerModel[i] : " ".repeat(attackerModel[0].length());
                    String dLine = i < defenderModel.length ? defenderModel[i] : " ".repeat(defenderModel[0].length());

                    String projectile = (i == modelHeight / 2) ? "→" : " "; // снаряд летить по середині
                    String spaces = " ".repeat(step);

                    System.out.println(aLine + spaces + projectile + " ".repeat(widthBetween - step) + dLine);
                }

                Thread.sleep(100); // швидкість анімації
            }

            System.out.println("\n💥 BOOM! " + defender.getName() + " отримує шкоду!\n");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}