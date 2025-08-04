import java.util.Scanner;

public class Calculator {
    static  void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    static  void subract(int num1,int num2){
        System.out.println(Math.abs(num1-num2));
    }
    static  void mul(int num1,int num2){
        System.out.println(num1*num2);
    }

    static  void div(int num1,int num2){
        System.out.println(num1/num2);
    }

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("It's just a calculator");
       System.out.println("To work with calculator: enter any operation symbols");
       System.out.println("To exit out from calculator enter any alphabet");
       while(true){
               System.out.println("Enter the operation to perform:");
               char ch = scan.next().charAt(0);
               if(Character.isAlphabetic(ch)){
                   break;
               }
               System.out.println("Enter the two numbers:");
               int num1 = scan.nextInt();
               int num2 = scan.nextInt();
           switch(ch){
                   case '+':
                       add(num1,num2);
                       break;

                   case '-':
                       subract(num1,num2);
                       break;
                   case '*':
                       mul(num1,num2);
                       break;

                   case '/':
                       div(num1,num2);
                       break;

               default:
                   System.out.println("Enter valid operation....");

           }

       }
    }
}

