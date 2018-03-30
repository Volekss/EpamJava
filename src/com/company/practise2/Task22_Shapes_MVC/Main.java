package com.company.practise2.Task22_Shapes_MVC;

import com.company.practise2.Task22_Shapes_MVC.Controller.ControllerShape;
import com.company.practise2.Task22_Shapes_MVC.Model.ModelShape;
import com.company.practise2.Task22_Shapes_MVC.View.ViewShape;

public class Main {

    public static void main(String[] args) {
        ControllerShape controller = new ControllerShape(new ModelShape(), new ViewShape());
        controller.execute();
    }
}
