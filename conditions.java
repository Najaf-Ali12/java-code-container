//created a java programme in which we take two numbers from user and also operation symbol and then will perform operations
import java.util.Scanner;
public class conditions{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);       //creates a new object of the class scanner
        System.out.print("enter the first number:");
        int number=scanner.nextInt();   //continuosuly use this to get more inputs
        System.out.print("enter the second number:");
        int n2=scanner.nextInt();
        System.out.print("enter the sign of operation:");
        char opt=scanner.next().charAt(0);    //word index is due to vscode  will accept any datatype and result value at 0
        System.out.println(number+"\n"+n2);     //printing both numbers on different lines
        if (opt=='+'){
            int add=number+n2;
            System.out.println(add);
        }
        else if (opt=='-'){
            int sub=Math.abs(number-n2);
            System.out.println(sub);
        }
        else if (opt=='*'){
            int mult=number*n2;
            System.out.println(mult);
        }
        else if (opt=='/'){
            float div=(number/n2);
            System.out.println(div);
        }
    }

    //classname objectname=new classname(System.in);   to create an object
    //Data type variable=object.keyword()   nextint is used to get 
    //in java single quote is for single characters and double quote is for strings(plural characters)
}