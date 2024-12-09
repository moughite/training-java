import org.example.ExCollections;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class ExCollectionsTest {

    ExCollections exCollections=new ExCollections();

    @Test
    public void testNbImpaire(){
        Set<Integer> result = exCollections.nbImpaire();
        HashSet<Integer> expected = new HashSet<>(Arrays.asList(1, 3, 5, 7));
        assertEquals(result,expected);
        assertEquals(4,result.size());
    }

    @Test
    public void testConvertList(){
        Map<String, Integer> result = exCollections.convertList();
        Map<String,Integer> expected=new HashMap<>();

        expected.put("JawaD",5);
        expected.put("MoughitE",8);
        expected.put("MalikA",6);
        expected.put("SanaE",5);


        assertEquals(result,expected);
        assertEquals(4,result.size());

    }


}
