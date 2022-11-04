package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {

        //first step : define the map
        //keys are Integer and values are String. No primitives, only object types
        Map<Integer, String> map = new HashMap<>();
     //   map.add(); We cant do map add method. It made in collection phase. It doesnt have connection with map
        map.put(1, "one"); //how to add the element to map
        map.put(3, "three");
        map.put(10, "ten");
        System.out.println(map); //{1=one, 3=three, 10=ten}
        map.put(5, "five");
        System.out.println(map); //{1=one, 3=three, 5=five, 10=ten}
        //it doesn't care my order (not insertion order) but at the same it is not sorting. It is random

        //read the key/value from map

        //the argument is the key, not index
        System.out.println(map.get(10));

        //
        String value = map.get(5);  //it is the string type. we can restore it

        //it will find the matching value and remove that value
        map.remove(1);
        System.out.println(map); // {3=three, 5=five, 10=ten}

        System.out.println(map.containsKey(1)); //It is removed, we dont have it anymore. So it will print false
        System.out.println(map.containsKey(3)); // it will print true
        System.out.println(map.containsValue("five")); //true
        System.out.println(map.containsValue(10)); //false. i dont have 10 as a value

        map.put(null, null); // {null=null, 3=three, 5=five, 10=ten}
        System.out.println(map);

        map.put(null, "hello world"); // it doesn't allow the duplicates. There is only one 'null' key in this example
        System.out.println(map); // {null=hello world, 3=three, 5=five, 10=ten}



        map.put(3, "March"); // 3 key exists, the value gets updated to March
        System.out.println(map);

        map.put(7, "March");
        System.out.println(map);










    }
}
