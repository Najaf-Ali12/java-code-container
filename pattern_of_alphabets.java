public class pattern_of_alphabets{
    public static void main(String[] args){
        for (char i='A'; i<'K'; i++){
            for (int j='A'; j<=i; j++){              //here i is  not assigned Alphabets but the OSCII values of Alphabets. 
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*
Create pattern like this
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
HHHHHHHH
IIIIIIIII
JJJJJJJJJJ
 */