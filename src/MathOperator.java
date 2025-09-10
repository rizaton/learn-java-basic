public class MathOperator {
    public static void main(String[] args) {
        // Basic Operator
        int a = 100;
        int b = 9;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // Augmented Assignments
        a+=10;
        System.out.println(a);

        a-=10;
        System.out.println(a);

        a*=10;
        System.out.println(a);

        a/=10;
        System.out.println(a);

        a%=10;
        System.out.println(a);

        // Unary Operator
        int c = 1;
        System.out.println(c);
        c++;
        System.out.println(c);
        c--;
        System.out.println(c);

        boolean e = true;
        System.out.println(e);
        System.out.println(!e);

    }
}
