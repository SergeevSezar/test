package sergey.sergeev

import org.junit.Test
import static org.junit.Assert.assertEquals

class AppGroovyTest {

    @Test
    void testGetElements() {
        Map<Integer, Integer> testMap = [1:2, 3:1, 4:2, 5:2]
        Map<Integer, Integer> resultMap = AppGroovy.getElements(AppGroovy.list)
        assertEquals(testMap, resultMap)
    }
}
