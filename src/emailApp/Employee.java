package emailApp;
import java.util.*;
public class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private String companySuffix = "xyzcompany.com";
    private String password;
    private String department;
    private int mailboxCap = 500;
    private String alternateEmail;

    //Constructor to receive first and last name and set department
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = randomPassword(8);
        email = firstName.toLowerCase()+lastName.toLowerCase()+ "@" + department + "." + companySuffix;
        //System.out.println("Email created: " + this.firstName + " " + this.lastName + "\nDepartment: " + department +"\nYour email: " + email + "\nYour password: " + this.password);
    }

    //Ask for the department
    private String setDepartment(){
        System.out.println("New employee: " + firstName + "\nEnter the department:\n1 Sales\n2 Accounting\n3 Development\n4 none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        switch(depChoice){
            case 1:
                return "sales";
            case 2:
                return "acct";
            case 3:
                return "dev";
            default:
                return " ";
        }
    }
    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i<length;i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }
    //Set mailbox capacity
    public void setMailboxCap(int cap){
        this.mailboxCap = cap;
    }
    //Set alt email address
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    //Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCap(){return mailboxCap;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){ return password;}

    public String showInfo(){
        return "\nDisplay Name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nDefault password: " + password +
                "\nMailbox capacity: " + mailboxCap + "mb\n";
    }

}
