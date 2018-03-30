package com.company.project1.model;

import com.company.project1.model.Comparators.ComparatorFlowerFreshness;
import com.company.project1.model.Enums.FlowerName;
import com.company.project1.model.entity.Flower;
import com.company.project1.view.Constants.ConstantsView;
import com.company.project1.view.ViewFlower;

import java.util.Arrays;

public class ModelFlower {
    private ViewFlower view = new ViewFlower();
    private Flower[] bouquet;

    public ModelFlower() {
        bouquet = new Flower[5];

    }

    public int countBouquetPrice() {
        int price = 0;
        for (Flower flower : bouquet) {
            price += flower.getPrice();
        }
        view.printMessage("The price of the bouquet is :" + price);
        return price;
    }

    public void createFlowerBouquet(FlowerName flowerName) {
        switch (flowerName) {
            case ROSE:
                for (int i = 0; i < bouquet.length; i++) {
                    bouquet[i] = new Flower(FlowerName.ROSE, 5, (int) (Math.random() * 5 + 6), (int) (Math.random() * 3 + 7));
                }
                break;


            case TULIP:
                for (int i = 0; i < bouquet.length; i++) {
                    bouquet[i] = new Flower(FlowerName.ROSE, 4, (int) (Math.random() * 5 + 4), (int) (Math.random() * 3 + 7));
                }
                break;


            case VIOLET:
                for (int i = 0; i < bouquet.length; i++) {
                    bouquet[i] = new Flower(FlowerName.VIOLET, 3, (int) (Math.random() * 5 + 5), (int) (Math.random() * 3 + 7));
                }
                break;
        }
    }

    public Flower[] findFlowerInRange(int low, int high){
        Flower[] returnFlowers = new Flower[bouquet.length];
        int flowersFoundNumber = 0;

        if (high < low){
            view.printMessage(ConstantsView.ERR_ARGUMENT);
            return null;
        }

        for (Flower aBouquet : bouquet) {
            if (aBouquet.getLength() >= low && aBouquet.getLength() <= high) {
                returnFlowers[flowersFoundNumber] = aBouquet;
                flowersFoundNumber++;
            }

        }
        if (flowersFoundNumber == 0){
            view.printMessage(ConstantsView.ERR_ARGUMENT);
            return null;
        }
        view.printFlowerArr(returnFlowers);
        return returnFlowers;
    }

    public void showAllFlowers() {
        for (Flower f : bouquet)
            view.showFlower(f);
    }

    public void sortByFreshness() {
        Arrays.sort(bouquet, new ComparatorFlowerFreshness());
        showAllFlowers();
    }


}
