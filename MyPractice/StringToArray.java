import java.lang.*;
import java.util.*;
public class StringToArray {

    public static void main(String[] args) {
        String z="abcdefghijklmnopqrstuvwxyz";
        
        char[] ab = z.toCharArray();
        for (int i=0;i<ab.length;i++) {
            
            System.out.print(ab[i]+ " ");
        }
    }
}