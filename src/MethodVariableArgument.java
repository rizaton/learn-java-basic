public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values1 = {90,90,90,90,90};
        int[] values2 = {40,40,40,90,70};

        congrats("Tony", values1);
        congrats("Iza", values2);
        congrats("Riza", 70,80,80,90,70);
    }
    static void congrats(String name, int... values){
        var total = 0;

        for (var value: values){
            total += value;
        }
        var finalValue = total / values.length;
        if (finalValue >= 75){
            System.out.println("congrats " + name + ", you passed");
        } else {
            System.out.println(name + " you failed.. try again next year!");
        }
    }
}
