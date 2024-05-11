import java.util.*;
public class Finding_last_digit_of_number{
    public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    System.out.print("enter a number:");
    int num=obj.nextInt();
    int result=num%10;
    System.out.println("The last digit is:"+result);
    }
}