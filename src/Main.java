import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Main {
    public static void main(String[] args) {
        // óvodai jelek
        Map<String, String> ovodaiJelek = new HashMap<>();
        ovodaiJelek.put("Zámbó Jimmy", "korona");
        ovodaiJelek.put("Orosz Ildikó", "katicabogár");
        ovodaiJelek.put("Nagy Katalin", "katicabogár");
        ovodaiJelek.put("Kiss Péter", "autó");
        ovodaiJelek.remove("Zámbó Jimmy");

        System.out.println(ovodaiJelek.get("Orosz Ildikó"));
        System.out.println(ovodaiJelek);
        System.out.println(ovodaiJelek.keySet());
        System.out.println(ovodaiJelek.values());
        System.out.println(ovodaiJelek.entrySet());
        System.out.println(ovodaiJelek.get("Gipsz Jakab"));
        System.out.println(ovodaiJelek.replace("Orosz Ildikó", "katicabogár", "pillangó"));
        System.out.println(ovodaiJelek);


        // Vissza a tesiórára
        Map<String, Integer> heightMap = new HashMap<>();
        heightMap.put("Sziproka", 131);
        heightMap.put("Csuporka", 134);
        heightMap.put("Puszedli", 123);
        heightMap.put("X-Professzor", 185);
        heightMap.put("Mohó Jojó", 152);

        // összes testmagasság
        for (Integer actual : heightMap.values()) {
            System.out.println(actual);
        }
        System.out.println(heightMap.values());

        // legnagyobb testmagasság
        Integer maxHeight = Integer.MIN_VALUE;
        for (Integer entry : heightMap.values()) {
            if (entry > maxHeight) {
                maxHeight = entry;
            }
        }
        System.out.println(maxHeight);

        for (var actual : heightMap.entrySet()) {
            if (maxHeight < actual.getValue()) {
                maxHeight = actual.getValue();
            }
        }
        System.out.println(maxHeight);

        // min. magasság keresése
        int minHeight = Integer.MAX_VALUE;
        Map.Entry<String, Integer> minEntry = null;

        for (var actual : heightMap.entrySet()) {
            if (actual.getValue() < minHeight) {
                minHeight = actual.getValue();
                minEntry = actual;
            }
        }
        System.out.println(minEntry.getKey());

        // Sziporka nőtt 1 cm-rel
        heightMap.put("Sziporka", heightMap.get("Sziporka") + 1);



        // 2.c Vissza az iskolapadba
        Map<String, List<Integer>> grades = new HashMap<>();

        /*
        List<Integer> aliceGrades = new ArrayList<>();
        aliceGrades.add(5);
        aliceGrades.add(2);
        aliceGrades.add(1);
        grades.put("Alice", aliceGrades);

        List<Integer> bobGrades = new ArrayList<>();
        bobGrades.add(4);
        bobGrades.add(3);
        grades.put("Bob", bobGrades);

         */

        grades.put("Alice", Arrays.asList(5, 2, 1, 8));
        grades.put("Bob", Arrays.asList(7, 9));
        grades.put("Charlie", Arrays.asList(4, 5, 4));
        System.out.println(grades);


    }

}
