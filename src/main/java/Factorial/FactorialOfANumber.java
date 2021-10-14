package Factorial;

import java.util.Scanner;

public class FactorialOfANumber {

    public static void main(String[] args) {
        System.out.print("Enter the number"+"\n");
        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        int factValue=1;
        for(int i=number;i>=1;i--){
            factValue*=i;
        }
        System.out.print("Factorial of "+number+" is "+factValue);
    }
    //We could have used recursion but there will be repetition in calculation, so its not feasible option
}
