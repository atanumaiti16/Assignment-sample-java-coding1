import java.lang.reflect.Array;
import  java.util.*;

public class fibonacci_series {
    static ArrayList<Integer> fibonacci(int s){
        int a = 0;
        int b = 1;

        ArrayList<Integer> x = new ArrayList<Integer>();
        int c=0;
        while(b<s){
            c = a+b;
            a = b;
            b = c;

            x.add(c);


        }
        x.remove(x.size()-1);
        return x;
    }

    public  static  void  main(String[] args){
        int I = 60;
        //fibonacci(I);

        ArrayList<Integer> op = fibonacci(I);

       System.out.print(op);
    }

}

