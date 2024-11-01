public class StandardRoom extends Room {
    public StandardRoom(String roomNumber) {
        super(roomNumber, 200000, "Standard");
    }

    @Override
    public String getDescription() {
        return "Standard Room - Room Number: " + getRoomNumber() + ", Harga per malam: Rp " + getPrice();
    }
}
