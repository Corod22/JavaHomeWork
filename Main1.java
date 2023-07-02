/*
 * 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        int t=0;
        t=(n * (n + 1)) / 2;
        int res=1;
        for (int i = 1; i <= n; i++) {
          res=res*i;
        }
        System.out.printf("Треугольное число: %d\n", t);
        System.out.printf("Факториал равен %d\n", res);
        iScanner.close();
    }
}