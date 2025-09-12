import java.util.ArrayList;
import java.util.List;

public class CheckUtils {
    public static List<SequenceNumber> filterByLastDigit(List<SequenceNumber> numbers, int digit) {
        List<SequenceNumber> result = new ArrayList<>();
        for (SequenceNumber num : numbers) {
            if (num.getSequenceValue() % 10 == digit) {
                result.add(num);
            }
        }
        return result;
    }

}
