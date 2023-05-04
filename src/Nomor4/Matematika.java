package Nomor4;

public class Matematika {
    private double x;
    public Matematika(double x) {
        this.x = x;
    }
    public double hitungLimitsin() {
        return Math.sin(x) / x;
    }
    public double hitungLimitcos() {
        return Math.cos(x) / x;
    }
    public double hitungLimittan() {
        return Math.tan(x) / x;
    }
}