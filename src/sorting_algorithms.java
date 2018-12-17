import java.security.PublicKey;
import java.util.ArrayList;

public class sorting_algorithms {

    static void Bubble_Sort(int[] A){
       int  n = A.length;
        for(int i=0; i <n-1;i++){
            for (int j = 0 ; j<n-i-1; j++ ){

                if (A[j] > A[j+1]){
                    int temp = A[j];

                    A[j]= A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        for (int i = 0; i<n;i++){
            System.out.print(A[i]);

        }



    }

    static void selection_sort(int[] A ){

        int n = A.length;

        for(int i = 0; i<n;i++){

            int min = i;

            for(int j = i+1; j<n;j++){

                if(A[j]<A[ min]){
                    min = j;
                }

            }

            int temp = A[i];

            A[i]= A[min];
            A[min]= temp;
        }

        for(int i = 0; i<n;i++){
            System.out.print(A[i]);
        }

    }

    static  void insertion_sort(int[] arr){
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        for (int i =0 ; i<n; i++){
            System.out.print(arr[i]);

        }

    }

    public static  void main(String[] args){
        int[] arr = {5,4,2,3,8,0};

        Bubble_Sort(arr);
        System.out.print(" ");
        selection_sort(arr);
        System.out.print(" ");

        insertion_sort(arr);
    }
}
