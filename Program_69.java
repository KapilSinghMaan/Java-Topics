// HashMap = A data structure that stores key-value pairs
//           Keys are unique, but Values can be duplicated
//           Does not maintain any order, but is memory efficient
//           HashMap<Key, Value>

import java.util.HashMap;

public class Program_69 {
    public static void main(String[] args) {
        HashMap<String, Double> map=new HashMap<>();

        map.put("Apple", 5.25);
        map.put("Orange", 10.258);
        map.put("Banana", 15.0);
        map.put("Coconut", 150.99);

        // map.get("Apple");

        // map.remove("Orange");

        //map.containsKey("pineapple");

        //map.containsValue(15.0);

        //map.size();
        
        // System.out.println(map);

        for(String key:map.keySet())
        {
            System.out.println(key+" costs "+map.get(key)+" ruppees only.");
        }
    }
}
