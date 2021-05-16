package az.ac.cput.adp3Projetc2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapCollectionTest {




    Map<String, String> list = new HashMap<>();
@Test
    void addList(){
        list.put("key 1","Boomba" );
        list.put("key 2","Zaga" );
        list.put("key 3","Kusta" );

        System.out.println(list);
    }

    @Test
    void removeList(){

            list.put("key 1","Boomba" );
            list.put("key 2","Zaga" );
            list.put("key 3","Kusta" );

            list.remove("1");

            System.out.println(list);
        }

    @Test
    void testSize(){
        list.put("key 1","Boomba" );
        list.put("key 2","Zaga" );
        list.put("key 3","Kusta" );
        assertEquals(5,list.size());
    }


    @Test
    //method find
    public void findNames(){
        list.put("key 1","Boomba" );

        list.remove("Boomba");

        String index  = list.get(1);
        System.out.println(list.get(1));
    }
    }
