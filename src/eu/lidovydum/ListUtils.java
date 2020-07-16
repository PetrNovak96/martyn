package eu.lidovydum;

import java.util.Arrays;
import java.util.List;

public class ListUtils {

    //4. sumOfList(List<? extends Number> l) tak toto je hard
    //5. printList(...)
    //6. addAll(List l, [] arr) – vloží všetky elementy arr do l

    public static Double sumOfList(List<? extends Number> list) {
        return list.stream().mapToDouble(Number::doubleValue).sum();
        /** bez streamu by to mohlo vypadat nejak takto
         double sum = 0.0;
         for (Number item : list) {
         sum += item.doubleValue();
         }
         return sum;
         */
    }

    public static void printList(List list) {
        list.forEach(System.out::println);
        /** bez frajeřinek by to mohlo vypadat takto
         for (Object item : list) {
         System.out.println(item);
         }
         */
    }

    public static <T>List addAll(List list, T[] arr) {
        list.addAll(Arrays.asList(arr));
        return list;

        /** bez frajeřinek by to mohlo vypadat takto
        for (T item : arr) {
            list.add(item);
        }
        return list;
        */
    }

    public static int[] insertAsFirst(int[] a, int element) {
        int[] result = new int[a.length + 1];
        result[0] = element;
        for (int i = 1; i < result.length; i++) {
            result[i] = a[i - 1];
        }
        return result;
    }

    public static int[] insertAtIndex(int[] a, int element, int index) {
        int[] result = new int[a.length + 1];
        for (int i = 0; i < result.length; i++) {
            if (i < index) result[i] = a[i];            // pokud je i mensi nez index, vloz a[i]
            else if (i == index) result[i] = element;   // pokud je i = indexu, vloz element
            else result[i] = a[i - 1];                  // pokud je vetsi nez index, vloz a[i-1]
        }
        return result;
    }
}
