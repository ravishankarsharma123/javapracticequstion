import java.util.*;
public class copy1 {
    int a,b;
    copy1(){}
    copy1(int x,int y){
        a=x;
        b=y;
    }
    copy1(copy1 p){
        a=p.a;
        b=p.b;
    }
    void sum(){

        int c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        copy1 c1=new copy1();
        c1.sum();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two valuse");
        int x=s.nextInt();
        int y=s.nextInt();
        copy1 c2=new copy1(x,y);
        c2.sum();
        copy1 c3=new copy1(c2);
        c3.sum();


    }
}
