package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    MainApplication sureTotal = new MainApplication();

    @Test
    void TestInverse() {
        String newTotal = Double.toString(sureTotal.inverse(2));
        assertEquals("0.5", newTotal);
    }

    @Test
    public void TestExpo () {
        String newExpoTotal = Double.toString(sureTotal.expoTotal(2, 6));
        assertEquals("64.0", newExpoTotal);
    }

    @Test
    public void TestSquare () {
        String newSquareTotal = Double.toString(sureTotal.squareTotal(3));
        assertEquals("9.0", newSquareTotal);
    }
    @Test
    public void TestSquareRt () {
        String newSquareTotal = Double.toString(sureTotal.sqrtTotal(9));
        assertEquals("3.0", newSquareTotal);
    }

    @Test
    public void TestMulti () {
        String newMultiTotal = Double.toString(sureTotal.multiTotal(4, 6));
        assertEquals("24.0", newMultiTotal);
    }

    @Test
    public void TestDivi () {
        String newDiviTotal = Double.toString(sureTotal.diviTotal(18, 3));
        assertEquals("6.0", newDiviTotal);
    }

    @Test
    public void TestSub () {
        String newSubTotal = Double.toString(sureTotal.subTotal(56, 23));
        assertEquals("33.0", newSubTotal);
    }

    @Test
    public void TestSum () {
        String newSumTotal = Double.toString(sureTotal.sumTotal(343, 943));
        assertEquals("1286.0", newSumTotal);
    }
    //collin advanced math Tests
    MainApplication generic = new MainApplication();
    @Test
    public void getSine() {
        double degrees = generic.getSine(90);
        assertEquals(1.0, degrees);
    }

    @Test
    void TestGetCosine() {
        double degrees = generic.getCosine(180);
        assertEquals(-1.0, degrees);
    }

    @Test
    void TestGetTangent() {
        double degrees = generic.getTangent(30);
        assertEquals(0.57735027, degrees);
    }

    @Test
    void TestGetAsine() {
        double degrees = generic.getAsine(30);
        assertEquals(0.55106958, degrees);
    }

    @Test
    void TestGetAcosine() {
        double degrees = generic.getAcosine(30);
        assertEquals(1.01972674, degrees);
    }

    @Test
    void TestGetAtangent() {
        double degrees = generic.getAtangent(60);
        assertEquals(0.80844879, degrees);
    }

    @Test
    void TestGetLog() {
        double x = generic.getLog(10);
        assertEquals(1.0, x);
    }

    @Test
    void TestGetInverseLog() {
        double x = generic.getInverseLog(2);
        assertEquals(100.0, x);
    }

    @Test
    void TestGetNaturalLog() {
        double x = generic.getNaturalLog(5);
        assertEquals(1.60943791, x);
    }

    @Test
    void TestGetInverseNaturalLog() {
        double x = generic.getInverseNaturalLog(5);
        assertEquals(148.41315910, x);
    }

    @Test
    void TestGetBillTotalWithTip() {
        double total = generic.getBillTotalWithTip(20.0, 0.18);
        assertEquals(23.6, total);
    }
}
