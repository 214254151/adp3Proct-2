package az.ac.cput.adp3Projetc2;

import java.util.ArrayList;

public class ListCollection {


    ArrayList<String> listNames = new ArrayList<String>();

    //adding to the arrayList
    public void addNames(){

        listNames.add("Thibos ");
        listNames.add("Bhoza");
        listNames.add("King");
        listNames.add(3,"Maloya");

        System.out.println(listNames);

    }

    //removing from the arrayList
    public void removeNames(){

        listNames.remove("Bhoza");
        listNames.remove(0);
        System.out.println(listNames);


        //finding names from the arrayList
    }
    public void findNames() {

        String index  = listNames.get(0);
        System.out.println(listNames);
    }
}
