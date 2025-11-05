package generics2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GenericUtils {

    // 1. Generic Sort Utility
    public static <T extends Comparable<T>> void sort(List<T> list) {
        Collections.sort(list);
    }

    // 2. Wildcard Usage
    public static void printCollection(Collection<?> collection) {
        for (Object item : collection) {
            System.out.println(item);
        }
    }

    public static double sumOfNumberList(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
