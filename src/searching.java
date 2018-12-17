public class searching {

    static  void linear_search(int[] arr , int x ){
        int n = arr.length;
        int pointer = 0;
        int flag = 0;
        for (int i =0; i <n ; i++){
            if(arr[i] == x){
                pointer = i;
                flag = 1;

                break;
            }
        }

        if(flag == 0){
            System.out.print("item not available in the array ");
        }
        else if (flag == 1){
            System.out.printf("item available at %d position ", pointer);
        }
    }

    static  void binary_search(int[] arr , int x){

        int first = 0;
        int last = arr.length -1;

        int mid = 0;


        while (first <= last){
            mid = (first + last)/2;

            if (arr[mid] == x){
                System.out.printf("no founc at %d position" ,mid );
                break;
            }
            else  if (arr[mid] <x){
                first = mid +1;
            }
            else{
                last = mid -1;
            }

        }



    }

    public static  void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int x = 2;
         int y = 10;

         linear_search(arr,2);
         linear_search(arr, 10);

         binary_search(arr,2);
    }
}
