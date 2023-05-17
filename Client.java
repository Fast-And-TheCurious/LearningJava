package JuneRevsion;

public class Client {

    private String fullname;
    private String email;
    private String password;
    private int clientTier;
    private int currentUsage;

    public static final int BRONZE_TIER = 0;
    public static final int SILVER_TIER = 1;
    public static final int GOLD_TIER = 2;

    public Client(String fullname, String email, String password, int clientTier, int currentUsage) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.clientTier = clientTier;
        this.currentUsage = currentUsage;
    }

    public double calculateCurrentBill() {
        double totalCost = 0;
        if (clientTier == BRONZE_TIER) {
            totalCost = 100 + (currentUsage * 0.80);
        } else if (clientTier == SILVER_TIER) {
            if (currentUsage > 300) {
                totalCost = 180 + (currentUsage - 300) * 0.75;
            }
        } else if (clientTier == GOLD_TIER) {
            if (currentUsage > 1000) {
                totalCost = 350 + (currentUsage - 1000) * 0.68;
            }
        }
        return totalCost;
    }

    public boolean isSecure() {

        boolean isLong = false, hasUpperCase = false, hasLowerCase = false, hasNumber = false;

        int len = password.length();
        if (password.length() > 8) {
            isLong = true;
        }
        for (int i = 0; i < len - 1; i++) {
//            if () {
//
//            }
        }

        return false;
    }

    public String getSurname() {
        int index = fullname.lastIndexOf(" ");
        String name = fullname.substring(index);
        return name;
    }

    public String toString() {

        String out = "USER: " + fullname + "\n ACCOUNT TIER: " + clientTier
                + "\n CURRENT ACCOUNT: " + currentUsage + "@R" + calculateCurrentBill()
                + "\n SECURE: " + isSecure();
        return out;
    }
}
