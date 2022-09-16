public class Task4 {
    public static void main(String[] args) {
        int firstFactor = 1;
        int secondFactor = 1;
        int product = 0;
        int lastFactor = 10;

        while (firstFactor <= lastFactor) {
            while (secondFactor <= lastFactor) {
                product = firstFactor * secondFactor;
                System.out.print(product + " ");
                secondFactor++;
            }
            secondFactor = 1;
            System.out.println();
            firstFactor++;
        }
    }
}
