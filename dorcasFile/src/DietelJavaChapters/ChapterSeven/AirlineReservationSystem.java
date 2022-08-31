package DietelJavaChapters.ChapterSeven;


import java.util.InputMismatchException;

public class AirlineReservationSystem {

   private boolean [] seats = new boolean[10];
   private int numberOfFilledSeats;
   private int indexOfFirstClassSeats;
   private int indexOfSecondClassSeats = 5;


   public boolean isAirPlaneEmpty(){
       return numberOfFilledSeats == 0;
   }

   public void assignSeats(int number){
       switch (number) {
           case 1 -> assignFirstClassSeat();
           case 2 -> assignSecondCLassSeat();
           default -> throw new InputMismatchException();
       }

   }

    public void assignFirstClassSeat() {
       if(indexOfFirstClassSeats < 5){
           if(!checkIfSeatIsAlreadyAssigned(indexOfFirstClassSeats)){
        seats[indexOfFirstClassSeats] = true;
        indexOfFirstClassSeats++;
       numberOfFilledSeats++;}
       }
    }
    public void assignSecondCLassSeat(){
       if(indexOfSecondClassSeats <10) {
           if(!checkIfSeatIsAlreadyAssigned(indexOfFirstClassSeats)) {
               seats[indexOfSecondClassSeats] = true;
               indexOfSecondClassSeats++;
               numberOfFilledSeats++;
           }
       }

    }
    public boolean isAirPlaneFull(){
        return numberOfFilledSeats == 10;
    }

    private boolean checkIfSeatIsAlreadyAssigned(int number){
       if(seats[number]){
           return true;
       }
       return false;

    }
}
