package com.company.project1.model.entity;

import com.company.project1.model.Enums.FlowerName;

import java.util.Objects;

public class Flower {
    private FlowerName flowerName;
    private int price;
    private int length;
    private int freshnessLvl;

    public Flower(FlowerName flowerName, int price, int length, int freshnessLvl) {
        this.flowerName = flowerName;
        this.price = price;
        this.length = length;
        this.freshnessLvl = freshnessLvl;
    }

    public int getPrice() {
        return price;
    }

    public int getLength() {
        return length;
    }

    public int getFreshnessLvl() {
        return freshnessLvl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;
        Flower flower = (Flower) o;
        return getPrice() == flower.getPrice() &&
                getLength() == flower.getLength() &&
                getFreshnessLvl() == flower.getFreshnessLvl();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getPrice(), getLength(), getFreshnessLvl());
    }

    @Override
    public String toString() {
        return "Flower{" +
                "price=" + price +
                ", length=" + length +
                ", freshnessLvl=" + freshnessLvl +
                '}';
    }
}
