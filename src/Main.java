import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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