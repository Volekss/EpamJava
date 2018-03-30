package com.company.practise2.Task21.Utils;

import com.company.practise2.Task21.Model.Entity.Patient;

import java.util.Comparator;

public class ComparatorCardID implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int cardID1 = ((Patient) o1).getCardID();
        int cardID2 = ((Patient) o2).getCardID();
        return cardID2 - cardID1;
    }
}
