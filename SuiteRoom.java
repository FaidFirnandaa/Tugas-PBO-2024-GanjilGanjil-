public class SuiteRoom extends Room {
    public SuiteRoom(String roomNumber) {
        super(roomNumber, 400000, "Suite");
    }

    @Override
    public String getDescription() {
        return "Suite Room - Room Number: " + getRoomNumber() + ", Harga per malam: Rp " + getPrice();
    }
}
