public class fibonacci {
    public static void prtintfibo(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        a=b;
        b=c;

        System.out.println(c);
        prtintfibo(a,b,n-1);
    }

    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        prtintfibo(a,b,n-2);

    }
}
