import java.util.*;

public class Atm_machine_password_checker {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        char opt;
        int password = 1020;
        int user_input_pin;

        do{
            System.out.println("WELCOEM TO MEEZAN BANK");
            for (int i=0; i<3; i++){
            System.out.print("Enter your PIN");
            user_input_pin = scn.nextInt();
            if (user_input_pin == password) {
                System.out.println("01: Check Balance");
                System.out.println("02: Withdraw Balance");
                System.out.println("03: Transfer Balance");
                break;
            } else {
                System.out.println("INVALID PASSWORD");
                System.out.println("CARD JIS KA HAY USE WAPIS DE AO");
            }}
            break;
        }while(true);
    }
}
