import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String str;
        for(int i=0;i<T;i++){
            str = scan.next();
            for(int j=0;j<str.length();j++){
                if(j%2 == 0){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.print(" ");
            for(int j=0;j<str.length();j++){
                if(j%2 == 1){
                    System.out.print(str.charAt(j));   
                }
            }
            System.out.println();
        }
        
    }
}