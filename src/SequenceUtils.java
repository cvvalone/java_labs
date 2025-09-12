import java.util.ArrayList;
import java.util.List;

public class SequenceUtils {
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

    public static List<SequenceNumber> lucas(int n) {
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
