package main_session1;

public class Bai2 {
    public static void main(String[] args) {
        TaiKhoan tk = new TaiKhoan("123456", "Nguyen Van B", 500000);

        tk.hienThiSoDu();
        tk.napTien(200000);
        tk.rutTien(800000);
        tk.rutTien(300000);
        tk.hienThiSoDu();
    }
}

class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTK;
    private double soDu;

    public TaiKhoan(String soTaiKhoan, String tenChuTK, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTK = tenChuTK;
        this.soDu = soDu;
    }

    public void napTien(double soTien) {
        if (soTien <= 0) {
            System.out.println("Khong duoc nap so tien am!");
        } else {
            soDu += soTien;
            System.out.println("Nap tien thanh cong");
        }
    }

    public void rutTien(double soTien) {
        if (soTien <= 0) {
            System.out.println("So tien rut phai lon hon 0");
        } else if (soTien > soDu) {
            System.out.println("So du khong du!");
        } else {
            soDu -= soTien;
            System.out.println("Rut tien thanh cong");
        }
    }

    public void hienThiSoDu() {
        System.out.println("So du hien tai: " + soDu);
    }
}