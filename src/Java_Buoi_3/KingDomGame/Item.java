package Java_Buoi_3.KingDomGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Item {
    private Scanner scanner = new Scanner(System.in);
    List<Item> items = new ArrayList<>();
    String armor;
    String weapon;

    public Item(String armor, String weapon) {
        this.armor = armor;
        this.weapon = weapon;
    }


    public void addItem(Item item) {
        items.add(item);
    }


}
