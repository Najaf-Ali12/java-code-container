import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Scanner;
public class JavaDictionary{
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        Dictionary <String , Integer> dict=new Hashtable<>();
        dict.put("pakistan",1947);
        dict.put(Sc.nextLine(),Sc.nextInt());
        System.out.println(dict);
    }
}