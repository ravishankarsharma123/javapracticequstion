import java.util.*;
public class Power {
    public static int printpower(int x ,int n){
//        if (n%2==0){
//            return (printpower(x,n/2)*printpower(x,n/2));
//
//        }else {
//             return (printpower(x,n/2)*printpower(x,n/2)*x);
//
//        }


//    }
        if (x==0){
            return 0;}
        if (n==0){
            return 1;}
        int p=printpower(x,n-1);
        int power=x*p;
        return power;

    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter values:- ");
        int x=s.nextInt();
        System.out.print("Enter power:- ");
        int n= s.nextInt();
        int sum=printpower(x,n);
        System.out.println(sum);
    }
}
