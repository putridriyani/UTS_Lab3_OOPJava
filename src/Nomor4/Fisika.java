package Nomor4;

public class Fisika {
    private double v;
    private double m;
    private double h;
    private double K;
    private double U;

    public Fisika(double m, double v, double h) {
        this.m = m;
        this.v = v;
        this.h = h;
    }
    public void hitungKinetik() {
        K = 0.5 * m * Math.pow(v,2);
        System.out.print("\nEnergi Kinetik   : 0.5 x m x v^2 = "+ K + " Joule");
    }
    public void hitungPotensial() {
        U = m * 9.8 * h;
        System.out.print("\nEnergi Potensial : m x g x h     = "+ U + " Joule");
    }
    public double hitungTotal(){
        return K + U;
    }

}
