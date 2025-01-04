import java.util.Scanner;

public class ResetPassword {
    public static void main(String[] args) {

        final String username = "test";
        String password = "test", newPassword, resetPassword = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = scanner.next();

        System.out.print("Enter password: ");
        String inputPassword = scanner.next();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Logged in successfully");
        } else {
            System.out.println("Invalid username or password");
            System.out.println("Do you want to reset your password? (yes/no)");
            resetPassword = scanner.next();
        }

        if (resetPassword.equals("yes")) {
            System.out.print("Enter new password: ");
            newPassword = scanner.next();
            password = newPassword;
            System.out.println("Password reset successfully");
        } else if (resetPassword.equals("no")) {
            System.out.println("Goodbye!");
            System.exit(0);
        }


        System.out.println("Do you want to login again? (yes/no)");
        String loginAgain = scanner.next();

        if (loginAgain.equals("yes")) {
            System.out.print("Enter username: ");
            inputUsername = scanner.next();

            System.out.print("Enter password: ");
            inputPassword = scanner.next();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Logged in successfully");
            } else {
                System.out.println("Invalid username or password");
            }
        } else {
            System.out.println("Goodbye!");
        }

    }
}
