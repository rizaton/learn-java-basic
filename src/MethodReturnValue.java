public class MethodReturnValue {
    public static void main(String[] args) {
        System.out.println("rectangle Area 2x5 = " + rectangleArea(2,5));
        System.out.println("rectangle Area 6x3 = " + rectangleArea(6,3));

        System.out.println("square Area 3 = " + squareArea(3));
        System.out.println("square Area 6 = " + squareArea(6));

    }
    static int rectangleArea(int a, int b){
        return a * b;
    }
    static int squareArea(int a) {
        return a * a;
    }
}
