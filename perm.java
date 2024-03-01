import java.util.*;
public class perm {
    public static void printperm(String str,String permutation){
        if (str.length()==0){
            System.out.println(permutation);
            return;
        }
        for (int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newstr=str.substring(0,1)+str.substring(i+1);
            printperm(newstr,permutation+currChar);
        }
    }

    public static void main(String[] args) {
        String str="abc";
        printperm(str," ");
    }
}
