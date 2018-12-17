import java.util.Scanner;

public class palindrome {
    static  void palindrome_no(int x){
        int temp = x;
        int c= 0;
        while(x>0){
            int a = x%10;
            x = x/10;
            c = c*10+ a;
        }

        if(c == temp){
            System.out.print("palindrome");
        }
        else{
            System.out.print("not palindrome");
        }

    }

    public static void main(String[] args){
        System.out.print("enter a no");

        Scanner input = new Scanner(System.in);

        int  A = input.nextInt();

        palindrome_no(A);

    }
}
