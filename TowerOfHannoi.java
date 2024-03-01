public class TowerOfHannoi {
    public static void tower(int n,String str,String  helper, String dest){
        if(n==1){
            System.out.println(" Transfer disk from "+ n +" from " + str +" to "+dest);
            return;
        }
        tower(n-1,str,dest,helper);
        System.out.println(" Transfer disk from "+ n +" from " + str +" to " + dest);
        tower(n-1,helper,str,dest);
    }

    public static void main(String[] args) {
        int n=2;
        tower(n,"s","h","d");
    }
}
