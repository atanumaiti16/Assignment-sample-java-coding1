import java.util.Scanner;

public class armstrong {
    static void armstrong_no(int n){
        int temp = n;
        int c =0;

        while(temp>0){
            int i = temp%10;
             c = c + i*i*i;
             temp = temp/10;
        }

        if(c == n){
            System.out.print("yes it is an Armstrong no");
        }
        else{
            System.out.print("not a armstrong no");
        }
    }


    public static  void main(String[] args){
        System.out.print("enter a no");

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        armstrong_no(x);
    }
}
