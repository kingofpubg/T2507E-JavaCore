package main_session1;

public class Bai3 {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh("Tran Thi C", 7.5, 8.0, 6.5);
        hs.hienThiThongTin();
    }
}

class HocSinh {
    private String hoTen;
    private double diemToan;
    private double diemVan;
    private double diemAnh;

    public HocSinh(String hoTen, double diemToan, double diemVan, double diemAnh) {
        this.hoTen = hoTen;
        setDiemToan(diemToan);
        setDiemVan(diemVan);
        setDiemAnh(diemAnh);
    }

    public void setDiemToan(double diemToan) {
        if (diemToan >= 0 && diemToan <= 10)
            this.diemToan = diemToan;
        else
            System.out.println("Diem Toan khong hop le");
    }

    public void setDiemVan(double diemVan) {
        if (diemVan >= 0 && diemVan <= 10)
            this.diemVan = diemVan;
        else
            System.out.println("Diem Van khong hop le");
    }

    public void setDiemAnh(double diemAnh) {
        if (diemAnh >= 0 && diemAnh <= 10)
            this.diemAnh = diemAnh;
        else
            System.out.println("Diem Anh khong hop le");
    }

    public double tinhDiemTB() {
        return (diemToan + diemVan + diemAnh) / 3;
    }

    public String xepLoai() {
        double dtb = tinhDiemTB();
        if (dtb >= 8) return "Gioi";
        else if (dtb >= 6.5) return "Kha";
        else if (dtb >= 5) return "Trung binh";
        else return "Yeu";
    }

    public void hienThiThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Diem TB: " + tinhDiemTB());
        System.out.println("Xep loai: " + xepLoai());
    }
}