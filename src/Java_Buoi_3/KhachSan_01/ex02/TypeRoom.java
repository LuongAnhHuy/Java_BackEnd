package Java_Buoi_3.KhachSan_01.ex02;

public enum TypeRoom {
    RoomA("A", 2000000), RoomB("B",1000000), RoomC("C",500);

    private long price;
    private String typeRoom;


    TypeRoom(String typeRoom, long price) {
        this.price = price;
        this.typeRoom = typeRoom;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public void displayTypeRoom() {
        System.out.println("Loại phòng: " + typeRoom) ;
    }
}
