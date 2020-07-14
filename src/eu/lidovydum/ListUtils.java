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
}
