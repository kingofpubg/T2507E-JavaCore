package main_session1;

import java.util.Scanner;

public class asm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap phan so thu nhat:");
        Fraction f1 = new Fraction();
        f1.nhapPhanSo(sc);

        System.out.println("Nhap phan so thu hai:");
        Fraction f2 = new Fraction();
        f2.nhapPhanSo(sc);

        System.out.print("Phan so 1: ");
        f1.inPhanSo();

        System.out.print("Phan so 2: ");
        f2.inPhanSo();

        System.out.print("Tong: ");
        f1.add(f2).inPhanSo();

        System.out.print("Hieu: ");
        f1.sub(f2).inPhanSo();

        System.out.print("Tich: ");
        f1.mul(f2).inPhanSo();

        System.out.print("Thuong: ");
        f1.div(f2).inPhanSo();

        System.out.print("Nghich dao phan so 1: ");
        f1.nghichDao().inPhanSo();
    }
}

class Fraction {
    private int tuSo;
    private int mauSo;

    // Getter & Setter
    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo == 0) {
            System.out.println("Mau so khong duoc bang 0!");
        } else {
            this.mauSo = mauSo;
        }
    }

    // Nhap phan so
    public void nhapPhanSo(Scanner sc) {
        System.out.print("Nhap tu so: ");
        tuSo = sc.nextInt();

        do {
            System.out.print("Nhap mau so (khac 0): ");
            mauSo = sc.nextInt();
        } while (mauSo == 0);

        rutGon();
    }

    // In phan so
    public void inPhanSo() {
        if (mauSo == 1)
            System.out.println(tuSo);
        else
            System.out.println(tuSo + "/" + mauSo);
    }

    // Rut gon phan so
    public void rutGon() {
        int ucln = UCLN(Math.abs(tuSo), Math.abs(mauSo));
        tuSo /= ucln;
        mauSo /= ucln;

        // Dam bao mau so duong
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    // Tim UCLN
    private int UCLN(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // Nghich dao
    public Fraction nghichDao() {
        Fraction kq = new Fraction();
        kq.tuSo = this.mauSo;
        kq.mauSo = this.tuSo;
        kq.rutGon();
        return kq;
    }

    // Cong
    public Fraction add(Fraction f) {
        Fraction kq = new Fraction();
        kq.tuSo = this.tuSo * f.mauSo + f.tuSo * this.mauSo;
        kq.mauSo = this.mauSo * f.mauSo;
        kq.rutGon();
        return kq;
    }

    // Tru
    public Fraction sub(Fraction f) {
        Fraction kq = new Fraction();
        kq.tuSo = this.tuSo * f.mauSo - f.tuSo * this.mauSo;
        kq.mauSo = this.mauSo * f.mauSo;
        kq.rutGon();
        return kq;
    }

    // Nhan
    public Fraction mul(Fraction f) {
        Fraction kq = new Fraction();
        kq.tuSo = this.tuSo * f.tuSo;
        kq.mauSo = this.mauSo * f.mauSo;
        kq.rutGon();
        return kq;
    }

    // Chia
    public Fraction div(Fraction f) {
        Fraction kq = new Fraction();
        kq.tuSo = this.tuSo * f.mauSo;
        kq.mauSo = this.mauSo * f.tuSo;
        kq.rutGon();
        return kq;
    }
}