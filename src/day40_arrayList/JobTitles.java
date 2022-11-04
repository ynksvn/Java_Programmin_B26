package day40_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {

        ArrayList<String> allJobs = new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET", "Developer", "PO", "CEO", "Dev op", "QA", "BA", "Chef", "Doctor", "Police Officer", "PO" ));
        System.out.println("Original list: " + allJobs);

        ArrayList<String> jobs1 = new ArrayList<>(allJobs);
        jobs1.removeAll(Arrays.asList("PO", "QA", "BA"));
        System.out.println("Removed example:" + jobs1);
        // if it was remove method. not collection, it would remove only the first one

        ArrayList<String> jobs2 = new ArrayList<>(allJobs);
        jobs2.retainAll(Arrays.asList("SDET", "Developer", "Dev op", "PO"));
        // it will keep the defined ones, and not show the others
        System.out.println("Retained example:" + jobs2);

        ArrayList<String> jobs3 = new ArrayList<>(allJobs);
        System.out.println("Contained example:" + jobs3.containsAll(Arrays.asList("Chef", "CEO")));
        System.out.println("Another contained example:" + jobs3.containsAll(Arrays.asList("Doctor", "Nurse")));








    }
}
