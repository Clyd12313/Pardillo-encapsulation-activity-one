public class Main {
    public static void main(String[] args) {
        Person person = new Person("Clyd", "Paalisbo", "Pardillo");
        person.setAge(19);
        person.setBirthYear(2004);
        person.setBirthMonth(5);
        person.setBirthDay(4);
        person.setAddress("Sudlon Lahug Cebu City");

        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Middle Name: " + person.getMiddleName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Birthday: " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());
        System.out.println("Address: " + person.getAddress());
    }
}
