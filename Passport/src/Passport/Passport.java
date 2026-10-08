package Passport;
import secret.Records;

public class Passport {
    public static void issue(String id) {
        System.out.println("PASSPORT: issued to " + Records.get(id));
    }
}

