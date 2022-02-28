package com.seat.code.seattest;

import com.seat.code.seattest.enumorintation.Orientation;
import com.seat.code.seattest.model.Position;

import java.security.InvalidParameterException;
import java.util.List;

public class PositionManagement {

    public static final String INVALID_INPUT = "Invalid Input";
    public static final String INVALID_MOVEMENT = "Invalid movement";
    private static List<String> orientations = List.of("N","O","S","E");

    public static Position createStartingPoint(int x, int y, String orientation){
        if(x<0 || y <0 || !orientations.contains(orientation)) {
            throw new InvalidParameterException(INVALID_INPUT);
        }
        return new Position(x, y, Orientation.valueOf(orientation));
    }

    public static void checkPosition(Position position){
        if(position.getXAxis()<0 || position.getYAxis() <0 || !orientations.contains(position.getOrientation().name())) {
            throw new InvalidParameterException(INVALID_MOVEMENT);
        }
    }

    public static Position parseInputString(String position){
        String [] strPosition = position.split(" ");
        if(strPosition.length!=3){
            throw new InvalidParameterException(INVALID_INPUT);
        }

        return createStartingPoint(checkNumericInput(strPosition[0]), checkNumericInput(strPosition[1]), strPosition[2]);
    }

    private static Integer checkNumericInput(String num){
        try {
            return Integer.parseInt(num);
        }catch (NumberFormatException nfe){
            throw new InvalidParameterException(INVALID_INPUT);
        }
    }
}
