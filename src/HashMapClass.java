import java.util.HashMap;

public class ExampleOneHashMap {
    HashMap<Integer, String> languages = new HashMap<>();

    public void languages(){

    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "JavaScript");
    languages.put(4, "C Sharp");

    System.out.println("HashMap: " + languages);

    //remove element associated with key 2
    String value = languages.remove(2);
    System.out.println("Removed value: " + value);
    System.out.println("Updated HashMap: " + languages);
    }

}
