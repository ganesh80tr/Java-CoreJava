public class PersonDriver {
    public static void main(String[] args) {
        Person p1 = new Person("Ganesh", "10/01/2005");

        System.out.println(p1.getPassport());

        p1.createPassport();

        System.out.println(p1.getPassport().getPassportId());
        System.out.println(p1.getPassport().getType());
    }
}
