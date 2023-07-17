package DZ6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    /*
     * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
Работу сдать как обычно ссылкой на гит репозиторий
Частые ошибки:
1. Заставляете пользователя вводить все существующие критерии фильтрации
2. Невозможно использовать более одного критерия фильтрации одновременно
3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики ноутбуков или добавить еще ноутбук, то программа начинает работать некорректно
     */
public static void main(String[] args) {
    Set<Laptop> set = new HashSet<>();

    Laptop laptop1=new Laptop(15, 8, 500, "Чёрный", "windows");
    
    Laptop laptop2=new Laptop(13, 4, 500, "Белый", "macOS");
    Laptop laptop3=new Laptop(17, 16, 500, "Синий", "windows");
    Laptop laptop4=new Laptop(13, 16, 500, "Красный", "macOS");
    Laptop laptop5=new Laptop(15, 8, 500, "Белый", "windows");
    Laptop laptop6=new Laptop(15, 16, 500, "белый", "windows");
    Laptop laptop7=new Laptop(17, 16, 500, "Чёрный", "macOS");
    Laptop laptop8=new Laptop(13, 12, 500, "Чёрный", "windows");
    Laptop laptop9=new Laptop(17, 12, 500, "Синий", "macOS");
    Laptop laptop10=new Laptop(17, 16, 500, "Чёрный", "windows");
  set.add(laptop1);
  set.add(laptop2);
  set.add(laptop3);
  set.add(laptop4);
  set.add(laptop5);
  set.add(laptop6);
  set.add(laptop7);
  set.add(laptop8);
  set.add(laptop9);
  set.add(laptop10);

  // for (Laptop laptop : set) {
  //   System.out.println(laptop);
  // }
  Scanner sk =new Scanner(System.in);
  System.out.println("Выбирите критерий по еоторому нужно выбрать ноутбук\n"+
        "1-Диагональ экрана\n"+
        "2-Оперативная память\n"+
        "3-Объём жесткого диска\n"+
        "4-Цвет ноутбука\n"+
        "5-Операционная система");
         int criterion=sk.nextInt();
         if(criterion==1){
            selectscreenDiagonal();
         }else If(criterion==2){
            selectRam();
         }else if (criterion==3){
            selectssdVolume();
         }else if (criterion==4){
            selectlaptopColor();
         }else if (criterion==5){
            selectoperatingSystem();
         }
 public void selectscreenDiagonal(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Выберите диагональ экрана\n"+ "1-13 дюймов\n"+"2-15 дюймов\n"+"3-17 дюймов\n");
        int s = sc.nextInt();
        HashMap<Integer, String> diag = new HashMap<Integer, String>();
        diag.put(1, "13");
        diag.put(2, "15");
        diag.put(3, "17");
        int i=1;
        for (Laptop elem : Set) {
            if(elem.getDiag().equals(diag.get(s))){
                System.out.println(i++);
                System.out.println(elem);
            }
        }
    }

    public void selectlaptopColor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбирите цвет ноутбука\n" +
        "1-чёрный\n"+
        "2-белый\n"+
        "3-синий\n"+
        "4-красный\n");
        int s =sc.nextInt();
        HashMap<Integer, String> color = new HashMap<Integer, String>();
        color.put(1,"чёрный");
        color.put(2, "белый");
        color.put(3, "синий");
        color.put(4,"красный");
        int i=1;
        for (Laptop elem : Set) {
            if(elem.getColor().equals(color.get(s))){
                System.out.println(i++);
                System.out.println(elem);
            }
        }
    }
    public void selectRam(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите объём оперативной памяти: \n"+
            "1-4ГБ\n"+
            "2-8ГБ\n"+
            "3-12ГБ\n"+
            "4-16ГБ\n");
        int s=sc.nextInt();
        HashMap<Integer, Integer> ram = new HashMap<Integer, Integer>();
        ram.put(1, 4);
        ram.put(2, 8);
        ram.put(3, 12);
        ram.put(4, 16);
        int i=1;
        for (Laptop elem : Set) {
            if(elem.getRam()==ram.get(s)){
                System.out.println(i++);
                System.out.println(elem);
            }
        }
    }
    public void selectssdVolume(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбирите объём жесткого диска\n" +
        "1-500ГБ\n"+
        "2-1ТБ\n"+
        "3-2ТБ\n"+
        "4-3ТБ\n");
        int s =sc.nextInt();
        HashMap<Integer, Integer> ssdVolume = new HashMap<Integer, Integer>();
        ssdVolume.put(1,500);
        ssdVolume.put(2, 1);
        ssdVolume.put(3, 2);
        ssdVolume.put(4,3);
        int i=1;
        for (laptop elem : Set) {
            if(elem.getSsdVolume()==ssdVolume.get(s)){
                System.out.println(i++);
                System.out.println(elem);
            }
        }
    }
 public void selectoperatingSystem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбирите операционную систему\n" +
        "1-Windows\n"+
        "2-macOS\n");
        int s =sc.nextInt();
        HashMap<Integer, String> oper = new HashMap<Integer, String>();
        oper.put(1,"windows");
        oper.put(2, "macOS");
        int i=1;
        for (Laptop elem : Set) {
            if(elem.getoper().equals(oper.get(s))){
                System.out.println(i++);
                System.out.println(elem);
            }
        }
    }        
}
}
