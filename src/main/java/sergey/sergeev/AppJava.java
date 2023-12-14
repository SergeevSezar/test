package sergey.sergeev;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppJava {
    public static int[] data = {1, 3, 4, 5, 1, 5, 4};

    public static void main( String[] args ) {
        System.out.println(getMapCountingStream(data));
    }

    public static Map<Integer, Integer> getMapCountingStream(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int element : arr) {
            map.put(element, map.getOrDefault(element, 0) +1);
        }
        return map;
    }
}
