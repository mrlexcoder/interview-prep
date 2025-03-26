package LoopsInjava;

public class Javaforloop {
    public static void main(String[] args) {
        String Name = "Amit Sandhu";
        int len = Name.length();
        for(int Pos = 0; Pos < Name.length(); Pos++) {
            char ch = Name.charAt(Pos);
            if (ch == 'a' || ch == 'i') {
                System.out.println("Vowels are " + ch);
            } else {
                System.out.println("Consonants are " + ch);
            }
        }
    }
}