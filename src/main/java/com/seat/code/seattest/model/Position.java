package com.seat.code.seattest.model;

import com.seat.code.seattest.enumorintation.Orientation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
public class Position {

    private Integer xAxis;
    private Integer yAxis;
    private Orientation orientation;

    public void move(){
        switch (orientation){
            case E:
                this.xAxis++;
                break;
            case N:
                this.yAxis++;
                break;
            case O:
                this.xAxis--;
                break;
            case S:
                this.yAxis--;
                break;
            default:
        }
    }

    @Override
    public String toString() {
        return this.getXAxis() + " "+ this.getYAxis() + " " + this.getOrientation();
    }
}
