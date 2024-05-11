
public class typeconversion{
    public static void main(String[] args){
        int a=87;
        float b=56.6f;
        Double c=89.5949393;
        char e='D';  //in java char(single) is stored in single quotation mark
        String d="pakistan";      //in java string(plural charters) is stored in double quotations
        float news= a;
        boolean myBool = true;       
        String bool= String.valueOf(myBool);  //from boolean to string
        String next= String.valueOf(b);
        System.out.println("from int to float "+news);
        System.out.println("from float to string "+next);
        //to convert any dtype in string the syntax is "String variable=String.valueof(dtype variable)"
    
    }

}