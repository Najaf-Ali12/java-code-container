import java.util.Scanner;
import java.util.Random;
public class Number {
    public static void main(String[] args) {
        Random rn = new Random();
        int num = rn.nextInt(100); 
        System.out.println(num);
        
        Scanner sc = new Scanner(System.in);
        int j = 4;
        for (int i = 1;i<=5;i++) {
            System.out.println("Guess a number:");
            int x = sc.nextInt();
            if (x == num) {
                System.out.println("Correctly Guessed");
                break;
            }
            else if (x > num){
            if ((x*100/num) <= 120) {
                System.out.println("High,very close");
            } else if ((x*100/num) <= 140) {
                System.out.println("Too high, close");
        }     else if ((x*100/num) <= 160) {
                System.out.println("Very High,away");}
                else if ((x*100/num) <= 180) {
                System.out.println("Very very high,far away");
        }       else if ((x*100/num) > 180) {
                System.out.println("Too very high,very far away");}}
            else if (x < num){
                if ((x*100/num) <= 20) {
                System.out.println("Too very low,very far away");
            }   else if ((x*100/num) <= 40) {
                System.out.println("very very low, far away");
        }       else if ((x*100/num) <= 60) {
                System.out.println("Very low,away");}
                else if ((x*100/num) <= 80) {
                System.out.println("too low, close");
        }       else if ((x*100/num) > 80) {
                System.out.println("low,very close");}}
            
            j = j - 1;
        }
    }
}