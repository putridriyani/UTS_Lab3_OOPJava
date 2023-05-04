package Nomor1;

// contoh Class
public class Manga {
    private String judul;
    private String pengarang;
    private String demografi;
    private int vol;
    private int umur;
    private String nama;

    // contoh Constructor
    public Manga(String judul, String pengarang, String demografi, int vol) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.demografi = demografi;
        this.vol = vol;
    }

    // contoh Method Setter & Getter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = vol;
    }

    public Manga(){
        this("One Piece", "Eiichiro Oda", "Shounen", 105);
    }


    // contoh Method Overloading
    public void displayMangaInfo() {
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Demografi : " + demografi);
        System.out.println("Volume    : " + vol);
        System.out.println("");
    }
    public void displayMangaInfo(String status) {
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Demografi : " + demografi);
        System.out.println("Volume    : " + vol);
        System.out.println("Status    : " + status);
        System.out.println("");
    }


}