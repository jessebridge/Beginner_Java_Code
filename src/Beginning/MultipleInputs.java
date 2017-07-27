package Beginning;

import java.util.Scanner;

public class MultipleInputs {
    public static void main(String[] args) {
        String name;
        Integer age;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("input your name");
        name = inputDevice.nextLine();
        System.out.println("input your age");
        age = inputDevice.nextInt();
        System.out.println("your name is " + name + " and your age is " + age + " years old");



    }
}
