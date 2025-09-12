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
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть кількість чисел послідовності Люка (N): ");
        int n = sc.nextInt();

        final List<SequenceNumber> lucasSequence = SequenceUtils.lucas(n);
        final List<SequenceNumber> fibonacciSequence = SequenceUtils.fibonacci(n);

        System.out.print("Введіть число, на які має закінчуватись кожне з чисел послідовності люка(A):");
        int a = sc.nextInt();

        final List<SequenceNumber> sequenceEndsWithNumber = CheckUtils.filterByLastDigit(lucasSequence, a);

        System.out.print("Список чисел ряда Люка, який закінчується на " + a + ": ");
        sequenceEndsWithNumber.forEach(System.out::print);
    }
}