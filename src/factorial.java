import java.util.Scanner;

public class factorial {
    static void factorial_no(int n){
        int op = 1;

        for (int i =1;i>n;i++){
            op = op*i;
        }
        System.out.print(op);
    }

    public  static  void main(String[] args){
        System.out.print("enter a no");
        Scanner input = new Scanner(System.in);

        int A= input.nextInt();

        factorial_no(A);
    }

}
