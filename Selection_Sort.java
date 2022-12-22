//selection sort
//Time - complexity =  O(n^2).
public class selecSort {
    public static void selectionSort(int[] arr){
        int ind = -1;
        for(int i = 0 ;  i<arr.length -1 ; i++){
            int m = arr[i];
            //int ind = -1;
            for(int j = i ; j<arr.length ; j++){
                if(arr[j]<m){
                    m=arr[j];
                    ind = j;
                }
            }
            arr[ind] = arr[i];
            arr[i] = m;

        }
    }
    public static void main(String[] args) {
        int[] ar = {8,6,5,3,2,1,0};
        selectionSort(ar);
        for(int i  = 0; i<ar.length ; i++){
            System.out.print(ar[i] + " ");
        }
    }
}
