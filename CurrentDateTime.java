import java.time.LocalDateTime;
public class CurrentDateTime{
    public static void main(String[] args){
       LocalDateTime myObj=LocalDateTime.now();
       System.out.println(myObj);

    }
}
//to get both current time and current date we have to import LocalDateTime