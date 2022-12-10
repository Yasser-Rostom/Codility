// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
   
    boolean endingOneFound = false;
   
   
     if(N ==0){
         return 0;
     }
     else{
    String binary = Integer.toBinaryString(N);
    char [] array = binary.toCharArray();
   //System.out.print(binary);
    int current_gap = 0;
    int max_gap= 0;
   first: for(int i = 0; i< array.length; i++)
   { 
       if(array[i] == '1'){
              //  hasStartingOne = true;
       second: for(int j = i+1; j< array.length; j++){
                  //  System.out.printf("i is "+ i +" | J is "+ j + " | max gap "+ max_gap+"*** ");

            if(array[j] =='0'){
                    current_gap++;
                endingOneFound = false;
            //    System.out.print("current_gap is "+   current_gap+ "  in "+j+ "|| ");

            }
            else{
                endingOneFound = true;
                    //1001100000100000010
               // i = j;
                
                break second;
            }
        }
        
    }
    if(endingOneFound){
 if(max_gap> current_gap){
           current_gap = 0;
        //  System.out.print("max_gap if "+   max_gap+ "|| ");
       }
       else{
   
           max_gap = current_gap;
           current_gap = 0;
         //    System.out.print("max_gap  else "+   max_gap+ "|| ");
       }
       }
    }
   
    //   System.out.print("max_gap outside "+   max_gap+ "|| ");
     return max_gap;
   
   
   
   
     }
    }
}

