import java.util.ArrayList;
import java.util.List;

/**
 * Утилітний клас {@code SequenceUtils} для генерації числових послідовностей.
 * <p>
 * Містить методи для побудови:
 * <ul>
 *   <li>послідовності Фібоначчі;</li>
 *   <li>послідовності Люка.</li>
 * </ul>
 */
public class SequenceUtils {

    /**
     * Генерує перші {@code n} чисел послідовності Фібоначчі.
     * <p>
     * Послідовність Фібоначчі визначається як:
     * <pre>
     * F(1) = 1, F(2) = 1,
     * F(n) = F(n-1) + F(n-2) для n > 2
     * </pre>
     *
     * @param n кількість чисел послідовності
     * @return список {@link SequenceNumber}, що містить індекси та значення чисел Фібоначчі
     */
    public static List<SequenceNumber> fibonacci(int n) {
        List<SequenceNumber> list = new ArrayList<>();
        long a = 1, b = 1;
        for (int i = 1; i <= n; i++) {
            list.add(new SequenceNumber(i, a));
            long temp = a + b;
            a = b;
            b = temp;
        }
        return list;
    }

    /**
     * Генерує перші {@code n} чисел послідовності Люка.
     * <p>
     * Послідовність Люка визначається як:
     * <pre>
     * L(1) = 1, L(2) = 3,
     * L(n) = L(n-1) + L(n-2) для n > 2
     * </pre>
     *
     * @param n кількість чисел послідовності
     * @return список {@link SequenceNumber}, що містить індекси та значення чисел Люка
     */
    public static List<SequenceNumber> luca(int n) {
        List<SequenceNumber> list = new ArrayList<>();
        long a = 1, b = 3;
        for (int i = 1; i <= n; i++) {
            list.add(new SequenceNumber(i, a));
            long temp = a + b;
            a = b;
            b = temp;
        }
        return list;
    }
}
