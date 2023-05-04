package Nomor2;
import java.util.Scanner;
public class ReversePerKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        String kalimat = input.nextLine();

        // memisahkan string per karakter spasi dan menyimpannya dalam array
        String[] hasil = kalimat.split(" ");

        System.out.print("Output: ");

        // membalikkan urutan array
        for (int i = hasil.length - 1; i >= 0; i--)
            // cetak string dalam array
            System.out.print(hasil[i] + " ");
    }
}
