import java.util.Scanner;
public class Table_Of_Entered_Number{
    public static void main(String[] args){
        Scanner table=new Scanner(System.in);
        System.out.print("Enter the number whose table you want to generate:");
        int Number=table.nextInt();
        for (int a=1; a<11; a++){
            System.out.println(Number+"x"+a+"="+a*Number);
        }
    }
}