// you can also use imports, for example:

/*A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].*/



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

