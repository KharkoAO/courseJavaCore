public class Task2 {
    public static void main(String[] args) {
        int numberWeekday = 3;
        String weekday = "";

        if (numberWeekday == 1) {
            weekday = "Monday";
        } else if (numberWeekday == 2) {
            weekday = "Tuesday";
        } else if (numberWeekday == 3) {
            weekday = "Wednesday";
        } else if (numberWeekday == 4) {
            weekday = "Thursday";
        } else if (numberWeekday == 5) {
            weekday = "Friday";
        } else if (numberWeekday == 6) {
            weekday = "Saturday";
        } else if (numberWeekday == 7) {
            weekday = "Sunday";
        } else {
            weekday = "No day with this number!";
        }
        System.out.println(weekday);
    }
}
