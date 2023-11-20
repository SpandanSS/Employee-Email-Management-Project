package emailApp;

public class Main {
    public static void main(String[] args) {

        //create new employee and generate email and random password
        Employee saby = new Employee("Saby", "Sachdeva");
        System.out.println(saby.showInfo());

        //using the setters & getters
        saby.changePassword("devsaby1");
        saby.setAlternateEmail("ssaabbyy5@gmail.com");
        saby.setMailboxCap(1000);
        System.out.println(saby.showInfo() + saby.getAlternateEmail());

    }
}
