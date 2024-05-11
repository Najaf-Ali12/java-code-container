import java.util.Scanner;
public class Methods_in_java {
    static void add(){
        Scanner Obj=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num1=Obj.nextInt();
        System.out.print("enter a number:");
        int num2=Obj.nextInt();
        System.out.println("sum is"+(num1+num2));
    }
    public static void main(String[] args) {
        add();
    }
}
