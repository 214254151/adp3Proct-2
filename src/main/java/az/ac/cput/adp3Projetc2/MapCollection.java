package az.ac.cput.adp3Projetc2;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

    Map<String, String> list = new HashMap<>();

    void addList(){
        list.put("key 1","Boomba" );
        list.put("key 2","Zaga" );
        list.put("key 3","Kusta" );

        System.out.println(list);
    }


}
