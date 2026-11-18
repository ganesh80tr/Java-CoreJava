package Day25Sept;

public class Switch {
    public static void check(char ch){
        int num = 0;

        if(Character.isLetter(ch)){
            if(Character.isUpperCase(ch)){
                num = 1;
            }
            else if(Character.isLowerCase(ch)){
                num = 2;
            }
        }
        else if(Character.isDigit(ch)){
            num = 3;
        }
        else{
            num = 0;           
        }

        switch (num) {
            case 1: System.out.println("Uppercase!");
                break;
            
            case 2: System.out.println("Lowercase!");
                break;

            case 3: System.out.println("Number!");
                break;

            default: System.out.println("Invalid");
                break;
        }
    }

    public static void main(String[] args) {
        check('A');
        check('c');
        check('1');
        check('@');
    }
}
