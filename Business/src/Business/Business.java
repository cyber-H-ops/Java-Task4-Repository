package Business;
import open.Check;

public class Business {
    public static void register(String name, String ownerId) {
        System.out.println(Check.exists(ownerId)
                ? "BUSINESS: " + name + " REGISTERED"
                : "BUSINESS: REJECTED, OWNER NOT FOUND");
    }
}