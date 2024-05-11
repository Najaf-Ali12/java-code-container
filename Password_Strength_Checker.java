import java.util.Scanner;
public class Password_Strength_Checker{
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the password to check its strength:");
        String password=Sc.nextLine();
        if (password.length()>=8){
            for (int i=0; i<password.length(); i++){
                String each=password.substring(i);
                if (each.toUpperCase()==each){
                   System.out.println("Strong Password:");
    }
}
        }
    }
}