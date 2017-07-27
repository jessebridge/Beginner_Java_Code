package Beginning;

import java.util.Scanner;

public class MathematicsModulo {
    public static void main(String[] args) {
       int  FirstNumber = GetFirstNumber();
       int  SecondNumber = GetSecondNumber();
       System.out.println(" First number " + FirstNumber + " Second Number " + SecondNumber);
       int Calculation = CalculationMethod(FirstNumber, SecondNumber);
       System.out.println(Calculation);
    }
    public static int GetFirstNumber(){
        Scanner InputDevice = new Scanner(System.in);
        System.out.println("please enter a number");
        int FirstNumberInput = InputDevice.nextInt();
        return FirstNumberInput;


    }
    public static int GetSecondNumber(){
        Scanner InputDevice = new Scanner(System.in);
        System.out.println("Please enter a second number");
        int SecondNumberInput = InputDevice.nextInt();
        return SecondNumberInput;
    }
    public static int CalculationMethod(int FirstNumber, int SecondNumber){
        int TotalValue = FirstNumber % SecondNumber;
        return TotalValue;
    }
}

