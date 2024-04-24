package Java_Buoi_3.KingDomGame;


import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    //Kingdom game.
    // Thiết kế code để tạo ra vương quốc Để tạo ra một vương quốc Vương quốc yêu tinh cần một vị vua yêu tinh, lâu đài yêu tinh và quân đội yêu tinh .
    // Tương tự tái cấu trúc code để tạo ra vương quốc Orc
    // Quân lính thì có áo giáp (Armor) , vũ khí (Weapon), Color
    // => thiết kế class sử dụng các tính chất của oop  Để khởi tạo ra các vương quốc . => in thông tin

    public static void main(String[] args){
        Kingdom kingdom = null;
        boolean exit = false;
        do {
            System.out.println("Vui long nhap lua chon cua ban: \n" +
                    "1. Nhap thong tin vuong quoc \n" +
                    "2. Kiem tra thong tin vuong quoc \n" +
                    "3. Them trang bi cho quan doi" +
                    "Nhap phim khac de thoat game!!!!");
            System.out.println("Lua chon cua ban:");
            int press = scanner.nextInt();
            switch (press){
                case 1:
                    System.out.println("Nhap so luong vuong quoc muon them");
                    int soluong = scanner.nextInt();
                    for (int i = 0; i < soluong; i++) {
                        System.out.println("Vuong quoc so: " + (i+1));
                        kingdom = inputDataKingDom();
                        kingdom.addKingDom(kingdom);
                    }
                    break;
                case 2:
                    kingdom.searchKingDom(inputID());
                    if (kingdom != null){
                        kingdom.inThongTinVuongQuoc();
                    }else {
                        System.out.println("Vuong quoc khong ton tai");
                    }
                    break;
                default:
                    System.out.println("Cam on ban da tham gia!!!!!!!!!!!!");
                    exit = true;
                    break;
            }

        }while (!exit);

    }

    private static long inputID(){
        System.out.println("Nhap ID cua ban: ");
        return scanner.nextLong();
    }

    private static Kingdom inputDataKingDom(){
        System.out.println("Nhap ID cua ban: ");
        long id = scanner.nextLong();

        System.out.println("Nhap ten vuong quoc cua ban: ");
        scanner.nextLine();
        String nameKingDom = scanner.nextLine();

        System.out.println("Nhap ten lau dai cua ban: ");
        String nameLauDai = scanner.nextLine();

        System.out.println("Nhap ten Duc Vua cua ban ");
        String king = scanner.nextLine();

        System.out.println("Nhap ten quan doi cua ban");
        String creps = scanner.nextLine();

        System.out.println("Nhap so luong quan doi cua ban");
        int slCreps = scanner.nextInt();

        System.out.println("Them ao giap cho quan doi khong");
        String armor = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Them vu khi cho quan doi khong");
        String weapon = scanner.nextLine();

        Kingdom kingdom = new Kingdom(id, nameKingDom, nameLauDai, king, creps, slCreps, armor, weapon);
        return kingdom;
    }

//    public static Item inputDataItem(){
//        System.out.println("Them ao giap cho quan doi khong");
//        String armor = scanner.nextLine();
//
//        System.out.println("Them vu khi cho quan doi khong");
//        String weapon = scanner.nextLine();
//
//        Item item = new Item(armor, weapon);
//        return item;
//    }
}
