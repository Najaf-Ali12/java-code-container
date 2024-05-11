import java.util.Scanner;
public class Strings{
    public static void main(String[] args){
        Scanner Object=new Scanner(System.in);
        System.out.print("enter the name:");
        String caste="alkhani";
        String name=Object.nextLine();         //getting string as input
        System.out.println(name.toUpperCase());   //making whole string in uppercase
        System.out.println(name.toLowerCase());   //MAKing whole string in lowercase
        String output = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println(output);  //MAKING only first letter of string capital 
        System.out.println(caste.indexOf("i"));   // to get the index of a specific letter
        System.out.println("length of "+name+" is "+name.length());        //to get the length of inputted string
        System.out.println(name.concat(caste));   //for string concatenation
        System.out.println(name+caste);          //for string conatenation
    }
}