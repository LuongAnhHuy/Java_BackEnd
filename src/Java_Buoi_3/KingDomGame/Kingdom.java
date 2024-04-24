package Java_Buoi_3.KingDomGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kingdom extends Item {
    long id;
    String nameKingDom;
    String nameLauDai;
    String king;
    String creps;
    int slCreps;
    List<Kingdom> kingdoms = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Kingdom(long id, String nameKingDom, String nameLauDai, String king, String creps, int slCreps, String armor, String weapon) {
        super(armor, weapon);
        this.id = id;
        this.nameKingDom = nameKingDom;
        this.nameLauDai = nameLauDai;
        this.king = king;
        this.creps = creps;
        this.slCreps = slCreps;
        this.armor = armor;
        this.weapon = weapon;
    }

    public long getId() {
        return id;
    }

    public void inThongTinVuongQuoc() {
        System.out.println("Ten vuong quoc: " + nameKingDom
                + "\nTen lau dai: " + nameLauDai
                + "\nTen Duc Vua la: " + king
                + "\nTen quan doi la: " + creps
                + "\nSo luong quan doi la: " + slCreps
                + "\nTrang thai ao giap: " + armor
                + "\nTrang thai ao giap: " + weapon);
    }

    public void addKingDom(Kingdom kingdom) {
        kingdoms.add(kingdom);
    }

    public Kingdom inputDataKingDom() {
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

        Kingdom kingdom = new Kingdom(id, nameKingDom, nameLauDai, king, creps, slCreps, armor, weapon);
        return kingdom;
    }

    public Kingdom searchKingDom(long id) {
        for (Kingdom kingdom : kingdoms) {
            if (kingdom.getId() == id) {
                return kingdom;
            }
        }
        return null;
    }
}

