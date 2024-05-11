public class numericPattern{
    public static void main(String[] args){
        for (int i=1; i<10; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/*
create a pattern like this
1
12  
123 
1234
12345
123456
1234567
12345678
123456789
 */