package dorcas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test
    public void AirConditionerOnTest() {
        AirConditioner binatone = new AirConditioner();

        boolean deeAC = binatone.getOnValue();
        binatone.setWork(true);

        assertEquals(true, binatone.getOnValue());

    }

    @Test
    public void AirConditionerOffTest() {
        AirConditioner binatone = new AirConditioner();

        binatone.setWork(true);
        binatone.setWork(false);

        assertEquals(false, binatone.getOnValue());
    }

    @Test
    public void AirConditionerTempIncrease() {
        AirConditioner binatone = new AirConditioner();
        binatone.setWork(true);

        binatone.setTemp(17);
        binatone.setTemp(42);

        assertEquals(30, binatone.getTemp());
    }

    @Test
    public void AirConditionerTempDecrease() {
        AirConditioner binatone = new AirConditioner();
        binatone.setWork(true);

        binatone.setTemp(30);
        binatone.setTemp(12);

        assertEquals(16, binatone.getTemp());
    }

    @Test
    public void AirconditionerAt30() {
        AirConditioner binatone = new AirConditioner();
        binatone.setWork(true);

        binatone.setTemp(30);
        binatone.setTemp(40);

        assertEquals(30, binatone.getTemp());
    }

    @Test
    public void AirconditionerAt16() {
        AirConditioner binatone = new AirConditioner();
        binatone.setWork(true);

        binatone.setTemp(16);
        binatone.setTemp(10);

        assertEquals(16, binatone.getTemp());
    }
}
