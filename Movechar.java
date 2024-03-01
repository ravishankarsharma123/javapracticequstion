public class Movechar {
    public static void moveall(String str,int idx,int count,String nstring){
        if(idx==str.length()){
            for (int i=0;i<count;i++){
                nstring+='x';
            }
            System.out.println(nstring);
            return ;
        }
        char currChar=str.charAt(idx);
        if (currChar=='x'){
            count++;
            moveall(str,idx+1,count,nstring);
        }
        else {
            nstring+=currChar;
            moveall(str,idx+1,count,nstring);
        }

    }
    public static void main(String[] args) {
        String str="abcdefghiklmxxpnopqrstuvwxyz";
        moveall(str,0,0," ");
    }
}
