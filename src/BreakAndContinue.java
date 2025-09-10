public class BreakAndContinue {
    public static void main(String[] args) {
        var counter = 1;
        while (true) {
            System.out.println("counter = " + counter);
            counter++;
            if (counter > 10) {
                break;
            }
        }
        for (int counter2 = 1; counter2 <= 100; counter2++) {
            if (counter2 % 2 == 0) {
                continue;
            }
            System.out.println("counter2 Odd = " + counter2);
        }
    }
}
