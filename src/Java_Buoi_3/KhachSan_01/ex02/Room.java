package Java_Buoi_3.KhachSan_01.ex02;

public class Room {
    private String id;
    private TypeRoom typeRoom;
    private boolean empty;

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", typeRoom=" + typeRoom.getTypeRoom() +
                '}';
    }


    public Room(String id, TypeRoom typeRoom) {
        this.id = id;
        this.typeRoom = typeRoom;
        this.empty = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TypeRoom getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(TypeRoom typeRoom) {
        this.typeRoom = typeRoom;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
