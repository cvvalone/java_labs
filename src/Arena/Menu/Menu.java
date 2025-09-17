package Arena.Menu;

import Arena.Droid.Droid;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    private List<Droid> availableDroids;  // усі дроїди гри
    private Droid playerDroid;            // дроїд гравця
    private Droid enemyDroid;             // дроїд суперника
    private Scanner scanner;              // для вводу

    public Menu(List<Droid> droids) {
        this.availableDroids = droids;
        this.scanner = new Scanner(System.in);
    }

    // ===== Основне меню =====
    public void showMainMenu() {
        boolean running = true;
        while (running) {
            System.out.println("=== Головне меню ===");
            System.out.println("1. Почати гру");
            System.out.println("2. Обрати дроїдів");
            System.out.println("3. Інформація про дроїдів");
            System.out.println("4. Вихід");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> startBattle();
                case 2 -> chooseDroids();
                case 3 -> showDroidsInfo();
                case 4 -> {
                    running = false;
                    System.out.println("Гру завершено.");
                }
                default -> System.out.println("Невірний вибір, спробуйте ще.");
            }
        }
    }

    // ===== Обрання дроїдів =====
    private void chooseDroids() {
        System.out.println("Оберіть свого дроїда:");
        printDroids();

        int choice = scanner.nextInt();
        playerDroid = availableDroids.get(choice - 1);

        // Суперник отримує випадкового
        Random rand = new Random();
        enemyDroid = availableDroids.get(rand.nextInt(availableDroids.size()));

        System.out.println("Ваш дроїд: " + playerDroid.getName());
        System.out.println("Дроїд суперника: " + enemyDroid.getName());
    }

    // ===== Інформація про всіх дроїдів =====
    private void showDroidsInfo() {
        System.out.println("=== Доступні дроїди ===");
        for (int i = 0; i < availableDroids.size(); i++) {
            System.out.println((i + 1) + ". " + availableDroids.get(i));
        }
    }

    // ===== Запуск бою =====
    private void startBattle() {
        if (playerDroid == null || enemyDroid == null) {
            System.out.println("Спочатку оберіть дроїдів!");
            return;
        }

        System.out.println("=== Бій починається! ===");

        while (playerDroid.isAlive() && enemyDroid.isAlive()) {
            battleTurn(playerDroid, enemyDroid);   // хід гравця
            if (!enemyDroid.isAlive()) break;

            battleTurn(enemyDroid, playerDroid);   // хід суперника
        }

        checkBattleResult();
    }

    // ===== Хід одного дроїда =====
    private void battleTurn(Droid active, Droid target) {
        System.out.println("\nХід: " + active.getName());

        if (active == playerDroid) {
            System.out.println("1. Атакувати");
            System.out.println("2. Використати здатність");
            System.out.println("3. Пропустити хід");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> active.attack(target);
                case 2 -> active.specialAbility(target);
                case 3 -> System.out.println(active.getName() + " пропускає хід.");
                default -> System.out.println("Невірний вибір, втрачено хід!");
            }
        } else {
            // логіка для бота
            Random rand = new Random();
            int action = rand.nextInt(100);
            if (action < 70) {
                active.attack(target);
            } else {
                active.specialAbility(target);
            }
        }

        System.out.println("Стан після ходу:");
        System.out.println(playerDroid.getName() + " HP: " + playerDroid.getHealth());
        System.out.println(enemyDroid.getName() + " HP: " + enemyDroid.getHealth());
    }

    // ===== Перевірка результату бою =====
    private void checkBattleResult() {
        if (playerDroid.isAlive()) {
            System.out.println("Ви перемогли!");
        } else {
            System.out.println("Суперник переміг!");
        }
    }

    // ===== Допоміжний метод =====
    private void printDroids() {
        for (int i = 0; i < availableDroids.size(); i++) {
            System.out.println((i + 1) + ". " + availableDroids.get(i).getName());
        }
    }
}
