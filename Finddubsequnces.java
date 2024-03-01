public class Finddubsequnces {
    public static void printsubsequences(String str,int idx,String nstr){
        if (idx==str.length()){
            System.out.println(nstr);
            return;
        }
        char currChar=str.charAt(idx);
        printsubsequences(str,idx+1,nstr+currChar);
        printsubsequences(str,idx+1,nstr);

    }

    public static void main(String[] args) {
        String str="absc";
        printsubsequences(str,0," ");
    }
}
