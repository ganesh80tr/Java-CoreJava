public class Person {
    private String name;
    private String dob;
    private Passport passport;

    public Person(String name, String dob){
        this.name = name;
        this.dob = dob;
    }

    //Helper Method
    //Lazy Instatiation

    public void createPassport(){
        passport = new Passport("123456789hfhg", "Normal");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDob(){
        return dob;
    }

    public void setDob(String dob){
        this.dob = dob;
    }

    public Passport getPassport(){
        return passport;
    }

    public void setPassport(Passport passport){
        this.passport = passport;
    }
}
