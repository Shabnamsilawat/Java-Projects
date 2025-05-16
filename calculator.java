import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        while (true){
            System.out.println("Enter the first number: ");
            double num1= sc.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = sc.nextInt();
            System.out.println("Enter the operation(+,-,*,/,%,^):");
            char operation= sc.next().charAt(0);
            double result = 0.0;
            switch (operation){
                case'+':
                result = num1+num2;
                break;
                case'-':
                result = num1-num2;
                break;
                case'*':
                result = num1*num2;
                break;
                case'/':
                result = num1/num2;
                break;
                case'%':
                result = num1%num2;
                break;
                case'^':
                result = Math.pow(num1,num2);
                break;
                default:
                System.out.println("Invalid operation");
                break;

            }
            System.out.println(num1 + " "+ operation+ " "+ num2+ " "+ "="+" "+result);
        }
    }
}
