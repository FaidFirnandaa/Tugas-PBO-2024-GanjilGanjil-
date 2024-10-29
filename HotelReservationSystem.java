import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystem {
    private ArrayList<Room> rooms;
    private ArrayList<Guest> guests;
    private ArrayList<Reservation> reservations;

    public HotelReservationSystem() {
        rooms = new ArrayList<>();
        guests = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void makeReservation(Guest guest, Room room, int nights, AdditionalFacility additionalFacility) {
        Reservation reservation = new Reservation(guest, room, nights, additionalFacility);
        reservations.add(reservation);
        reservation.showReservationDetails();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelReservationSystem system = new HotelReservationSystem();

        // Input Kamar
        System.out.println("===Program Reservasi Hotel===");
        String roomType;
        Room room;

        while (true) {
            System.out.print("Tipe Kamar (Standard/Suite): ");
            roomType = scanner.nextLine();
            System.out.println(" ");

            if (roomType.equalsIgnoreCase("Standard")) {
                System.out.print("Masukkan Nomor Kamar: ");
                String roomNumber = scanner.nextLine();
                room = new StandardRoom(roomNumber);
                system.addRoom(room);
                break;
            } else if (roomType.equalsIgnoreCase("Suite")) {
                System.out.print("Masukkan Nomor Kamar: ");
                String roomNumber = scanner.nextLine();
                room = new SuiteRoom(roomNumber);
                system.addRoom(room);
                break;
            } else {
                System.out.println("Pilihan tidak tersedia, tolong inputkan data dengan benar.");
            }
        }

        System.out.print("Masukkan Nama Tamu: ");
        String guestName = scanner.nextLine();
        System.out.print("Masukkan Nomor Telepon Tamu: ");
        String phone = scanner.nextLine();
        System.out.print("Masukkan Email Tamu: ");
        String email = scanner.nextLine();

        Guest guest = new Guest(guestName, phone, email);
        system.addGuest(guest);

        System.out.print("Masukkan Jumlah Malam: ");
        int nights = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println(" ");
        System.out.println("===Tambahkan Fasilitas===");

        System.out.print("Sarapan (y/n): ");
        String breakfast = scanner.nextLine();
        System.out.print("WiFi (y/n): ");
        String wifi = scanner.nextLine();
        System.out.print("Akses Gym (y/n): ");
        String gymAccess = scanner.nextLine();

        AdditionalFacility facility = new AdditionalFacility(breakfast, wifi, gymAccess);
        system.makeReservation(guest, room, nights, facility);

        scanner.close();
    }
}
