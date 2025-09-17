package Arena;

import Arena.Droid.Droid;
import Arena.Droid.DroidFactory;
import Arena.Menu.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вітаємо на арені дроїдів!");
        int n;
        while (true){
            try {
                System.out.println("Введіть кількість дроїдів, яка має бути на арені!");
                n = sc.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Введено не число, спробуйте ще раз");
            }
        }
        List<Droid> availableDroids = DroidFactory.generateDroids(n);
        Menu menu = new Menu(availableDroids);

    }
}