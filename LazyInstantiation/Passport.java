public class Passport {
    private String passportId;
    private String type;

    public Passport(String passportId, String type){
        this.passportId = passportId;
        this.type = type;
    }

    public String getPassportId(){
        return passportId;
    }

    public void setPassportId(String passportId){
        this.passportId = passportId;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type ;
    }
}
