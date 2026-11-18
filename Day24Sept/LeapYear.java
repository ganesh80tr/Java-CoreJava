package Day24Sept;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year % 400 == 0){
            return true;
        }
        else if(year % 100 != 0 && year % 4 == 0){
            return true;
        }
        else{
            return false;   
        }

        // Direct using operator 
        // return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0); 
    }

    public static void main(String[] args) {
        boolean res = isLeapYear(1900);
        System.out.println(res);
    }
}
