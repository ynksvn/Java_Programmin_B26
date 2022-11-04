package day05_variables;

public class day05practice {

    public static void main(String[] args) {

        String houseType, address;
        char schoolDistrict;
        int numberOfBaths, numberOfKitchens, numberOfBedrooms, zipcode;
        double costOftheHouse;
        boolean isBasement, isAttic, isPool, isPark, isForSale;

        houseType = "Single Family House";
        address = "Tampa, Florida";
        schoolDistrict = '4';
        numberOfBedrooms = 4;
        numberOfBaths = 4;
        numberOfKitchens = 2;
        zipcode = 33606;
        costOftheHouse = 350000;
        isBasement = false;
        isAttic = false;
        isPool = true;
        isPark = true;
        isForSale = true;

        String fullDetails = "\nThe " + houseType + " at " + address + ", " + zipcode + " and it will be on the market soon.\nThe house has " + numberOfBedrooms + " bedrooms and " + numberOfBaths + " bathrooms and " + numberOfKitchens + " kitchens.\nThe house:\nBasement: " + isBasement + "  \tAttic: " + isAttic + "\tPool: " + isPool + "\tClose to a park: " + isPark + "\tFor sale: " + isForSale + " ,it is sale for $" + costOftheHouse + "\nThis house is at " + schoolDistrict + " of the school district. ";

        System.out.println(fullDetails);


    }
}

/*
Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3 */







