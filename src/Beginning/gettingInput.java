package Beginning;

import java.security.PublicKey;
import java.util.Scanner;

public class gettingInput {
    public static void main(String[] args){
        String personName = name();
        System.out.println("welcome " + personName);;


    }
    public static String name(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name");
        String name = s.nextLine();
        return name;
    }
}
