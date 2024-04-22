package Java_Buoi_3.KhachSan_01.ex02;

import java.util.Date;

public class Booking {
    private static int bookingID = 0;
    private String customerID;
    private String roomID;
    private int bookingDate;

    public Booking() {
        bookingID++;
    }

    public static int getBookingID() {
        return bookingID;
    }

    public static void setBookingID(int bookingID) {
        Booking.bookingID = bookingID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public int getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(int bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "customerID='" + customerID + '\'' +
                ", roomID='" + roomID + '\'' +
                ", bookingDate=" + bookingDate +
                '}';
    }
}
