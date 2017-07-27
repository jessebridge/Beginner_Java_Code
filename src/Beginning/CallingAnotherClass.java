package Beginning;

import java.util.Scanner;

public class CallingAnotherClass {
    public static void main(String[] name) {
        String PersonName = GetName();
        System.out.println("hi "+ PersonName);

    }

    public static String GetName() {
        Scanner InputDevice = new Scanner(System.in);
        System.out.println("enter your name");
        String name = InputDevice.nextLine();
        return name;


    }
}
