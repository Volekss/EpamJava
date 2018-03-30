package com.company.project1.controller.Utils;

import com.company.project1.view.Constants.ConstantsView;
import com.company.project1.view.ViewFlower;

import java.util.Scanner;

public class InputUtils {
    private static Scanner scanner = new Scanner(System.in);


    public static int inputValueToCreateBouquet(ViewFlower view){
        view.printStartPoint();
        while (!scanner.hasNextInt()){
            view.printMessage(ConstantsView.ERR_COMMAND);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static int inputValueToOperateBouquet(ViewFlower view){
        view.printCommandsForBouquet();
        while (!scanner.hasNextInt()){
            view.printMessage(ConstantsView.ERR_COMMAND);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String inputValueToGetRange(ViewFlower view){
        view.printCommandToGetRangeOfFreshness();
        while (!scanner.hasNext()){
            view.printMessage(ConstantsView.ERR_ARGUMENT);
            scanner.nextLine();
        }
        return scanner.next();
    }
}
