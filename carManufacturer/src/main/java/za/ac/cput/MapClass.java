/*
Devon Daniels
217299822
ADP372S Assignment 2
 */
package za.ac.cput;

import java.util.HashMap;
import java.util.Map;


    public class MapClass {
        //1.Add
        public String add (String Animals){

        Map<Integer,String> mapAdd = new HashMap<Integer,String >();

        mapAdd.put(1,"Cat" );
        mapAdd.put(2,"Dog" );
        mapAdd.put(3, "Parrot");
        mapAdd.put(4, "Chicken");
        mapAdd.put(5, "Mouse");

        return mapAdd.toString();
        
        }
        //2.Remove
        public String remove (String dogs) {

            Map<Integer, String> mapRemove = new HashMap<Integer, String>();

            mapRemove.put(1, "Poodle");
            mapRemove.put(2, "Doberman");
            mapRemove.put(3, "Pitbull");
            mapRemove.put(4, "German sheperd");
            mapRemove.remove(2);

            return mapRemove.toString();

        }
        //3.Find
        public String find (String brands){

            Map<Integer, String> mapFind = new HashMap<>();

            mapFind.put(1, "Nike");
            mapFind.put(2, "New balance");
            mapFind.put(3, "Addidas");
            mapFind.put(4, "Vans");
            mapFind.put(5, "Timberland");

            return String.valueOf(mapFind.containsValue("Addidas"));

        }



    }


