package Nomor4;

public class Fisika {
    private double v;
    private double m;
    private double h;
    

    public Fisika(double m, double v, double h) {
        this.m = m;
        this.v = v;
        this.h = h;
    }
    public double hitungKinetik() {
        return 0.5 * m * Math.pow(v,2);

    }
    public double hitungPotensial() {
        return  m * 9.8 * h;
    }

    public Fisika(){
        this(25, 56, 100);
    }
    public void hitungTotal(){
        System.out.print("\nEnergi Kinetik   : 0.5 x m x v^2 = "+ hitungKinetik() + " Joule");
        System.out.print("\nEnergi Potensial : m x g x h     = "+ hitungPotensial() + " Joule");
        System.out.print("\nEnergi Total     : K + U         = " + (hitungKinetik() + hitungPotensial()) + " Joule");
    }

    public void hitungTotal(double m, double v, double h){
        System.out.println("\n\nMassa Objek (kg)                                : "+ m);
        System.out.println("Kecepatan Objek (m/s)                           : "+ v);
        System.out.println("Ketingggian Objek dari atas permukaaan tanah (m): "+ h);
        System.out.print("\nEnergi Kinetik   : 0.5 x m x v^2 = "+ hitungKinetik() + " Joule");
        System.out.print("\nEnergi Potensial : m x g x h     = "+ hitungPotensial() + " Joule");
        System.out.print("\nEnergi Total     : K + U         = " + (hitungKinetik() + hitungPotensial()) + " Joule");
    }

}
