public class Main {

    public static void main(String[] args) {

        int counter = 0;
        while (isLucky() && isLimitNotReached(counter)) {
            counter = counter + 1;
        }
        System.out.println(counter);
    }

    static boolean isLimitNotReached(int counter) {
        return counter < 10 || isEven(counter);
    }

    static boolean isLucky() {
        return Math.random() < 0.9;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}