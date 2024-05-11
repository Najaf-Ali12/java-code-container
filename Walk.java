import java.util.Scanner;
public class Walk {
    static void add(){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num1=obj.nextInt();
        System.out.print("enter a number:");
        int num2=obj.nextInt();
        System.out.println("sum is"+num1+num2);
    }
    public static void main(String[] args) {
        add();
    }
    
    
    
}
