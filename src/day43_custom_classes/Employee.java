package day43_custom_classes;

public class Employee {
    String name;
    int id;
    String job;
    double salary;

    public Employee(String name, String job){
        this.name = name;
        this.job = job;
    }
    public Employee (String name, int id, String job, double salary){
        this.name = name;
        this.id = id;
        this.job = job;
        this.salary = salary;
    }


    public void goToMeeting(){

        System.out.println(name + " is going to the meeting");
    }


    public String toString(){


       return "Employee name: " + name + "\nEmployee ID: "+ id + "\nJob Title: " + job + "\nSalary: $" + salary;
    }




}


/*
create a class called Employee

        - data:

            name, id, job title, salary

        - constructor

            - create a constructor that creates an Employee object with the name and job title

            - create a constructor that creates an Employee object with the name, id, job title, and salary

        - method:

            goToMeeting()
                when this method is called print:
                    $name is going to a meeting

            toString()
                print all the employees information

    Create a separate class to create and test the Employee objects

 */