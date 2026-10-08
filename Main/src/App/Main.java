package App;
import Business.Business;
import Tax.Tax;
import Passport.Passport;

public class Main {
    public static void main(String[] args) {
        Tax.file("CM900", 500000);
        Passport.issue("CM901");
        Business.register("Kampala Tech", "CM900");
        Business.register("Ghost Ltd", "XX000");
    }
}