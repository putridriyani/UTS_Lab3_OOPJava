package Nomor4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double m, v, h, x;
        int pilihan;
        int pilihFungsi;


        System.out.println("Pilih rumus yang ingin digunakan: ");
        System.out.println("1. Matematika   : Rumus Limit Trigonometri");
        System.out.println("2. Fisika       : Rumus Menghitung Energi Total suatu Objek");
        System.out.print("Pilihan (1/2)   : ");
        pilihan = input.nextInt();
        System.out.println(" ");

        switch (pilihan) {
            case 1:
                System.out.println("Matematika: Menghitung limit dari sebuah fungsi saat x mendekati sebuah nilai\n" );
                System.out.println("Fungsi trigonometri: \n" +
                        "1) sin(x)/x\n" +
                        "2) cos(x)/x\n" +
                        "3) tan(x)/x");
                System.out.print("Pilihan (1/2/3)   : ");
                pilihFungsi = input.nextInt();

                System.out.print("Masukkan nilai x mendekati: ");
                x = input.nextDouble();
                Matematika matematika = new Matematika(x);

                switch (pilihFungsi){
                    case 1:
                        System.out.print("Limit fungsi sin(x)/x saat x mendekati "+ x + " adalah ");
                        System.out.println(matematika.hitungLimitsin());
                        System.out.print("\nContoh Perhitungan Limit Trigonometri yang lain:\n");
                        System.out.print("Limit fungsi sin(x)/x saat x mendekati 0.05 adalah ");
                        System.out.println(matematika.hitungLimitsin(0.05));
                        break;
                    case 2:
                        System.out.print("Limit fungsi cos(x)/x saat x mendekati "+ x + " adalah ");
                        System.out.println(matematika.hitungLimitcos());
                        System.out.print("\nContoh Perhitungan Limit Trigonometri yang lain:\n");
                        System.out.print("Limit fungsi cos(x)/x saat x mendekati 0.05 adalah ");
                        System.out.println(matematika.hitungLimitcos(0.05));
                        break;
                    case 3:
                        System.out.print("Limit fungsi tan(x)/x saat x mendekati "+ x + " adalah ");
                        System.out.println(matematika.hitungLimittan());
                        System.out.print("\nContoh Perhitungan Limit Trigonometri yang lain:\n");
                        System.out.print("Limit fungsi tan(x)/x saat x mendekati 0.05 adalah ");
                        System.out.println(matematika.hitungLimittan(0.05));
                        break;
                    default:
                        System.out.println("Pilihan tidak valid");
                        break;
                }
                break;

            case 2:
                System.out.println("Fisika: Menghitung Energi Total suatu Objek\n" );
                System.out.println("Rumus untuk menghitung energi total suatu objek adalah: E = K + U\n" +
                        "di mana:\n" +
                        "E = energi total\n" +
                        "K = energi kinetik\n" +
                        "U = energi potensial\n");

                System.out.println("Menghitung Energi Kinetik dan Energi Potensial");
                do {
                    System.out.print("Input Massa Objek (kg)                                : ");
                    m = input.nextDouble();
                    if (m < 0) {
                        System.out.println("Massa tidak boleh negatif. Silakan masukkan kembali.");
                    }
                } while (m < 0);
                do {
                    System.out.print("Input Kecepatan Objek (m/s)                           : ");
                    v = input.nextDouble();
                    if (v < 0) {
                        System.out.println("Kecepatan tidak boleh negatif. Silakan masukkan kembali.");
                    }
                } while (v < 0);
                do {
                    System.out.print("Input Ketingggian Objek dari atas permukaaan tanah (m): ");
                    h = input.nextDouble();
                    if (h < 0) {
                        System.out.println("Ketinggian tidak boleh negatif. Silakan masukkan kembali.");
                    }
                } while (h < 0);

                Fisika fisika = new Fisika(m, v, h);
                fisika.hitungTotal();
                System.out.print("\n\nContoh Perhitungan Energi Kinetik dan Energi Potensial yang lain:");
                fisika.hitungTotal(4, 75, 12);
                fisika.hitungTotal(7, 65, 1000);

                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}
