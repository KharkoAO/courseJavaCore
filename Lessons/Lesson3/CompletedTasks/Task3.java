public class Task3 {
    public static void main(String[] args) {
        int currentHour = 9;
        if (currentHour >= 4 && currentHour < 10) {
            System.out.println("Good morning");
        } else if (currentHour >= 10 && currentHour < 16) {
            System.out.println("Good afternoon");
        } else if (currentHour >= 16 && currentHour < 22) {
            System.out.println("Good evening");
        } else if ((currentHour >= 22 && currentHour < 24) || (currentHour < 4 && currentHour >= 0)) {
            System.out.println("Good night");
        } else {
            System.out.println("Wrong time!");
        }
    }
}
