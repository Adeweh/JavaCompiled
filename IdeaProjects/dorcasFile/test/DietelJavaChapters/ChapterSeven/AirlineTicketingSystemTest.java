package DietelJavaChapters.ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationSystemTest {

    AirlineTicketingSystem aero;

    @BeforeEach
    void setUp() {
        aero = new AirlineTicketingSystem();
    }

    @Test
    void testThatAirPlaneIsEmpty() {
        assertTrue(aero.isAirPlaneEmpty());


    }
}