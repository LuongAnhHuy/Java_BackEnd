package Java_Buoi_3.KhachSan_01;

import Java_Buoi_3.KhachSan_01.ex02.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        hotel.getRooms().add(new Room("A01", TypeRoom.RoomA ));
        hotel.getRooms().add(new Room("B01", TypeRoom.RoomB ));
        hotel.getRooms().add(new Room("C01", TypeRoom.RoomC ));
        hotel.getRooms().add(new Room("A02", TypeRoom.RoomA ));
        hotel.getRooms().add(new Room("B02", TypeRoom.RoomB ));
        hotel.getRooms().add(new Room("C02", TypeRoom.RoomC ));

        System.out.println(hotel.getRooms());

       while (true) {
           System.out.println("Chào mừng bạn!");
           System.out.println("Dịch vụ: \n" +
                   "1. Đặt phòng\n" +
                   "2. Trả phòng\n");
           int choice = scanner.nextInt();
           scanner.nextLine();
           switch (choice) {
               case 1:
                   bookHotel(hotel);
                    break;
                case 2:
                    checkoutHotel(hotel);
                    break;
                default: break;
           }

       }
    }

    public static void bookHotel(Hotel hotel) {
        System.out.println("Các phòng còn trống\n");
        List<Room> roomsEmpty = hotel.getRoomsEmpty();
        if (roomsEmpty.isEmpty()) {
            System.out.println("\nHết phòng");
            return;
        }
        for (Room room : roomsEmpty) {
            System.out.println(room);
        }

        System.out.println("Thông tin khách hàng: ");

        Guest guest = new Guest();
        guest.setId(scanner.nextLine());
        guest.setName(scanner.nextLine());


        System.out.println("Phòng muốn chọn: ");
        String idRoom = scanner.nextLine();
        Room room = hotel.getRoomById(idRoom);
        room.setEmpty(false);

        Booking booking = new Booking();
        booking.setRoomID(room.getId());
        booking.setCustomerID(guest.getId());
        System.out.println("Ngày đặt phòng: ");
        booking.setBookingDate(scanner.nextInt());


        hotel.getBookings().add(booking);
        System.out.println(booking);
    }

    public static void checkoutHotel(Hotel hotel) {
        System.out.println("Nhập mã khách:\n");
        String customerID = scanner.nextLine();
        Booking booking = hotel.getBookingByGuest(customerID);
        if (booking == null) {
            System.out.println("Khách không tồn tại!");
            return;
        }
        System.out.println("Nhập ngày checkout:");
        int checkoutDay = scanner.nextInt();

        hotel.getRoomById(booking.getRoomID()).setEmpty(true);
        System.out.println();
        System.out.println("Tiền phòng: " +
                hotel.getRoomById(booking.getRoomID()).getTypeRoom().getPrice() * (checkoutDay - booking.getBookingDate()) + "VND");


    }
}