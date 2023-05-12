package Nomor2;
import java.util.Scanner;
public class ReversePerHuruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat;

        while (true) {
        System.out.print("Input : ");
        kalimat = input.nextLine().trim();

            if (!kalimat.isEmpty()) {
                break;
            }
            System.out.println("Input tidak boleh kosong!");
        }


        // konversi string ke char yang disimpan sebagai array
        char[] hasil = kalimat.toCharArray();

        System.out.print("Output: ");

        // membalikkan urutan array
        for (int i = hasil.length - 1; i >= 0; i--)
            // cetak char dalam array
            System.out.print(hasil[i]);
    }
}

