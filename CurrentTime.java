import java.time.LocalTime;
public class CurrentTime{
    public static void main(String[] args){
        LocalTime obj=LocalTime.now();
        System.out.println(obj);
    }
}
//to get current time we have to import LocalTime.its format is hour:min:sec:nanosecond