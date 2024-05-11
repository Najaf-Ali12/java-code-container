import java.util.*;     //Scanner class can also be imported like this
public class factorial_using_while_loop{
    public static void main(String[] args){
        int factorial=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number whose factorial you want to get:");
        int number=sc.nextInt();
        int test_num=number;     //assigned number to test_num because of getting number in last line
        while (test_num>0){
            factorial*=test_num;
            test_num--;           //subtract one from test_num each time the loop runs
        }
        System.out.println("the factorial of "+number+" is "+factorial);


    }
}