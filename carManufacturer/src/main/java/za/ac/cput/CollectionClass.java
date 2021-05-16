/*
Devon Daniels
217299822
ADP372S Assignment 2
 */
package za.ac.cput;

import java.util.ArrayList;

public class CollectionClass {
    //1.Add
    public String add(String carManufacturer) {

        ArrayList<String> colAdd = new ArrayList<String>();
        colAdd.add("Mazda");
        colAdd.add("Toyota");
        colAdd.add("Ford");
        colAdd.add("Opel");
        colAdd.add("BMW");

        return colAdd.toString();

    }
    //2.Remove
    public String remove(String Flowers) {

        ArrayList<String> colRemove = new ArrayList<String>();
        colRemove.add("Tulips");
        colRemove.add("Roses");
        colRemove.add("Daisies");
        colRemove.add("SunFlower");
        colRemove.remove("Roses");

        return colRemove.toString();
    }
    //3.Find
    public String find(String Places){

        ArrayList<String> colFind = new ArrayList<String>();

        colFind.add("Fish Hoek");
        colFind.add("Simons Town");
        colFind.add("Muizenberg");
        colFind.add("Kommetjie");

        return String.valueOf(colFind.contains("Kommetjie"));


    }



}
