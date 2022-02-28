package com.seat.code.seattest.enumorintation;

public enum Orientation {
    N(0),
    E(1),
    S(2),
    O(3);
    private final int code;

    Orientation(int code){
        this.code = code;
    }

    public Orientation toRight(){
        if(this.code==3){
            return N;
        }else{
            return Orientation.values()[this.code +1];
        }

    }

    public Orientation toLeft(){
        if(this.code==0){
            return O;
        }else{
            return Orientation.values()[this.code -1];
        }

    }
}
