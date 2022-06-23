package TurtleGraphics;

import static TurtleGraphics.Direction.*;

public class Turtle {

    private boolean isPenUp = true;

    private Position currentPosition = new Position(0,0);

    private Direction currentDirection = EAST;

    public boolean isPenUp() {
        return isPenUp;
    }

    public boolean penDown() {
        return isPenUp = false;
    }

    public void isPenDown() {
        isPenUp = false;
    }

    public void PenUp() {
        isPenUp = true;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
//        if(currentDirection == EAST) {currentDirection = SOUTH;
//        return;
//        }
//        if(currentDirection == SOUTH) {currentDirection = WEST;
//            return;}
//        if(currentDirection == WEST) {currentDirection = NORTH;
//            return;}
        switch (currentDirection) {
            case EAST -> face(SOUTH);
            case SOUTH -> face(WEST);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);

        }


    }

    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> currentDirection = NORTH;
            case NORTH -> currentDirection = WEST;
            case WEST -> currentDirection = SOUTH;
            case SOUTH -> currentDirection = EAST;
        }
    }
    private void face(Direction direction){
        currentDirection = direction;
    }

    public void move(int numOfSteps, SketchPad sketchPad) {
        if(!isPenUp) writeOn(sketchPad, numOfSteps);
        move(numOfSteps);

//        int currentRow = currentPosition.getRow();
//        int currentColumn = currentPosition.getColumn();
        }

    private void writeOn(SketchPad sketchPad, int numOfSteps) {
        int[][] floor = sketchPad.getFloor();
        int currentRow = currentPosition.getRow();
        int currentColumn = currentPosition.getColumn();
        switch (currentDirection) {
            case EAST -> {
                for (int i = currentColumn; i < currentColumn + numOfSteps; i++) {
                    floor[currentRow][i] = 1;
                }
            }
            case WEST -> {
                for (int i = currentColumn; i > currentColumn + numOfSteps; i--) {
                    floor[currentRow][i] = 1;
                }
            }
            case SOUTH -> {
                for (int i = currentRow; i < currentRow + numOfSteps; i++) {
                    floor[currentRow][i] = 1;
                }
            }
            case NORTH -> {
                for (int i = currentRow; i > currentRow + numOfSteps; i--) {
                    floor[currentRow][i] = 1;
                }
            }
        }
    }

    private void move(int noOfSteps){
            switch (currentDirection){
            case EAST, WEST, SOUTH, NORTH -> increaseColumnBy(noOfSteps);

        }
        }
    private  void increaseColumnBy(int noOfSteps){
        int currentColumn = currentPosition.getColumn();

        currentPosition.setColumn((noOfSteps+currentColumn));

    }

    public Position getCurrentPosition() {return
            currentPosition;
    }

}
