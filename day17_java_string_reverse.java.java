import java.io.*;
import java.util.*;

public class day17_Java_String_Reverse_Palindrom {
    
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrom = true;
         for(int i=0;i<A.length();i++){
             if(!A.substring(i,i+1).equals(A.substring(A.length()-1-i, A.length()-i))){
                 isPalindrom = false;
                 break;
             }
         }
         if(isPalindrom){
             System.out.println("Yes");
         }else{
             System.out.println("No");
             
         }

    }
}
