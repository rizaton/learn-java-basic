public class NonPrimitiveDataType {
    public static void main(String[] args) {
        int intValue = 5;
        Integer integerValue;

        intValue = 10;
        integerValue = null;

        System.out.println(intValue);
        System.out.println(integerValue);

        integerValue = intValue;

        System.out.println(integerValue);

        int intValue1 = integerValue;

        short shortVal = integerValue.shortValue();

        System.out.println(intValue1);
        System.out.println(shortVal);

    }
}
