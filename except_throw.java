import java.util.*;
class exception2 {
    int a,b;
    public void cal(){
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        try{
            int c=a/b;
            System.out.println(c);
            throw new ArithmeticException();
        }
        catch (ArithmeticException e){
            System.out.println("invalid Arithmetic ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array exception ");
        }
    }
}
public class except_throw {
    public static void main(String[] args) {
        exception2 e1=new exception2();
        e1.cal();
    }
}
