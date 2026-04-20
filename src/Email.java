import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String email;
    private int mailboxcapacity = 500;
    private String alternatemail;
    private int defaultPasswordlength = 8;
    private String companySuffix ="abccompany.com";



    // construtor to get fname & lnames
    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("EMAIL CREATED: " + this.firstname + " " + this.lastname);

        this.department = setDepartment();
        System.out.println("Department: "+ this.department);

        this.password = randomPassword(defaultPasswordlength);
        System.out.println("Your password is "+ this.password);

        email = firstname.toLowerCase()+ "." + lastname.toLowerCase() + "@" + department+"."+companySuffix;
        System.out.println("Your email : " + email);

    }

    // ask for the department

    private String setDepartment() {
        System.out.println("Department Codes\n1 for Sales\n2 for Development\n3for Accounting\n0 for none\nEnter department code:");
        Scanner scanner = new Scanner(System.in);
        int depchoice = scanner.nextInt();
        if (depchoice == 1){
            return "sales";
        } else if (depchoice == 2) {
            return "development";
        } else if (depchoice == 3) {
            return "accounting";
        }else {
            return "";
        }
    }
    private String randomPassword(int length){
        String passwordSet ="QWERTYUIOPASDFGHJKLZCXVBNM1234567890!@%_";
        char[] password = new char[length];

        for (int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }

    public  void setMailboxcapacity(int capacity){
        this.mailboxcapacity = capacity;
    }

    public void setAlternatemail(String altEmail) {
        this.alternatemail = altEmail;
    }
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxcapacity() {
        return mailboxcapacity;
    }

    public String getAlternatemail() {
        return alternatemail;
    }
    public String getPassword(){
        return password;
    }
}
