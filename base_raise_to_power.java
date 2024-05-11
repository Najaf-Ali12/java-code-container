import java.util.*;
public class base_raise_to_power{
    public static void main(String[] args){
        Scanner object=new Scanner(System.in);
        System.out.print("enter the base :");
        float base=object.nextFloat();
        System.out.print("enter the power on "+base+":");
        float power=object.nextFloat();
        System.out.println(base+" power "+power+" is equal to "+Math.pow(base,power));  
    }
} 
//Math.pow(base,exponent) is the syntax of writing power