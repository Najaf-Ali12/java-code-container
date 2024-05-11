import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        int factorial_number=1;
        Scanner factor=new Scanner(System.in);
        System.out.print("enter the number whose factorial you want to find:");
        int num=factor.nextInt();   //created num out of for loop so that can be accessed in last line which is out of for loop
        for (int i=num; i>0; --i){           //to write i-=1 in java=i-- or --i
            factorial_number=i*factorial_number;    //x+=5 means x=x+5 in java
        }
        System.out.println("the factorial of " +num+ " is "+factorial_number);
    }
    }
