public class insSort {
    public static void insertionSort(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && (arr[j]>temp)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

    }
    public static void main(String[] args) {
        int[] ar = {9,8,7,7,6,5,4,4,3,3,2,1};
        insertionSort(ar);
        for(int i = 0 ; i <ar.length ; i++){
            System.out.print(ar[i] + " ");
        }
    }
}
