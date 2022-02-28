package com.seat.code.seattest.print;

public class StandarPrint implements IPrint{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
