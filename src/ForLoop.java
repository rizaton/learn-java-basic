public class ForLoop {
    public static void main(String[] args) {
        int loop = 10;
        for (int i = 0; i < loop; i++) {
            System.out.println(i);
        }
        //      init; condition; post
//        for (int i = 0; i < loop; i++) {
//            // block
//        }
        var counter = 1;
        for (; counter <= 10; ) {
            System.out.println("loop" + counter);
            counter++;
        }
//        for (;;){
//            System.out.println("Always Loop");
//        }

        for (var counter1 = 1; counter1 <= 10; ) {
            System.out.println("loop1" + counter1);
            counter1++;
        }
        for (var counter2 = 1; counter2 <= 10; counter2++) {
            System.out.println("loop2" + counter2);
        }
    }
}
