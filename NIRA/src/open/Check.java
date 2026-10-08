package open;
import data.Data;

public class Check {
    public static boolean exists(String id) {   // yes/no only
        return Data.CITIZENS.containsKey(id);
    }
}
