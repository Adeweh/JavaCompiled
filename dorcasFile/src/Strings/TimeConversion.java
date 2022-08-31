package Strings;

public class TimeConversion {

    public static void main(String[] args) {

        String time = "02:45:36PM";
        String _24HourTime = timeConverter(time);
        System.out.println(timeConverter(time));
    }
        private static String timeConverter(String time){

            String[] components = time.split(":");
            String hourComponent = components[0];
            String minuteComponent = components[1];
            String secondsMeridianComponent = components[2];
            String secondsComponent = secondsMeridianComponent.substring(0, 2);
            String meridianComponent = secondsMeridianComponent.substring(2);

            if (meridianComponent.equalsIgnoreCase("AM")) {
                if (hourComponent.equals("12")) {
                    hourComponent = "00";
                }
            } else if (meridianComponent.equalsIgnoreCase("PM")) {
                int hourComponentAsInt = Integer.parseInt(hourComponent);
                if (hourComponentAsInt < 12) {
                    hourComponentAsInt = hourComponentAsInt + 12;
                }
                hourComponent = String.valueOf(hourComponentAsInt);
            }
            return hourComponent + ":" + minuteComponent + ":"+secondsComponent;
        }
    }

