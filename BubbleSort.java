//bubble sort algorithm
//Time - Complexity =  O(n^2);

public class bubsort {
    public static void bubbleSort(int[] arr , int len){
        for(int i = 0 ; i<len ; i++){
            for(int j = i+1 ; j<len ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
public static void main(String[] args){
    int[] ar  = {8,7,6,5,4,3,2,1};
    bubbleSort(ar , ar.length);
    for(int i = 0 ; i<ar.length ; i++){
        System.out.print(ar[i] + " ");
    }
    


}
}
