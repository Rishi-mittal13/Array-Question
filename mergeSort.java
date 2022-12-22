//merge sort
//time-complexity =  n*log(n)

public class mergeSort {
    public void merge(int[] arr , int a , int b , int c){
        int a1 = (b-a)+1;//array 1 size .
        int a2 = c-b;//array 2 size .
        //int a3 = (c-a) +1;
        int arr1[]  =  new int[a1];
        int arr2[] = new int[a2];
        for(int i = 0  ;i <a1 ; i++){
            arr1[i] = arr[a+i];
        }
        for(int i = 0 ; i<a2 ; i++){
            arr2[i] = arr[b+i+1];
        }
        int i = 0 ;//for arr1.
        int j = 0 ;//for arr2
        int k = a ;//for result arr.
        while(i<a1 && j<a2){
            if(arr1[i]<=arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
            }
            else{
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<a1){
            arr[k]= arr1[i];
            i++;
            k++;
        }
        while(j<a2){
            arr[k] = arr2[j];
            j++;
            k++;
        }

    }
    public  void mergesort(int[] arr , int p , int q){
        if(p<q){
            int m = (p+q)/2;//make sure operator precedence is right .  
            mergesort(arr,p,m);//recursion call 
            mergesort(arr,m+1,q);
            merge(arr,p,m,q);
        }
    }
    public static void main(String[] args){
        mergeSort m1 =  new mergeSort();
        int arr[] =  {9,7,6,5,4,2,3,5,7,134,56,25,89,0,6};
        m1.mergesort(arr,0,arr.length-1);
        for(int i  =0 ;  i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
