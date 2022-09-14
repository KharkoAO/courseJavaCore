public class Task4 {
    public static void main(String[] args) {
        int currentHour = 9;
        switch (currentHour) {
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Good night");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Good morning");
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Good afternoon");
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                System.out.println("Good evening");
                break;
            default:
                System.out.println("Wrong time!");
                break;
        }
    }
}
