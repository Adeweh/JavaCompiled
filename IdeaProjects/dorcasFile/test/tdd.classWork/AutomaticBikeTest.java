package tdd.classWork;

import classWork.AutomaticBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomaticBikeTest {
    @Test
    public void AutomaticBikeOnTest() {
        AutomaticBike honda = new AutomaticBike();

        boolean deeBike = honda.getOnValue();
        honda.setWork(true);

        assertEquals(true, honda.getOnValue());

    }

    @Test
    public void AutomaticBikeOffTest() {
        AutomaticBike honda = new AutomaticBike();

        boolean deeBike = honda.getOnValue();
        honda.setWork(true);
        honda.setWork(false);

        assertEquals(false, honda.getOnValue());

    }

    @Test
    public void AutomaticBikeOnAccelerationTest() {
        AutomaticBike honda = new AutomaticBike();
        honda.setWork(true);
        honda.setAcceleration(true);


        assertEquals(true, honda.getOnAcceleration());

    }

    @Test
    public void AutomaticBikeOnGear1() {
        AutomaticBike honda = new AutomaticBike();
        honda.setWork(true);

        honda.setAcceleration(true);
        honda.setSpeed(15);

        assertEquals(16, honda.getSpeed());
    }

    @Test
    public void AutomaticBikeOnGear2() {
        AutomaticBike honda = new AutomaticBike();
        honda.setWork(true);

        honda.setAcceleration(true);
        honda.setSpeed(24);

        assertEquals(26, honda.getSpeed());
    }

    @Test
    public void AutomaticBikeOnGear3() {
        AutomaticBike honda = new AutomaticBike();
        honda.setWork(true);
        honda.setAcceleration(true);

        honda.setSpeed(35);

        assertEquals(38, honda.getSpeed());
    }

    @Test
    public void AutomaticBikeOnGear4() {
        AutomaticBike honda = new AutomaticBike();
        honda.setWork(true);
        honda.setAcceleration(true);

        honda.setSpeed(44);

        assertEquals(48, honda.getSpeed());
    }

    @Test
    public void AutomaticBikeOnDecelerationTest() {
        AutomaticBike honda = new AutomaticBike();
        honda.setWork(true);
        honda.setAcceleration(false);
        honda.setDeceleration(true);


        assertEquals(true, honda.getDeceleration());

    }

    @Test
    public void AutomaticBikeOffGear1() {
        AutomaticBike honda = new AutomaticBike();
        honda.setWork(true);

        honda.setAcceleration(false);
        honda.setDeceleration(true);

        honda.setSpeed(15);

        assertEquals(14, honda.getSpeed());
    }
    @Test
    public void AutomaticBikeOffGear2() {
        AutomaticBike honda = new AutomaticBike();
        honda.setWork(true);

        honda.setAcceleration(false);
        honda.setDeceleration(true);

        honda.setSpeed(24);

        assertEquals(22, honda.getSpeed());
    }
    @Test
    public void AutomaticBikeOffGear3() {
        AutomaticBike honda = new AutomaticBike();
        honda.setWork(true);

        honda.setAcceleration(false);
        honda.setDeceleration(true);

        honda.setSpeed(35);

        assertEquals(32, honda.getSpeed());
        }
        @Test
    public void AutomaticBikeOffGear4() {
        AutomaticBike honda = new AutomaticBike();
        honda.setWork(true);

        honda.setAcceleration(false);
        honda.setDeceleration(true);

        honda.setSpeed(44);

        assertEquals(40, honda.getSpeed());
    }
}



