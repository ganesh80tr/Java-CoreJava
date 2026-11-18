package Day25Sept;

public class IsUpperLowerCase {
    public static void alphabet(char ch){
        if(Character.isUpperCase(ch)){
            System.out.println("Character is Uppercase!");
        }
        else{
            System.out.println("Character is Lowercase!");
        }
    }
    public static void main(String[] args) {
        alphabet('a');
        alphabet('G');
    }
}
