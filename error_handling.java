import java.util.*;
public class error_handling{
    public static void main(String[] args){
        Scanner object=new Scanner(System.in);
        try{
            int number=object.nextInt();
        }
        catch(Exception e){
            System.out.println("enter an integer not any other type");
        }
    }

}