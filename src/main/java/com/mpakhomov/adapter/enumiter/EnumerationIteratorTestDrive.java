package com.mpakhomov.adapter.enumiter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: mike
 * Date: 4/27/13
 * Time: 6:30 PM
 */
public class EnumerationIteratorTestDrive {
    public static void main (String args[]) {
        Vector v = new Vector(Arrays.asList(1, 2, 3, 4, 5, 6));
        Iterator iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Object o : v) {

        }
    }
}
