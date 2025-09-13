import java.util.List;
import java.util.Scanner;

/**
 * Клас {@code Main} є точкою входу в програму.
 * <p>
 * Програма виконує такі дії:
 * <ul>
 *   <li>Зчитує з клавіатури кількість елементів послідовності Люка та Фібоначчі;</li>
 *   <li>Генерує відповідні послідовності чисел;</li>
 *   <li>Пропонує користувачу ввести число, на яке повинні закінчуватися елементи;</li>
 *   <li>Фільтрує числа послідовності Люка, що закінчуються на введене число,
 *       та виводить результат.</li>
 * </ul>
 */
public class Main {
    /**
     * Точка входу у програму.
     *
     * @param args аргументи командного рядка, передаються коли user запускає програму з консолі
     */
    public static void main(String[] args) {
        int n, a;
        /// Перевірка чи передав юзер якісь аргументи
        ///
        /// args.length > 0, то передав
        if(args.length > 0){
            try{
                n = Integer.parseInt(args[0]);
                a = Integer.parseInt(args[1]);
                final List<SequenceNumber> lucasSequence = SequenceUtils.luca(n);
            } catch (NumberFormatException e) {
                System.out.println("Аргумент не є числом. Спробуйте ввести з клавіатури.");
            }
        }
        Scanner sc = new Scanner(System.in);
        n = inputDataWithMessage(sc, "Введіть кількість чисел послідовності Люка (N): ");
        a = inputDataWithMessage(sc, "Введіть число, на які має закінчуватись кожне з перших " + n + " чисел послідовності люка(A):");

        final List<SequenceNumber> lucasSequence = SequenceUtils.luca(n);

        final List<SequenceNumber> sequenceEndsWithNumber = CheckUtils.filterByLastDigit(lucasSequence, a);

        System.out.print("Список чисел ряда Люка, який закінчується на " + a + ": ");
        sequenceEndsWithNumber.forEach(System.out::print);
    }

    /**
     * Метод для зчитування даних з консолі
     *
     * @inputDataWithMessage приймає сканнер,
     * та повідомлення, яке треба вивести,
     * перед отриманням числа
     */
    private static int inputDataWithMessage(Scanner scanner, String message) {
        int number;
        while (true) {
            System.out.print(message);
            try {
                number = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Це не число. Спробуйте ще раз.");
            }
        }
        return number;
    }

}