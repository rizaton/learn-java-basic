public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;

        // Regular IF
        if (nilai >=75){
            ucapan = "Memenuhi Standar";
        } else {
            ucapan = "Tidak Memenuhi Standar";
        }
        System.out.println(ucapan);

        // Ternary Operator
        String ucapan1 = nilai >= 75 ? "Memenuhi Standar" : "Tidak Memenuhi Standar";
        System.out.println(ucapan1);
    }
}
