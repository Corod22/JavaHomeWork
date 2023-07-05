/**
 * task2
 * Вывести все простые числа от 1 до 1000
 */
import java.util.ArrayList;
import java.util.List;


public class Main2 {

    public static void main(String[] args) {
        int n = 1000;
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <n; i++) {
            boolean primeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
}