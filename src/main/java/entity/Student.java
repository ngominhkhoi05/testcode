package entity;

public class Student {
    private String maSV;
    private String hoTen;
    private int tuoi;
    private double diemTB;
    private static int nextID=1;

    public Student(String hoTen, int tuoi, double diemTB) {
        this.maSV ="CNTT"+(nextID++);
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-5d %-5.2f", maSV, hoTen, tuoi, diemTB);
    }
}
