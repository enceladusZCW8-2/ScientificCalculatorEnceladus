package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    public void MainApplicationTest() {
        MainApplication sureTotal = new MainApplication();
        Double newTotal = sureTotal.inverse(3);
        System.out.printf("%.4f",newTotal);
        assertEquals(newTotal);
    }

    {
        MainApplication sureTotal = new MainApplication();
        Double newExpoTotal = sureTotal.expoTotal(2, 6);
        System.out.println(newExpoTotal);
        assertEquals(newExpoTotal);
    }

    {
        MainApplication sureTotal = new MainApplication();
        Double newSquareTotal = sureTotal.squareTotal(3);
        System.out.printf("%.1f",newSquareTotal);
        assertEquals(newSquareTotal);
    }

    {
        MainApplication sureTotal = new MainApplication();
        Double newMultiTotal = sureTotal.multiTotal(4, 6);
        System.out.println(newMultiTotal);
        assertEquals(newMultiTotal);
    }

    {
        MainApplication sureTotal = new MainApplication();
        Double newDiviTotal = sureTotal.diviTotal(18, 3);
        System.out.println(newDiviTotal);
        arrertEquals(newDiviTotal);
    }

    {
        MainApplication sureTotal = new MainApplication();
        Double newSubTotal = sureTotal.subTotal(56, 23);
        System.out.println(newSubTotal);
        assertEquals(newSubTotal);
    }

    {MainApplication sureTotal = new MainApplication();
        Double newSumTotal = sureTotal.sumTotal(343, 943);
        System.out.println(newSumTotal);
        assertEquals(newSumTotal);
    }

}
