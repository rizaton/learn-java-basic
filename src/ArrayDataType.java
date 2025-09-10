public class ArrayDataType {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "hello";
        arrayString[1] = "world";
        arrayString[2] = "3";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        int[] arrayInt = new int[]{
          10,90,80,67,29
        };
        Long[] arrayLong = new Long[]{
          10L, 90L, 80L, 67L, null
        };
        System.out.println(arrayInt[0]);
        System.out.println(arrayInt.length);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

        String[][] members = {
                {"Tony", "Iza"},
                {"Haikal", "Fikri"},
                {"Ahmad", "Yoga"}
        };
        System.out.println(members[0][0]);
        for (String[] member : members) {
            System.out.println(member[0]);
        }
    }
}
