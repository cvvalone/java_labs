/**
 * Клас {@code SequenceNumber} представляє одне число з математичної послідовності
 * (наприклад, Фібоначчі чи Люка).
 * <p>
 * Кожен об'єкт містить:
 * <ul>
 *   <li>індекс елемента у послідовності;</li>
 *   <li>значення числа у цьому індексі.</li>
 * </ul>
 */
public class SequenceNumber {
    /** Позиція елемента у послідовності (починаючи з 0 або 1). */
    private long sequenceIndex;
    /** Значення елемента послідовності. */
    private long sequenceValue;

    /**
     * Створює новий об'єкт {@code SequenceNumber}.
     *
     * @param sequenceIndex індекс елемента у послідовності
     * @param sequenceValue значення елемента послідовності
     */
    public SequenceNumber(long sequenceIndex, long sequenceValue) {
        this.sequenceIndex = sequenceIndex;
        this.sequenceValue = sequenceValue;
    }

    /**
     * Повертає індекс елемента у послідовності.
     *
     * @return індекс елемента
     */
    public long getSequenceIndex(){
        return sequenceIndex;
    }

    /**
     * Повертає значення елемента послідовності.
     *
     * @return значення елемента
     */
    public long getSequenceValue(){
        return sequenceValue;
    }

    /**
     * Повертає текстове представлення об'єкта {@code SequenceNumber}.
     * <p>
     * Формат: значення числа з пробілом у кінці.
     *
     * @return рядок зі значенням числа
     */
    @Override
    public String toString() {
        return String.format("%d ", sequenceValue);
    }
}
