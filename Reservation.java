public class Reservation {
    private Guest guest;
    private Room room;
    private AdditionalFacility additionalFacility;
    private int nights;

    public Reservation(Guest guest, Room room, int nights, AdditionalFacility additionalFacility) {
        this.guest = guest;
        this.room = room;
        this.nights = nights;
        this.additionalFacility = additionalFacility;
    }

    public double calculateTotalCost() {
        return (room.getPrice() * nights) + additionalFacility.getFacilityCost();
    }

    public void showReservationDetails() {
        System.out.println(" ");
        System.out.println("===Detail Reservasi===");
        System.out.println("Guest: " + guest.getName());
        System.out.println("Phone: " + guest.getPhone());
        System.out.println("Email: " + guest.getEmail());
        System.out.println("Room Description: " + room.getDescription()); 
        System.out.println("Nights: " + nights);
        System.out.printf("Total Cost: Rp %.2f%n", calculateTotalCost());
    }
}
