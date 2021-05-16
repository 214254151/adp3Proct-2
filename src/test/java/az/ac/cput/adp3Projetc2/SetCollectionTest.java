package az.ac.cput.adp3Projetc2;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetCollectionTest {

    Set<String> hash_Set = new HashSet<String>();

    @Test
    public void addNamesToSet(){
        hash_Set.add("Thibos ");
        hash_Set.add("Bhoza");
        hash_Set.add("King");
        System.out.println(hash_Set);

    }

@Test
     void removeNames(){
    hash_Set.add("Thibos ");
    hash_Set.add("Bhoza");
    hash_Set.add("King");
    hash_Set.remove("King");

        System.out.println(hash_Set);
    }

@Test
    void findNames() {
    hash_Set.add("Thibos ");
    hash_Set.add("Bhoza");
    hash_Set.add("King");
    hash_Set.remove("Thibos");
        System.out.println(hash_Set);
    }
}