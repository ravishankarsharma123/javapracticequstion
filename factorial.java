import java.util.*;
public class factorial {
    public static int printfact(int n){
        if(n==1||n==0){
            return 1;
        }
        int fact=printfact(n-1);
        int fact1=n*fact;
        return fact1;
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter nuber to find the fact:- ");
        int x= s.nextInt();
        int ans= printfact(x);
        System.out.println(ans);

    }
}
