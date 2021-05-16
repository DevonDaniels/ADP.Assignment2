/*
Devon Daniels
217299822
ADP372S Assignment 2
 */
package za.ac.cput;

import java.util.*;

public class ListClass {
    //1.Add
    public String add(String Furniture) {

        LinkedList<String> listAdd = new LinkedList();

        listAdd.add("Chair");
        listAdd.add("Table");
        listAdd.add("Couch");
        listAdd.add("Cabinet");
        listAdd.add("Stool");

        return listAdd.toString();

    }
    //2.Remove
    public String remove(String Restaurants) {

        LinkedList<String> listRemove = new LinkedList<>();

        listRemove.add("McDonalds");
        listRemove.add("KFC");
        listRemove.add("Steers");
        listRemove.add("Spur");
        listRemove.add("Burger King");
        listRemove.add("Ocean Basket");
        listRemove.add("Roccomamas");
        listRemove.remove("KFC");
        listRemove.remove("Spur");

        return listRemove.toString();
    }
    //3.Find
    public String find(String EPLteams){

        LinkedList<String> listFind = new LinkedList<>();

        listFind.add("Chelsea");
        listFind.add("West Ham");
        listFind.add("Liverpool");
        listFind.add("Crystal Palace");
        listFind.add("Arsenal");
        listFind.add("Tottenham");

        return String.valueOf(listFind.contains("Liverpool"));
}




    }
