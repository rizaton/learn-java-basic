public class SwitchStatement {
    public static void main(String[] args) {
        char nilai = 'A';

        // Switch Expression
        switch (nilai) {
            case 'A':
                System.out.println("Anda Lulus dengan nilai Baik");
                break;
            case 'B':
            case 'C':
                System.out.println("Anda Lulus dengan nilai Cukup");
                break;
            case 'D':
            case 'E':
                System.out.println("Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");
                break;
        }
        // Switch Lambda
        switch (nilai) {
            case 'A' -> System.out.println("Anda Lulus dengan nilai Baik");
            case 'B', 'C' -> System.out.println("Anda Lulus dengan nilai Cukup");
            case 'D', 'E' -> System.out.println("Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda salah jurusan");
            }
        }
        // Switch Lambda tanpa yield;
        String ucapan;
        switch (nilai) {
            case 'A' -> ucapan = "Anda Lulus dengan nilai Baik";
            case 'B', 'C' -> ucapan = "Anda Lulus dengan nilai Cukup";
            case 'D', 'E' -> ucapan = "Tidak Lulus";
            default -> {
                ucapan = "Mungkin Anda salah jurusan";
            }
        }
        System.out.println(ucapan);

        // Switch yield;
        String greet;
        greet = switch (nilai) {
            case 'A':
                yield "Anda Lulus dengan nilai Baik";
            case 'B', 'C':
                yield "Anda Lulus dengan nilai Cukup";
            case 'D', 'E':
                yield "Anda Tidak Lulus";
            default :
                yield "Mungkin Anda salah jurusan";
        };
        System.out.println(greet);

        // Switch Lambda yield;
        String greeting;
        greeting = switch (nilai) {
            case 'A' -> "Anda Lulus dengan nilai Baik";
            case 'B', 'C' -> "Anda Lulus dengan nilai Cukup";
            case 'D', 'E' -> "Anda Tidak Lulus";
            default -> "Mungkin Anda salah jurusan";
        };
        System.out.println(greeting);
    }
}
