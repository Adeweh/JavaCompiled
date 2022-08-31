package TurtleGraphics;

public class Position {
    private int row;
    private int column;



    public Position(int row, int column){
        this.row = row;
        this.column = column;

    }
    public int getColumn() { return column;
    }

    public int getRow() {return row;
    }

    @Override
    public  boolean equals(Object input){
        Position compared = (Position) input;
        if(row == compared.getRow() && column == compared.getColumn()) return true;
        return false;
    }



    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }

    public void setColumn(int numOfSteps) {
        this.column = numOfSteps;

    }

    public void setRow(int noOfSteps) {
        this.row = noOfSteps;
    }
}
