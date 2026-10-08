package secret;
import data.Data;

public class Records {
    public static String get(String id) {       // full details
        return Data.CITIZENS.get(id);
    }
}