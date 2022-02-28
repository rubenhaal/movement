package com.seat.code.seattest;

import com.seat.code.seattest.model.Position;
import org.springframework.beans.factory.annotation.Autowired;

import static com.seat.code.seattest.PositionManagement.checkPosition;

public class MovementManagement {


    public Position calculateMovement(String initialPosition, String movements){

        Position position = PositionManagement.parseInputString(initialPosition);

        for (char c : movements.toCharArray()){
            switch (c){
                case 'L':
                    position.setOrientation(position.getOrientation().toLeft());
                    break;
                case 'R':
                    position.setOrientation(position.getOrientation().toRight());
                    break;
                case'M':
                    position.move();
                    break;
                default:
                    //exception
            }
            checkPosition(position);
        }

        return position;
    }

}
