package Nomor1;

public class Main {
    public static void main(String[] args){

//        a. Class
//           Class adalah sebuah blueprint atau cetak biru yang mendefinisikan perilaku atau karakteristik dari sebuah objek.
//        b. Object
//           Object adalah suatu instance atau wujud nyata dari sebuah kelas. Objek memiliki sifat atau karakteristik yang
//           ditentukan oleh kelasnya, serta dapat melakukan fungsi atau metode yang juga ditentukan oleh kelasnya.
//        c. Constuctor
//           Constructor adalah sebuah metode khusus yang digunakan untuk menginisialisasi objek yang baru dibuat.
//           Constructor biasanya dipanggil pada saat objek baru dibuat dan digunakan untuk menginisialisasi
//           nilai-nilai awal dari properti-properti objek tersebut.
//        d. Method Overloading
//           Method Overloading adalah suatu teknik di mana sebuah kelas memiliki beberapa metode dengan nama yang sama,
//           tetapi memiliki parameter yang berbeda-beda. Pemilihan metode yang tepat dilakukan secara otomatis oleh
//           bahasa pemrograman berdasarkan tipe data dan jumlah parameter yang dipassing ke metode tersebut.
//        e. Method Setter dan Getter
//           Method setter dan getter adalah sebuah teknik dalam pemrograman untuk mengakses dan mengubah nilai
//           dari properti atau variabel dalam sebuah class. Setter digunakan untuk mengubah nilai properti atau
//           variabel, sedangkan getter digunakan untuk mengambil nilai properti atau variabel.

        Manga person1 = new Manga();
        // contoh Set & Get
        person1.setNama("Putri Andriyani");
        person1.setUmur(20);
        System.out.println("Nama    : " + person1.getNama());
        System.out.println("Umur    : " + person1.getUmur() + "\n");
        System.out.println("Daftar Bacaan Manga " + person1.getNama());

        // contoh Object
        Manga Chihayafuru = new Manga("Chihayafuru", "Yuki Suetsugu", "Josei", 50);
        Manga KimiNiTodoke = new Manga("Kimi Ni Todoke", "Karuho Shiina", "Shoujo", 30);
        Manga manga = new Manga();

        Chihayafuru.displayMangaInfo();
        KimiNiTodoke.displayMangaInfo("Finished");
        manga.displayMangaInfo();
    }
}
