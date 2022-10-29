package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    MainApplication generic = new MainApplication();
    @Test
    void getSine() {
        double degrees = generic.getSine(90);
        assertEquals(1.0, degrees);
    }

    @Test
    void getCosine() {
        double degrees = generic.getCosine(180);
        assertEquals(-1.0, degrees);
    }

    @Test
    void getTangent() {
        double degrees = generic.getTangent(30);
        assertEquals(0.57735027, degrees);
    }

    @Test
    void getAsine() {
        double degrees = generic.getAsine(30);
        assertEquals(0.55106958, degrees);
    }
}
