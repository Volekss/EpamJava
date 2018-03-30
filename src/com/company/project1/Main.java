package com.company.project1;

import com.company.project1.controller.ControllerFlower;
import com.company.project1.model.ModelFlower;
import com.company.project1.view.ViewFlower;

public class Main {

    public static void main(String[] args) {
        ControllerFlower controllerFlower = new ControllerFlower(new ViewFlower(), new ModelFlower());
        controllerFlower.execute();
    }
}
