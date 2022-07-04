package DietelJavaChapters.ChapterSeven;

public class AirlineTicketingSystem {


    private int numberOfBookedSeat;
    private final boolean[] seats;
    private final int numberOfSeats;
    private int numberOfFirstClassSeats ;
    private int numberOfSecondClassSeats = 5;

    public AirlineTicketingSystem(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        seats = new boolean[numberOfSeats];
    }

    public boolean isAirPlaneEmpty() {
        return numberOfBookedSeat == 0;
    }

    public void bookSeat(int seatNumber) {
        if (seatNumber <= seats.length) {
            int actualIndex = seatNumber - 1;
            seats[actualIndex] = true;
            numberOfBookedSeat++;
        }else {
            throw new IndexOutOfBoundsException();
        }

    }

    private void bookSecondClassSeat(int actualIndex) {
        if (actualIndex <= numberOfSecondClassSeats) {
            seats[actualIndex] = true;
        }
    }

    private void bookFirstClassSeat(int actualIndex) {
        if(actualIndex <= numberOfFirstClassSeats){
            seats [actualIndex] = true;
        }
    }

    public int checkNumberOfBookedSeat() {
        return numberOfBookedSeat;
    }

    public boolean checkIfSeatIsOccupied(int seatNumber){
        return seats[seatNumber];
    }

    public boolean isPLaneFull(){
        return numberOfBookedSeat == seats.length;
    }

}
