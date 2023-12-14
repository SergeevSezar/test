package sergey.sergeev;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AppJavaTest {

    @Test
    public void testGetMapCountingStream() {
        Map<Integer, Integer> testMap = new HashMap<>();
        testMap.put(1, 2);
        testMap.put(3, 1);
        testMap.put(4, 2);
        testMap.put(5, 2);
        Map<Integer, Integer> resultMap = AppJava.getMapCountingStream(AppJava.data);
        assertEquals(testMap, resultMap);
    }
}
