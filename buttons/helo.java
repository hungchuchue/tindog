
import java.util.Scanner;

public class Diem {

    double x, y;

    //constructor 1
    Diem() {
    }

    //constructor 2
    Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Nhap thong tin diem
    void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hoanh do, x=");
        this.x = sc.nextDouble();
        System.out.println("Nhap tung do, y");
        this.y = sc.nextDouble();
    }
    //Hien thi thong tin diem
    void hienDiem(){
        System.out.println("Diem ("+this.x+";"+this.y+")");
    }
    //tinh khoang cach giua diem hien thoi va diem truyen vao doi so
    double tinhKC(Diem B){
        double kc;
        kc=Math.sqrt(Math.pow(this.x-B.x,2)+Math.pow(this.y-B.y, 2));
        return kc;
    }
    //tinh kc giua 2 diem A, B
    double tinhKC(Diem A, Diem B){
        double kc;
        kc=Math.sqrt(Math.pow(A.x-B.x,2)+Math.pow(A.y-B.y, 2));
        return kc;
    }
    public static void main(String[] args) {
        Diem A, B, o;
        A=new Diem();
        B=new Diem();
        o=new Diem();
        System.out.println("Nhap dl cho diem A");
        A.nhapDiem();
        System.out.println("Nhap dl cho diem B");
        B.nhapDiem();
        System.out.println("Khoang cach AB="+A.tinhKC(B));
        System.out.println("Khoang cach AB="+o.tinhKC(A, B));
        DaGiac d=new DaGiac();
        System.out.println("Nhap thong tin da giac");
        d.nhapDaGiac();
        System.out.println("Chu vi cua da giac la:"+d.tinhChuVi());
    }

}
class DaGiac{
    int soCanh;
    double doDaiDanhSach[];
    DaGiac(){}
    DaGiac(int n, double ds[]){
        this.soCanh=n;
        this.doDaiDanhSach=ds;
    }
    //phuong thuc nhap tt da giac
    void nhapDaGiac(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so canh da giac:");
        this.soCanh=sc.nextInt();
        System.out.println("Nhap vao chieu dai tung canh:");
        this.doDaiDanhSach=new double[this.soCanh];
        for(int i=0; i<this.doDaiDanhSach.length;i++){
            System.out.println("Nhap vao do dai canh "+(i+1));
            this.doDaiDanhSach[i]=sc.nextDouble();
        }
    }
    //Tinh chu vi da giac
    double tinhChuVi(){
        double cv=0;
        for(int i=0;i<this.soCanh;i++){
            cv=cv+this.doDaiDanhSach[i];
        }
        return cv;
    }
    
}
