public class MethodOverloading {
    public static void main(String[] args) {
        hello();
        hello("Tony");
        hello("Iza");
        hello("Riza", "Ton");
        hello("Tony", "Iza");


    }

    static void hello(){
        System.out.println("hello");
    }
    static void hello(String name){
        System.out.println("hello " + name);
    }
    static void hello(String firstname, String lastname){
        System.out.println("hello " + firstname + " " + lastname);
    }
}
