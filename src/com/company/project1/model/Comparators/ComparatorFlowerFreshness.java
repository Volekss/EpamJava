package com.company.project1.model.Comparators;

import com.company.project1.model.entity.Flower;

import java.util.Comparator;

public class ComparatorFlowerFreshness implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int freshness1 = ((Flower)o1).getFreshnessLvl();
        int freshness2 = ((Flower)o2).getFreshnessLvl();

        return freshness1 - freshness2;

    }
}
