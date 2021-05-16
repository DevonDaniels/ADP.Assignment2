/*
Devon Daniels
217299822
ADP372S Assignment 2
 */
package za.ac.cput;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    @Test
    public void CollectionAdd() {
        CollectionClass colAdd = new CollectionClass();
        String result = colAdd.add("");

        assertEquals("[Mazda, Toyota, Ford, Opel, BMW]", result);
    }

    @Test
    public void CollectionRemove() {
        CollectionClass colRemove = new CollectionClass();
        String result = colRemove.remove("");

        assertEquals("[Tulips, Daisies, SunFlower]", result);

    }

    @Test
    public void CollectionFind() {
        CollectionClass colFind = new CollectionClass();
        String result = colFind.find("");

        assertEquals("true", result);


    }
    @Test
    public void MapAdd(){
        MapClass  mapAdd = new MapClass();
        String result = mapAdd.add("");

        assertEquals("{1=Cat, 2=Dog, 3=Parrot, 4=Chicken, 5=Mouse}", result);

    }
    @Test
    public void MapRemove(){
        MapClass mapRemove = new MapClass();
        String result = mapRemove.remove("");

        assertEquals("{1=Poodle, 3=Pitbull, 4=German sheperd}",result );

    }
    @Test
    public void MapFind(){
        MapClass mapFind = new MapClass();
        String result = mapFind.find("");

        assertEquals(true, result);
    }
    @Test
    public void ListAdd(){
        ListClass listAdd = new ListClass();
        String result = listAdd.add("");

        assertEquals("[Chair, Table, Couch, Cabinet, Stool]", result);
    }
    @Test
    public void ListRemove(){
        ListClass listRemove = new ListClass();
        String result = listRemove.remove("");

        assertEquals("[McDonalds, Steers, Burger King, Ocean Basket, Roccomamas]",result);
    }
    @Test
    public void ListFind(){
        ListClass listFind = new ListClass();
        String result = listFind.find("");

        assertEquals("true", result);

    }

    @Test
    public void SetAdd(){
        SetClass setAdd = new SetClass();
        String result = setAdd.add("");

        assertEquals("[Womens Day, Workers Day, Valentines, Youth Day]", result);

    }
    @Test
    public void SetRemove(){
        SetClass setRemove = new SetClass();
        String result = setRemove.remove("");

        assertEquals("[June, December, September, March, July, January, Febuary, August]", result);
    }
    @Test
    public void SetFind(){
        SetClass setFind = new SetClass();
        String result = setFind.Find("");

        assertEquals("true", result);

    }
}