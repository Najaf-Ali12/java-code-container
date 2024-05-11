public class another_pattern_of_alphabets{
    public static void main(String[] args){
        for (char i='A'; i<'K'; i++){
            for (char j='A'; j<=i; j++){              //here i is  not assigned Alphabets but the OSCII values of Alphabets. 
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/*
draw an alphabetical pattern like following
A
AB
ABC
ABCD
ABCDE
ABCDEF
ABCDEFG
ABCDEFGH
ABCDEFGHI
ABCDEFGHIJ
 */