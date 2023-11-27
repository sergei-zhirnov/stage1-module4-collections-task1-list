package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int preresult;
        int result;
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);

        preresult = Integer.compare(5 * intA * intA + 3, 5 * intB * intB + 3);
        result = (preresult == 0) ? Integer.compare(intA, intB) : preresult;
        return result;
    }
}
