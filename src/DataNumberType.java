public class DataNumberType {
    public static void main(String[] args) {

        byte thisByte = 100;
        short thisShort = 10000;
        int thisInt = 1000000000;
        long thisLong = 1000000000;
        long thisLong2 = 1000000000L;

        float thisFloat = 10.10F;
        double thisDouble = 10.10;

        int decimalInt = 25;
        int hexInt = 0xA132B;
        int binInt = 0b01010101;

        /*
         * Widening casting (Automatic) : byte -> short -> int -> long -> float -> double
         * Narrowing Casting (Manual) : double -> float -> long -> int -> char -> short -> byte
         */
        byte wideByte;
        wideByte = 10;
        short wideShort;
        wideShort = wideByte;
        int wideInt;
        wideInt = wideShort;
        long wideLong;
        wideLong = wideInt;
        float wideFloat;
        wideFloat = wideLong;
        double wideDouble = wideFloat;

        double narrowDouble;
        narrowDouble = wideDouble;
        float narrowFloat = (float) narrowDouble;
        long narrowLong = (long) narrowFloat;
        int narrowInt = (int) narrowLong;
        char narrowChar = (char) narrowInt;
        short narrowShort = (short) narrowChar;
        byte narrowByte = (byte) narrowShort;

    }
}
