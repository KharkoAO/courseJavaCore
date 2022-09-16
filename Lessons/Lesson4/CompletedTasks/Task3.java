public class Task3 {
    public static void main(String[] args) {
        int firstNumberFibonachi = 0;
        int secondNumberFibonachi = 1;
        int nextNumberFibonachi = 0;
        int volumeNumbers = 10;
        int startCollector = 3;

        System.out.println(firstNumberFibonachi);
        System.out.println(secondNumberFibonachi);
        while (startCollector <= volumeNumbers) {
            nextNumberFibonachi = firstNumberFibonachi + secondNumberFibonachi;
            System.out.println(nextNumberFibonachi);
            firstNumberFibonachi = secondNumberFibonachi;
            secondNumberFibonachi = nextNumberFibonachi;
            startCollector++;
        }
    }
}
