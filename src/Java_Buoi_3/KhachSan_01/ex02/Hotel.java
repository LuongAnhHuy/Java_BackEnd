package Java_Buoi_3.KhachSan_01.ex02;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public List<Room> getRoomsEmpty() {
        List<Room> roomEmpty = new ArrayList<Room>();
        for (Room room : rooms) {
            if(room.isEmpty())
                roomEmpty.add(room);

        }
        return roomEmpty;
    }

    public Room getRoomById(String roomNumber) {
        for (Room room : rooms) {
            if(room.getId().equals(roomNumber))
                return room;
        }
        return null;
    }

    public Booking getBookingByGuest(String customerID) {
        for (Booking booking : bookings) {
            if (booking.getCustomerID().equals(customerID))
                return booking;
        }
        return null;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
