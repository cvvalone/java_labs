package Arena.Battle.Arena;

import Arena.Droid.Droid;

public class BattleAnimation {

    public static void attackAnimation(Droid attacker, Droid defender) {
        try {
            System.out.println(attacker + " атакує " + defender + "!");

            // "Снаряд" летить від лівого до правого краю
            for (int i = 0; i < 20; i++) {
                String spaces = " ".repeat(i);
                System.out.print("\r" + spaces + ">>>");  // перезаписуємо рядок
                Thread.sleep(100);
            }

            System.out.print("\r" + " ".repeat(20) + "💥 BOOM!\n");
            Thread.sleep(500);

            System.out.println(defender + " отримує шкоду!\n");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}