import java.util.*;
public class Bubble_short {
    public static void printarray(int arr[]){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={7,3,1,9,6,4,2};
        for (int i=0; i<arr.length-1;i++){
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printarray(arr);
    }
}