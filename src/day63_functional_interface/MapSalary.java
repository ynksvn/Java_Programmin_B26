package day63_functional_interface;

import java.util.HashMap;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {


//Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

        Map<String, Double> map = new HashMap<>();
        map.put("James", 70000.0);
        map.put("Jane", 30000.0);
        map.put("Ana", 140000.15);
        map.put("Jorge", 42452512.23);
        map.put("Elza", 123131214.1);
        map.put("Peter", 231234.0);

        String nameForLargest = "";
        double maxSalary = 0.0;

        String nameForLowest = "";
        double lowestSalary = Double.MAX_VALUE;
        // We can't declare 0, because 0 is the smallest number. Double.Max_Value gives us the biggest number on double


        //Use the created map to find the following:
    for (String key : map.keySet()){ // iterate through the keys
        double value = map.get(key); //we use get method to read the values by the key

        //    1.1 who has the maximum salary?
        if (value>maxSalary){
            nameForLargest = key;
            maxSalary = value;
        }
//    1.2 who has the minimum salary?
        if (value< lowestSalary){
            nameForLowest = key;
            lowestSalary = value;
        }


    }
        System.out.println("Max Salary: " + nameForLargest + "- $ " + maxSalary);
        System.out.println("Min Salary: " + nameForLowest + " -$ " + lowestSalary);

//    1.3 how many employees has the salary between 120k ~ 150K?

        int counter = 0;
        for (double value : map.values()){
            if (value >= 120_000 && value <= 150_000){
                counter++;
            }
        }
        System.out.println("Number over 120k and less than 150k" + counter);

//    1.4 display the names of the employees who are making less than 118k?

        for (String name : map.keySet()){
            if (map.get(name)<= 118_000){
                System.out.println(name);
            }
        }
//    1.5 increase the salary of each employee by 10K
        for (String key : map.keySet()){
            map.put(key, map.get(key) + 10_000);
        }

        System.out.println(map);
//
//


    }
}