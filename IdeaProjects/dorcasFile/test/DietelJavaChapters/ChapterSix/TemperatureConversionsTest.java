package DietelJavaChapters.ChapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    Temp test;

    @BeforeEach
    void setUp() {
        test = new Temp();
    }


    @Test
    void convertCelsiusToKelvin() {
        test.convertCelsiusToKelvin(60);
        assertEquals(333.15, test.convertCelsiusToKelvin(60));


    }

    @Test
    void convertKelvinToCelsius() {
        ;
//        BigDecimal  = new BigDecimal(drivingCost).setScale(2, RoundingMode.DOWN);
        double rounded = Math.round(test.convertKelvinToCelsius(60) * 100.0)/100.0;
        assertEquals(-213.15, rounded);



    }
}