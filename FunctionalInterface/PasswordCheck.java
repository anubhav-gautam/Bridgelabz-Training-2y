package FunctionalInterface;

interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*");
    }
}

public class PasswordCheck {
    public static void main(String[] args) {
        String pass = "StrongP@ss1";
        System.out.println("Password Strong: " + SecurityUtils.isStrongPassword(pass));
    }
}
