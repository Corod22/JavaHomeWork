import java.util.ArrayList;
/*
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
 * Вывести название каждой планеты и количество его повторений в списке. 
 */

public class Main33 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");
        planets.add("Марс");
        planets.add("Венера");
        planets.add("Земля");
        for (String planet : planets) {
            int count =0;
            for (String p : planets) {
                
              if(planet.equals(p)){
                 count++;
               }
            }
            System.out.println(planet +":"+ count);
        }
}
}
