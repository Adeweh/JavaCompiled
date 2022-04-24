package dorcas;

public class AutomaticBike {
    private boolean work;

    private boolean move;

    private boolean stopMove;

    private int speed;

    public boolean getOnValue() {
        return work;
    }

    public void setWork(boolean working) {
        work = working;
    }

    public void setSpeed(int pace) {
        speed = pace;
        if (stopMove == false) {
            if (move == true) {
                if (speed < 21) {
                    speed = speed + 1;
                }
                if (speed > 20) {
                    if (speed < 31) {
                        speed = speed + 2;
                    }
                    if (speed > 30) {
                        if (speed < 41) {
                            speed = speed + 3;
                        }
                        if (speed > 40) {
                            if (speed < 51) {
                                speed = speed + 4;
                            }


                        }

                    }
                }
            }
        }
        if (move == false) {
            if (stopMove == true) {
                if (speed < 21) {
                    speed = speed - 1;
                }
                if (speed > 20) {
                    if (speed < 31) {
                        speed = speed - 2;
                    }
                    if (speed > 30) {
                        if (speed < 41) {
                            speed = speed - 3;
                        }
                        if (speed > 40) {
                            if (speed < 51) {
                                speed = speed - 4;
                            }
                        }
                    }
                }
            }

        }

    }

    public int getSpeed() {
        return speed;
    }

    public void setAcceleration(boolean working) {
        move = working;

    }

    public void setDeceleration(boolean worked) {
        stopMove = worked;
    }

    public boolean getOnAcceleration() {
        return move;
    }

    public boolean getDeceleration() {
        return stopMove;
    }
}




