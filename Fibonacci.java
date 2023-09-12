
package treino_vetores;

import java.util.Scanner;


public class Fibonacci {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T,N;
        long a,b,c;
        a=0;
        b=1;
        c=0;
        long fib[] = new long[61];
        for (int i = 0; i < fib.length; i++) {
            fib[i]=c;
            a=b;
            b=c;
            c=a+b;
            
        }
        T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            N = scan.nextInt();
            System.out.println("Fib("+N + ") - "+fib[N]);
        }
    }
    
}
