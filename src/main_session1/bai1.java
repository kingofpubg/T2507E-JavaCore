package main_session1;

public class bai1 {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("SV01", "Nguyễn Văn A", 20, 8.5);
        sv.inThongTin();
    }
}


class SinhVien {
    private String maSV;
    private String hoTen;
    private int tuoi;
    private double diemTB;

    public SinhVien(String maSV, String hoTen, int tuoi, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
    }

    public void inThongTin() {
        System.out.println("Mã SV: " + maSV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Điểm TB: " + diemTB);
    }
}