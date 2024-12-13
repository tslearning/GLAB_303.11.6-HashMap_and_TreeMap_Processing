import java.util.TreeMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMapClass hashMapClass = new HashMapClass();
        TreeMapClass treeMapClass = new TreeMapClass();
//        hashMapClass.ExampleOneHashMap();
//        hashMapClass.ExampletwoHashMap();
//        treeMapClass.exampleTreemapOne();
//        treeMapClass.exampleTreemapTwo();

        //Creating a treemap with a customized comparator


        TreeMap<String, Integer> numbers = new TreeMap<>(new CustomComparator());


        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMapClass: " + numbers);

    }
}
