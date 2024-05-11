import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Mango_season_Shopping{
    public static void main(String[] args){
        ArrayList<String> mangotypes=new ArrayList<String>();
        mangotypes.add("Chaunsa");
        mangotypes.add("Sindhri");
        mangotypes.add("Langro");
        mangotypes.add("Anwar Ratol"); 
    for (int index=0; index<mangotypes.size(); index++){
        Scanner input=new Scanner(System.in);
        System.out.print("enter 1 if "+mangotypes.get(index)+" is available in stock else 2:");
        int avail=input.nextInt();
        if (avail==2){
            System.out.println("Looks like the jinns got to them all! Try back later");
            continue;
        }
        System.out.println(mangotypes.get(index));
    }
}
}