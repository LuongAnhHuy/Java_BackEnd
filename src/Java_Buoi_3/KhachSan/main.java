package Java_Buoi_3.KhachSan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    List<QuanLy> quanLyList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    //Quản lý phòng khách sạn .
    //Một khách sạn có các loại phòng loại A  giá 2 tr ,/ ngay loại B : 1 tr/ngay  và loại C 500k / ngay
    //Một nhân viên lễ tân khi có khách đến thì phải biết có những phòng nào trống và cung cấp thông tin giá tiền cũng như dịch vụ của từng loại phòng.
    //Khi khách ra về , hệ thống sẽ cho biết giá tiền mà khách phải trả.

    public static void main(String[] args) {
        List<QuanLy> quanLyList = new ArrayList<>();
        boolean exit = false;
        do {
            System.out.println("Vui long nhap lua chon: \n" +
                    "1. Nhap thong tin phong \n" +
                    "2. Kiem tra phong \n" +
                    "3. Thanh toan phong \n" +
                    "Nhan phim khac de thoat chuong trinh \n");
            System.out.println("Nhap lua chon cua ban");
            int a = scanner.nextInt();
            switch (a){
                case 1:
                    System.out.println("Nhap so luong phong muon them: ");
                    int sl = scanner.nextInt();
                    for (int i = 0; i < sl; i++) {
                        System.out.println("Phong so " + (i + 1));
                        QuanLy quanLy = nhapDataPhong();
                        addUser(quanLyList, quanLy);
                    }
                    break;
                case 2:
                    QuanLy quanLy = searchPhong(inputID(), quanLyList);
                    if (quanLy != null){
                        quanLy.inThongTin();
                    }else {
                        System.out.println("Phong khong ton tai");
                    }
                    if (quanLy != null){
                        kiemTraPhong(quanLy);
                    }else {
                        System.out.println("Khong co khach trong phong");
                    }
                    break;
                case 3:
                    QuanLy kiemTraPhong = searchPhong(inputID(), quanLyList);
                        if (kiemTraPhong != null){
                            System.out.println("Nhap so ngay khach o khach san");
                            long soNgay = scanner.nextLong();
                            System.out.println("Gia tien phong la " + kiemTraPhong.thanhToan(soNgay));
                        }else {
                            System.out.println("Thanh toan khong thanh cong");
                        }
                    break;
                default:
                    System.out.println("Bye!!!!!!!!!!!");
                    exit = true;
                    break;
            }
        }while (!exit);
    }

    private static long inputID(){
        System.out.println("Nhap ID: ");
        return scanner.nextLong();
    }

    private static QuanLy searchPhong(long id, List<QuanLy> quanLyList){
            for (QuanLy quanLy : quanLyList) {
            if (quanLy.getId() == id) {
                return quanLy;
            }
        }
        return null;
    }


    private static QuanLy nhapDataPhong() {
        System.out.println("Nhap ID: ");
        long id = scanner.nextLong();

        System.out.println("Nhap So Tien: ");
        long giaTien = scanner.nextLong();

        System.out.println("Nhap So Khach: ");
        long khachHang = scanner.nextLong();

        System.out.println("Nhap loai phong: ");
        scanner.nextLine();
        String loaiPhong = scanner.nextLine();

        return new QuanLy(giaTien, loaiPhong, id, khachHang);
    }

    private static void addUser(List<QuanLy> quanLyList, QuanLy quanLy){
        quanLyList.add(quanLy);
    }
    private static void kiemTraPhong(QuanLy quanLy){
        boolean thanhCong = quanLy.kiemTraPhong();
        if (thanhCong){
            System.out.println(" ------ Phong co khach ------");
        }else {
            System.out.println("------ Phong khong co khach ------");
        }

    }
}
