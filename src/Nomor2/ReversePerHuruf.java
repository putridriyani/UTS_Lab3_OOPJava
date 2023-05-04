package Nomor2;
import java.util.Scanner;
public class ReversePerHuruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        String kalimat = input.nextLine();

        // konversi string ke char yang disimpan sebagai array
        char[] hasil = kalimat.toCharArray();

        System.out.print("Output: ");

        // membalikkan urutan array
        for (int i = hasil.length - 1; i >= 0; i--)
            // cetak char dalam array
            System.out.print(hasil[i]);
    }
}

