package Day25Sept;

public class Marks {
    public static void checkGrade(double marks){
        int num = (int)marks/10;

        switch(num){
            case 9,10: System.out.println("Grade A");
            break;

            case 8: System.out.println("Grade B");
            break;

            case 7: System.out.println("Grade C");
            break;

            case 6: System.out.println("Grade D");
            break;

            case 5,4: System.out.println("Grade E");
            break;

            // case 4: System.out.println("Grade E");
            // break;

            default: System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        checkGrade(100);
        checkGrade(99);
        checkGrade(90);
        checkGrade(80);
        checkGrade(70);
        checkGrade(60);
        checkGrade(50);
        checkGrade(40);
        checkGrade(39);
    }
}
