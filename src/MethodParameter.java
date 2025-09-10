public class MethodParameter {
    public static void main(String[] args) {
        hello("Tony", 22);
        hello("Iza", 23);

    }
    static String ageIs(int age) {
        return "Your age is: " + age;
    }
    static void hello (String name, int age) {
        System.out.println("hello " + name);
        System.out.println(ageIs(age));
    }
}
