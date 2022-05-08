package dorcas;

public class AirConditioner {
    private boolean work;
    private int temperature;



    public boolean getOnValue() {
        return work;

    }

    public void setWork(boolean working) {
        work = working;
    }

    public void setTemp(int temp) {
        if (temperature >= 0) {
            temperature = temp;
        }
        if (temperature > 30) {
            temperature = 30;
        }
        if (temperature < 16){
           temperature = 16;
        }
    }

    public int getTemp() {
        return temperature;
    }
}
