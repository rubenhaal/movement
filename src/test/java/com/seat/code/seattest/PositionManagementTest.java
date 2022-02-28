package com.seat.code.seattest;


import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;


public class PositionManagementTest {

    private PositionManagement positionManagement;

    @Test
    public void WhenCreatePointShouldReturnAValidPoint(){
         positionManagement = new PositionManagement();
        assertNotNull(positionManagement.createStartingPoint(1, 1, "N"));
    }

    @Test
    public void WhenCreatePointShouldFromStringReturnAValidPoint(){
        positionManagement = new PositionManagement();
        assertNotNull(positionManagement.parseInputString("1 2 N"));
    }

    @Test
    public void WhenCreatePointShouldFromInvalidStringShouldReturnAException(){
        positionManagement = new PositionManagement();
        Exception exception = assertThrows(InvalidParameterException.class, () -> {
            positionManagement.parseInputString("55");
        });

        String expectedMessage = "Invalid Input";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test()
    public void WhenCreatePointNegativeAxisShouldReturnException(){
        positionManagement = new PositionManagement();
        Exception exception = assertThrows(InvalidParameterException.class, () -> {
            positionManagement.createStartingPoint(-1, -2, "S");
        });

        String expectedMessage = "Invalid Input";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


    @Test()
    public void WhenCreatePointInvalidOrientationShouldReturnException(){
        positionManagement = new PositionManagement();
        Exception exception = assertThrows(InvalidParameterException.class, () -> {
            positionManagement.createStartingPoint(1, 1, "Z");
        });

        String expectedMessage = "Invalid Input";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


}
