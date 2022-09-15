public class Task3 {
    public static void main(String[] args) {
        int timeOfDay = 11;
        String greeting = "";

        if (timeOfDay >= 6 && timeOfDay < 12) {
            greeting = "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay < 18) {
            greeting = "Good afternoon!";
        } else if (timeOfDay >= 18 && timeOfDay < 24) {
            greeting = "Good evening!";
        } else if (timeOfDay >= 0 && timeOfDay < 6) {
            greeting = "Good night!";
        } else {
            greeting = "Non-real-time!";
        }
        System.out.println(greeting);
    }
}
