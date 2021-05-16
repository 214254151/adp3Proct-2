package az.ac.cput.adp3Projetc2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class ListCollectionTest {
    ListCollection test1 = new ListCollection();

    ArrayList<String> listNames = new ArrayList<>();

    //
    @Test
    void testSize(){
        listNames.add("Thibos ");
        listNames.add("Bhoza");
        assertEquals(3,listNames.size());
    }

    @Test
    //method remove
    public void removeNames(){
        listNames.add("Thibos ");
        listNames.add("Bhoza");
        listNames.add("King");
        listNames.remove(0);
        System.out.println(listNames);
    }

    @Test
    //method find
    public void findNames(){
        listNames.add("Thibos ");
        listNames.add("Bhoza");
        listNames.add("King");
        String index  = listNames.get(1);
        System.out.println(listNames.get(1));
    }

}
