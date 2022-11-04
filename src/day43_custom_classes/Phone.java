package day43_custom_classes;
public class Phone {
    String name;
    String brand;
    int memory;
    double version;

    public Phone() {
    }

    public Phone(String name) {
        this.name = name;
    }

    public Phone(String name, String brand) {
        this.name = name;
        this.brand = brand;

    }

    public Phone(String name, String brand, int memory, double version) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;
    }

    //    public String toString(){
//        return "Name: " + name + "\nBrand: " + brand + "\nMemory: " + memory + "\nVersion: " + version;
    public String toString() {
        String obj =  name;

        if (brand != null) {
            obj +=  " - " + brand;

        }
        if (memory != 0) {
            obj += " - " + memory + " - " + version ;
        }
return obj;
    }

}
/*
create instance variables
name, brand, memory, version

create constructors

- accept and initialize the name
 */