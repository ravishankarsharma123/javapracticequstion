import java.util.*;
public class Stringrev {
    public static void printrev( String str, int idx ){
        if (idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printrev(str,idx-1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter String:- ");
        String str=s.nextLine();
        printrev(str,str.length()-1);
    }
}
