package week06;

public class alarmClock {

    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(0, true));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(10, false));
    }

    public static String alarmClock(int day, boolean isVacation) {

        // we can put precondition to check if the day is between 0 and 6.
        if (day >= 0 && day <= 6) {
            if (isVacation) {
                if (day == 0 || day == 6) {
                    return "off";
                } else {
                    return "10:00";
                }
            } else {
                if (day == 0 || day == 6) {
                    return "10:00";
                } else {
                    return "7:00";
                }
            }
        } else {
            return "Please enter a valid day number";
        }


    }
}
