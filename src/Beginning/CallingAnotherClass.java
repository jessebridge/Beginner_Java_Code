package Beginning;

import java.util.Objects;
import java.util.Scanner;

public class CallingAnotherClass {
    public static void main(String[] name) {
        String PersonName = GetName();
        System.out.println("hi "+ PersonName);
        String GoodOrBad = PersonStatus(PersonName);
        System.out.println(GoodOrBad);

    }

    public static String GetName() {
        Scanner InputDevice = new Scanner(System.in);
        System.out.println("enter your name");
        String name = InputDevice.nextLine();
        return name;


    }
    public static String PersonStatus(String PersonName) {
        if (PersonName.equals("jesse")){
            String PersonType = "good bloke";
            return PersonType;
        }
        else{
            String PersonType = "not a good bloke";
            return PersonType;
        }
    }
}
