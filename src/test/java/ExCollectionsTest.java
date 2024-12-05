import org.example.ExCollections;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class ExCollectionsTest {

    ExCollections exCollections=new ExCollections();

    @Test
    public void testNbImpaire(){
        Set<Integer> result = exCollections.nbImpaire();
        HashSet<Integer> expected = new HashSet<>(Arrays.asList(67, 5));
        assertEquals(result,expected);
        assertEquals(2,result.size());
    }

    @Test
    public void testConvertList(){
        Map<String, Integer> result = exCollections.convertList();
        Map<String,Integer> expected=new HashMap<>();
        expected.put("Mohamed",7);
        expected.put("Jawad",5);
        expected.put("Moughite",8);
        expected.put("Sanae",5);

        assertEquals(result,expected);
        assertEquals(4,result.size());

    }


}
