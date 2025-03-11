import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexEmailValidation {
    public static void main(String[] args) {
        String email = "test@example.com";
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println(email + " is a valid email.");
        } else {
            System.out.println(email + " is not a valid email.");
        }
    }
}