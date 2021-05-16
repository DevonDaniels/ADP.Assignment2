/*
Devon Daniels
217299822
ADP372S Assignment 2
 */
package za.ac.cput;
import java.util.HashSet;
import java.util.Set;

public class SetClass {
    //1.Add
    public String add(String holidays) {
        Set<String> setAdd = new HashSet<>();

        setAdd.add("Youth Day");
        setAdd.add("Workers Day");
        setAdd.add("Womens Day");
        setAdd.add("Valentines");

        return setAdd.toString();
    }
    //2.Remove
    public String remove(String months) {

        Set<String> setRemove = new HashSet<>();

        setRemove.add("January");
        setRemove.add("Febuary");
        setRemove.add("March");
        setRemove.add("April");
        setRemove.add("May");
        setRemove.add("June");
        setRemove.add("July");
        setRemove.add("August");
        setRemove.add("September");
        setRemove.add("October");
        setRemove.add("November");
        setRemove.add("December");
        setRemove.remove("May");
        setRemove.remove("October");
        setRemove.remove("April");
        setRemove.remove("November");

        return setRemove.toString();
    }
    //3.Find
    public String Find(String fish) {

        Set<String> setFind = new HashSet<>();

        setFind.add("Mullets");
        setFind.add("Snoek");
        setFind.add("Haddock");
        setFind.add("Yellow tail");

        return String.valueOf(setFind.contains("Haddock"));

    }


}






