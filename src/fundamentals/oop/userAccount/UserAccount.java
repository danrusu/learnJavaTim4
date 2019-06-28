package fundamentals.oop.userAccount;

/*

First name
Last name
Username
Email
Password
Credit - double

ID - number - is generated
 */
public class UserAccount {
    private String firstName;
    private String lastName;
    private String userName;
    private String emailName;
    private String password;
    private double credit;

    private int id;

    public UserAccount(String firstName,
                       String lastName,
                       String userName,
                       String emailName,
                       String password,
                       double credit) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.emailName = emailName;
        this.password = password;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "\nfirstName='" + firstName + '\'' +
                "\nlastName='" + lastName + '\'' +
                "\nuserName='" + userName + '\'' +
                "\nemailName='" + emailName + '\'' +
                "\npassword='" + password + '\'' +
                "\ncredit=" + credit +
                "\nid=" + id +
                "\n}";
    }

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

        // can access private UserAccount data (fields)
        System.out.println("Password: " + userAccount.password);

    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailName() {
        return emailName;
    }

    public String getPassword() {
        return password;
    }

    public double getCredit() {
        return credit;
    }

    public int getId() {
        return id;
    }
}
