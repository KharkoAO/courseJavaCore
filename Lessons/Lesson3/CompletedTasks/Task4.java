public class Task4 {
    public static void main(String[] args) {
        int timeOfDay = 11;
        String greeting = "";

        switch (timeOfDay) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                greeting = "Good night!";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                greeting = "Good morning!";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                greeting = "Good afternoon!";
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                greeting = "Good evening!";
                break;
            default:
                greeting = "Non-real-time!";
                break;
        }
        System.out.println(greeting);
    }
}
