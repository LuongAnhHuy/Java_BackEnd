package Java_Buoi_3.KhachSan;

public class QuanLy {
    long giaTien;
    String loaiPhong;
    long id;
    long khachHang;
    long giaTienThanhToan;


    public QuanLy(long giaTien, String loaiPhong, long id, long khachHang) {
        this.giaTien = giaTien;
        this.loaiPhong = loaiPhong;
        this.id = id;
        this.khachHang = khachHang;
    }

    public boolean kiemTraPhong(){
        if (khachHang > 0){
            return true;
        }else{
            return false;
        }
    }
    public long thanhToan(long soNgay){
        return giaTienThanhToan = giaTien * soNgay;
    }


    public long getId() {
        return id;
    }

    public void inThongTin(){
        System.out.println("ID Phong: " + id + ", Loai Phong: " + loaiPhong + ", Gia tien la: " + giaTien + ", Co: " + khachHang + " Khach");
    }

}
