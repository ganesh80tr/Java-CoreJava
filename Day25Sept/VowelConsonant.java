package Day25Sept;

public class VowelConsonant {
    public static void alphabet(char ch){
        ch = Character.toLowerCase(ch);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Given char is Vowel!");
        }
        else{
            System.out.println("Given char is not an Consonant!");
        }
    }
    public static void main(String[] args) {
        alphabet('A');
        alphabet('e');
        alphabet('y');
    }
}
