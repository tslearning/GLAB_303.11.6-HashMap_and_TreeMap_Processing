import java.util.HashMap;
import java.util.TreeMap;

public class HashMapClass {
    java.util.HashMap<Integer, String> languages = new java.util.HashMap<>();

    public void ExampleOneHashMap() {

        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        languages.put(4, "C Sharp");

        System.out.println("HashMap: " + languages);

        //remove element associated with key 2
        String value = languages.remove(2);//Remove key will remove value
        System.out.println("Removed value: " + value);//String value is assign value Python
        System.out.println("Updated HashMap: " + languages);
    }

    public void ExampletwoHashMap() {
        HashMap<String, String> newHashMap = new HashMap<>();
        // Addition of key and value
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key4", null);
        newHashMap.put(null, "Sony");

        System.out.println("Original map contains: " + newHashMap);

        //getting size of Hashmap
        System.out.println("Size of original Map is:" + newHashMap.size());

        //copy contains of one Hashmap to another
        HashMap<String, String> copyHashMap = new HashMap<>();
        copyHashMap.putAll(newHashMap); //Copy HashMap list
        System.out.println("copyHashMap mappings= " + copyHashMap);

        //Removal of null key
        String nullKeyValue = copyHashMap.remove(null);
        System.out.println("copyHashMap null key value = " + nullKeyValue);
        System.out.println("copyHashMap after removing null key = " + copyHashMap);
        System.out.println("Size of copyHashMap is:" + copyHashMap.size());
    }
}


