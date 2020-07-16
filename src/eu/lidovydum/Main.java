package eu.lidovydum;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(4);
        integerList.add(9);
        System.out.println("sum of integers : "+ListUtils.sumOfList(integerList));
        ListUtils.printList(ListUtils.addAll(integerList, new Integer[]{3,3}));*/
        int[] nejakePole = new int[]{4, 2, 8, 5};
        int totoChcuVlozit = 3;
        int[] totoMiMetodaVratila = ListUtils.insertAsFirst(nejakePole, totoChcuVlozit);
        for (int i : totoMiMetodaVratila) System.out.print(i + " ");
    }
}
