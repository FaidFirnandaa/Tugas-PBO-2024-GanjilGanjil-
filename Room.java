public class Room {
    private String roomNumber;
    private double price;
    private String roomType;

    public Room(String roomNumber, double price, String roomType) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.roomType = roomType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getRoomType() {
        return roomType;
    }
}
