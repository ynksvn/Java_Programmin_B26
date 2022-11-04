package GentritsCodes.Task6;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class T1_SortMapValues {
    //    1.) java.util.Map - Sort the map by values
    //    Write a method that can sort the Map by values

//    public static void main(String[] args) {
//
//        Map<String, Integer> unsortMap = new HashMap<>();
//        unsortMap.put("Java", 8);
//        unsortMap.put("Selenium", 10);
//        unsortMap.put("SQL", 9);
//        unsortMap.put("Grid", 3);
//        unsortMap.put("Cydeo", 100);
//
//
//        System.out.println("Unsort Map......");
//        System.out.println(unsortMap);
//
//        System.out.println("\nSorted Map......By Key");
//        Map<String, Integer> treeMap = new TreeMap<>(unsortMap);
//        System.out.println(treeMap);
//
//    }


    public static Stream sortTheMap(Map<String, Integer> grades) {
        Stream<Map.Entry<String, Integer>> sorted = grades.entrySet().stream()
                .sorted(Map.Entry.comparingByValue());
        //Using down casting, creating an object, so that we can use stream method.
        //not a data structure -also added in Java 8 after lambda


        return sorted;
    }

    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Math", 98);
        grades.put("English", 88);
        grades.put("Civics", 96);
        grades.put("History", 92);
        grades.put("Art", 89);

        sortTheMap(grades).forEach(System.out::println);//allow to iterate through the elements
    }
}