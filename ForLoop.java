import java.util.Scanner;
public class ForLoop{
    public static void main(String[] args){
        Scanner cl=new Scanner(System.in);
        System.out.print("enter the number of times you want to run the loop:");
        for (int a=cl.nextInt(); a>0; a--){ 
        System.out.println("a");
        }
    }
    
}