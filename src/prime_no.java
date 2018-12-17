import java.util.Scanner;

public class prime_no {

    static  void prime(int n){
        if (n==0){
            System.out.print("zero is nethier prime neither non-prime");
        }
        if(n%2==0){
            System.out.print("prime");
        }
        else{
            System.out.print("not prime");

        }
    }

    public static void main(String[] args){
        System.out.print("Enter a no");

        Scanner input= new Scanner(System.in);

        int x = input.nextInt();

        prime(x);
    }
}
