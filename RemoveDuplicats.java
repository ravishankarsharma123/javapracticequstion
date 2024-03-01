import java.util.*;
public class RemoveDuplicats {
    public static boolean[] map=new boolean[26];
    public static void duplicats(String str,int idx,String nstr){
        if (idx==str.length()){
            return;
        }
        char currChar=str.charAt(idx);
        if (map[currChar-'a']){
            duplicats(str,idx+1,nstr);
        }else{
            nstr+=currChar;
            map[currChar-'a']=true;
            duplicats(str,idx+1,nstr);
        }
    }

    public static void main(String[] args){
        String str=" abbccda";
        duplicats(str,0," ");
    }
}
