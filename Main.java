package sergeev.sergey;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

private static int[] data1 = {1, 3, 4, 5, 1, 5, 4};
private static int[] data2 = {-1, 3, -4, 5, 1, 5, 4};

    public static void main(String[] args) {
        System.out.println(getMapCountingStream(data2));
    }

    private static Map<Integer, Long> getMapCountingStream(int[] arr) {
        Integer[] newData = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newData[i] = arr[i];
        }
        List<Integer> integers = Arrays.asList(newData);
        return integers.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    }
}