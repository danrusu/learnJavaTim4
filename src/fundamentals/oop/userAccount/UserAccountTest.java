package fundamentals.oop.userAccount;

public class UserAccountTest {
    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount(
                "Dan",
                "Rusu",
                "danginkgo",
                "danginkgo@yahoo.com",
                "1234",
                100.55
        );

        System.out.println(userAccount);

        // needs getter to access private UserAccount data (fields)
        System.out.println("Password: " + userAccount.getPassword());

    }
}
