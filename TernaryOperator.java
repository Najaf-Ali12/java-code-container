import java.util.*;
public class TernaryOperator{
public static void main(String[] args){
    int eligibility=18;
    System.out.print("Enter the age:");
    Scanner obj=new Scanner(System.in);
    int num=obj.nextInt();
    String result=(num>=eligibility)? "eligible":"ineligible";
    System.out.println(result);
    obj.close();
    }
}
/*Ternary operators are also known as short hand if/else. It can be used to replace multiple lines of
code with a single line,and is most often used to replace simple if else statements: its syntax is
variable = (condition) ? expressionTrue :  expressionFalse;*/
