public class insertion_short {
    public static void printarray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={9,1,8,2,7,3,6,4};
        for (int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        printarray(arr);
    }
}
