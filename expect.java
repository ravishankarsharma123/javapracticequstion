import java.util.*;
 class exception  {
    int a,b;
    public void cal(){
        Scanner s=new Scanner(System.in);
//        int x[]=new int[5];
        a=s.nextInt();
        b=s.nextInt();
        try{
            int c=a/b;
            System.out.println("answar is:- "+c);
        }
        catch (ArithmeticException e){
            System.out.println("invelid");
        }
        int d=a-b;
        System.out.println("Another value is "+d);
    }}
    public class expect{
        public static void main(String[] args) {
            exception e1=new exception();
            e1.cal();
        }
}
