package org.creft.data.algorithm.search;

import java.util.Iterator;
import java.util.List;

public class Subsequence {

    public static <T extends Comparable<T>> Boolean containsSubSequence(List<T> parentCollection, List<T> subSequence){

        if (subSequence.isEmpty()) return true;
        if (parentCollection.isEmpty() || subSequence.size() > parentCollection.size()) return false;

        Iterator<T> mainIterator = parentCollection.iterator();
        Iterator<T> subIterator = subSequence.iterator();

        T subElement = subIterator.next();
        while (mainIterator.hasNext()) {
            if (mainIterator.next().equals(subElement)) {
                if (!subIterator.hasNext()) return true;
                subElement = subIterator.next();
            }
        }

        return false;
    }
}
