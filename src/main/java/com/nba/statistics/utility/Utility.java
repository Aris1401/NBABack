package com.nba.statistics.utility;

import java.util.ArrayList;
import java.util.Collection;

public class Utility {
    public static <T> Collection<T> iterableToCollection(Iterable<T> iterable) {
        Collection<T> collection = new ArrayList<>();
        iterable.forEach(collection::add);
        return collection;
    }
}
