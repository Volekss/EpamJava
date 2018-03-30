package com.company.project1.view;

import com.company.project1.model.entity.Flower;
import com.company.project1.view.Constants.ConstantsView;

public class ViewFlower {
    public void printMessage(String message){
        System.out.println(message);
    }

    public void showFlower(Flower flower){
        System.out.println(flower.toString());
    }

    public void printStartPoint() {
        System.out.println(ConstantsView.START_POINT);
        printAllCommands();
    }

    private void printAllCommands(){
        System.out.println(ConstantsView.COMMAND_1);
        System.out.println(ConstantsView.COMMAND_2);
        System.out.println(ConstantsView.COMMAND_3);
    }

    public void printCommandsForBouquet(){
        System.out.println(ConstantsView.START_POINT);
        System.out.println(ConstantsView.COMMAND_2_1);
        System.out.println(ConstantsView.COMMAND_2_2);
        System.out.println(ConstantsView.COMMAND_2_3);
        System.out.println(ConstantsView.COMMAND_2_4);
    }

    public void printCommandToGetRangeOfFreshness(){
        System.out.println(ConstantsView.COMMAND_2_3_1);
    }

    public void printFlowerArr(Flower[] flowers){


        for (Flower flower : flowers) {
            if (flower != null)
                showFlower(flower);
        }
    }
}
