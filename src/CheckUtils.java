import java.util.ArrayList;
import java.util.List;

/**
 * Утилітний клас {@code CheckUtils} надає методи для перевірки
 * та фільтрації числових послідовностей.
 */
public class CheckUtils {

    /**
     * Перевіряє, чи закінчується число на вказану цифру.
     * <p>
     * Метод є допоміжним і використовується для логічної перевірки.
     *
     * @param number число, яке перевіряється
     * @param digit  цифра, на яку має закінчуватись число
     * @return {@code true}, якщо число закінчується на цифру {@code digit},
     *         {@code false} — інакше
     */
    private boolean endsWithNumber(long number, long digit) {
        return number % 10 == digit;
    }

    /**
     * Фільтрує список чисел послідовності за останньою цифрою.
     *
     * @param numbers список чисел послідовності {@link SequenceNumber}
     * @param digit   цифра, на яку повинні закінчуватися числа
     * @return список {@link SequenceNumber}, які закінчуються на цифру {@code digit}
     */
    public static List<SequenceNumber> filterByLastDigit(List<SequenceNumber> numbers, int digit) {
        List<SequenceNumber> result = new ArrayList<>();
        for (SequenceNumber number : numbers) {
            if (number.getSequenceValue() % 10 == digit) {
                result.add(number);
            }
        }
        return result;
    }
}
