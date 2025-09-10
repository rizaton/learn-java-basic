public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialLoop(6));

        System.out.println(factorialRecursive(5));
        System.out.println(factorialRecursive(6));

        loop(100);
    }
    
    static int factorialLoop(int value) {
        int result = 1;
        for (int counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
    static void loop(int value) {
        if (value == 8) {
            System.out.println("Done");
        } else  {
            System.out.println("Loop-" + value);
            loop(value - 1);
        }
    }
}
