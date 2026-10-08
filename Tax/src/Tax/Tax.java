package Tax;
import secret.Records;

public class Tax {
    public static void file(String id, int amount) {
        System.out.println("TAX: UGX " + amount + " filed for " + Records.get(id));
    }
}
