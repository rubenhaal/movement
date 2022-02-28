package com.seat.code.seattest;

import com.seat.code.seattest.model.Position;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovementManagementTest {

    private MovementManagement movementManagement;

    @Test
    public void ShouldReturnAValidOutputWithAValidInput(){
        movementManagement = new MovementManagement();

        Position position =movementManagement.calculateMovement("1 2 N", "LMLMLMLMM");
        assertNotNull(position);
        assertEquals(position.getXAxis(), 1);
        assertEquals(position.getYAxis(), 3);
        assertEquals(position.getOrientation().name(), "N");

        Position position2 =movementManagement.calculateMovement("3 3 E", "MMRMMRMRRM");
        assertNotNull(position2);
        assertEquals( 5, position2.getXAxis());
        assertEquals( 1, position2.getYAxis());
        assertEquals(position2.getOrientation().name(), "E");
    }
}
