package DietelJavaChapters.ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineTicketingSystemTest {

    AirlineTicketingSystem aero;

    @BeforeEach
    void setUp() {
        aero = new AirlineTicketingSystem(4);
    }

    @Test
    void testThatAirPlaneIsEmpty() {
        assertTrue(aero.isAirPlaneEmpty());
    }

    @Test
    public void testThatWhenSeatIsBooked_airplaneIsNotEmpty() {
        aero.bookSeat(1);
        assertFalse(aero.isAirPlaneEmpty());
    }

    @Test
    public void testThatWhenSeatIsBooked_SizeIncreases() {
        aero.bookSeat(1);
        aero.bookSeat(2);

        assertEquals(2, aero.checkNumberOfBookedSeat());
    }

    @Test
    public void testThatAlreadyBookedSeat_CannotBeAssigned() {
        aero.bookSeat(1);
        aero.bookSeat(1);
        assertEquals(1, aero.checkNumberOfBookedSeat());

    }
    @Test
    public void testThatNoBookings_WhenAirplaneIsFull(){
        aero.bookSeat(1);
        aero.bookSeat(2);
        aero.bookSeat(3);
        aero.bookSeat(4);
        assertEquals(4, aero.checkNumberOfBookedSeat());
       assertThrows(IndexOutOfBoundsException.class, () -> aero.bookSeat(5));


    }


}