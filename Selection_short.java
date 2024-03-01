public class Selection_short {
    public static void printarray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={9,1,8,2,7,3,6,4};
        for (int i=0;i<arr.length;i++){
            int smallest =i;
            for (int j=1+i;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
                int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
            }
        }
        printarray(arr);
    }
}
