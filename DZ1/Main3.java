/* 
 * 3) Реализовать простой калькулятор
*/
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
         Scanner iScanner = new Scanner(System.in);
         System.out.print("Введите первое число: ");
         int numbA = iScanner.nextInt();
         System.out.println("Введите операцию + - / *: ");
         char operation = iScanner.next().charAt(0);
         System.out.print("Введите второе число: ");
         int numbB = iScanner.nextInt();
         int res;
         switch (operation) {
             case '+':
                 res = numbA + numbB;
                 System.out.printf("Результат: %d",res);
                 break;
             case '-':
                 res = numbA - numbB;
                 System.out.printf("Результат: %d",res);
                 break;
             case '/':
                 res = numbA / numbB;
                 System.out.printf("Результат: %d",res);
                 break;
             case '*':
                 res = numbA * numbB;
                 System.out.printf("Результат: %d",res);
                 break;

         }
         iScanner.close();
     }
}

