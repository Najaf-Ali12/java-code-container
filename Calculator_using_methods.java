import java.util.Scanner;
public class Calculator_using_methods{
    public float Add(float n1,float n2){
        return n1+n2;
    }
    public float Subtraction(float n1,float n2){
       return n1-n2;
    }
    public float Multiplication(float n1,float n2){
        return (n1*n2);
    }
    public float Divison(float n1,float n2){
        return(n1/n2);
    }
    public static void main(String[] args){
        try{
        Scanner calculator=new Scanner(System.in);
        System.out.print("Enter first number:");
        float num1=calculator.nextFloat();
        System.out.print("Enter second number:");
        float num2=calculator.nextFloat();
        System.out.print("1:Add two numbers\n2:Subtract two numbers\n3:Multiply two numbers\n4:Divide two numbers\nEnter 1,2,3 or 4:");
        int ask=calculator.nextInt();
        Calculator_using_methods obj=new Calculator_using_methods();
            if (ask==1){   //created another object obj because to call the methods of public class
                float result=obj.Add(num1,num2);     //we have to create an object,but for static we donot need object
                System.out.println("The Addition of two numbers is:"+result);
            }
            else if (ask==2){
                float result=obj.Subtraction(num1,num2);
                System.out.println("The subtraction of two numbers is:"+result);
            }
            else if (ask==3){
                float result=obj.Multiplication(num1,num2);
                System.out.println("The multiplication of two numbers is"+result);
            }
            else if (ask==4){
                float result=obj.Divison(num1,num2);
                System.out.println("The Divison of two numbers is"+result);
            }
            else{
                System.out.println("INVALID CHOICE");

        }
    }
    catch (Exception e){
        System.out.println("ENTER ONLY NUMBERS:");
    }
}
}