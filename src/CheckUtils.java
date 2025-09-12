import java.util.ArrayList;
import java.util.List;

public class CheckUtils {
    private boolean endsWithNumber(long number, long digit){
        return number % 10 == digit;
    }

    public static List<SequenceNumber> filterByLastDigit(List<SequenceNumber> numbers, int digit) {
        List<SequenceNumber> result = new ArrayList<>();
        for (SequenceNumber number : numbers) {
            if(number.getSequenceValue() % 10 == digit){
                result.add(number);
            }
        }
        return result;
    }

}
