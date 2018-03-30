package com.company.practise2.Task21.Utils;

import com.company.practise2.Task21.Model.Entity.Patient;

import java.util.Comparator;

public class ComparatorFirstName implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String name1 = ((Patient)o1).getFirstName();
        String name2 = ((Patient)o2).getFirstName();
        return name1.compareTo(name2);
    }
}
