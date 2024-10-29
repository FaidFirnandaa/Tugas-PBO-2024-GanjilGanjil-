public class AdditionalFacility {
    private String breakfast;
    private String wifi;
    private String gymAccess;

    public AdditionalFacility(String breakfast, String wifi, String gymAccess) {
        this.breakfast = breakfast;
        this.wifi = wifi;
        this.gymAccess = gymAccess;
    }

    public double getFacilityCost() {
        double cost = 0;

        if (breakfast.equalsIgnoreCase("y")) {
            cost += 20000; // Sarapan 20.000
        }
        if (wifi.equalsIgnoreCase("y")) {
            cost += 10000; // WiFi 10.000
        }
        if (gymAccess.equalsIgnoreCase("y")) {
            cost += 15000; // Akses Gym 15.000
        }

        return cost;
    }
}
