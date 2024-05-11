import java.util.*;
public class forEachLoop {
    public static void main(String[] args){
       List<Integer> mylist=Arrays.asList(1,2,3,4,5,6,7);
       for (int eachElement:mylist){
        System.out.println("Element of mylist:"+eachElement);
       }
    }
}
