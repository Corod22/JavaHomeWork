package DZ4;
    /*
 * Найдите сумму всех элементов LinkedList, 
 * сохраняя все элементы в списке. 
 * Используйте итератор
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main43 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(41);
        list.add(27);
        list.add(18);
        list.add(17);
        System.out.println("Список элементов: " + list);
        System.out.println("сумма элементов: " + sum(list));
        System.out.println("Список элементов: " + list);
    }

    public static <T extends Number> double sum(List<T> list) {
        Iterator<T> it = list.iterator();
        double res = 0;
        while (it.hasNext())
            res += it.next().doubleValue();
        return res;
    }

}

