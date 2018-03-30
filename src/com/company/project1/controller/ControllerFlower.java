package com.company.project1.controller;

import com.company.project1.controller.Utils.InputUtils;
import com.company.project1.model.Enums.FlowerName;
import com.company.project1.model.ModelFlower;
import com.company.project1.view.Constants.ConstantsView;
import com.company.project1.view.ViewFlower;

public class ControllerFlower {
    private ViewFlower viewFlower;
    private ModelFlower modelFlower;


    public ControllerFlower(ViewFlower viewFlower, ModelFlower modelFlower) {
        this.viewFlower = viewFlower;
        this.modelFlower = modelFlower;
    }

    public void execute(){
        analyzeCommand(InputUtils.inputValueToCreateBouquet(viewFlower));
    }

    private void analyzeCommand(int command){
        switch (command){
            case 1:
                modelFlower.createFlowerBouquet(FlowerName.ROSE);
                break;
            case 2:
                modelFlower.createFlowerBouquet(FlowerName.VIOLET);
                break;
            case 3:
                modelFlower.createFlowerBouquet(FlowerName.VIOLET);
                break;
        }
        analyzeSecondCommand(InputUtils.inputValueToOperateBouquet(viewFlower));
    }

    private void analyzeSecondCommand(int command){
        switch (command){
            case 1:
                modelFlower.showAllFlowers();
                break;
            case 2:
                modelFlower.countBouquetPrice();
                break;
            case 3:
                executeThirdCommand();
                break;
            case 4:
                modelFlower.sortByFreshness();
                break;
        }
    }

    private void executeThirdCommand(){
        analyzeThirdCommand(InputUtils.inputValueToGetRange(viewFlower));
    }

    private void analyzeThirdCommand(String range){
        String[] params = range.split("-");
        int startRange = Integer.parseInt(params[0]);
        int endRange = Integer.parseInt(params[1]);
        if ((startRange > endRange) || startRange < 0 || endRange < 0) {
            viewFlower.printMessage(ConstantsView.ERR_ARGUMENT);
            return;
        }
        modelFlower.findFlowerInRange(startRange, endRange);
    }
}
