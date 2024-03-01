import java.util.*;
class exception1{
    int a,b,n;
    public void cal(){
        Scanner s=new Scanner(System.in);
        int x[]=new int[5];
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("enter array elements");
        for (int i=0;i<=4;i++){
            x[i]=s.nextInt();
        }
//        int n;

        System.out.println("Enter any index for array printig");
        try{
            int c=a/b;
            System.out.println(c);
            System.out.println(x[n]);
        }
        catch (ArithmeticException e){
            System.out.println("Wrong index");
        }
        int d=a-b;
        System.out.println(d);

    }
}
public class excep_multi {
    public static void main(String[] args) {
        exception1 e1=new exception1();
        e1.cal();

    }
}
