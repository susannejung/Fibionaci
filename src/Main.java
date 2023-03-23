public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacciIterative(1));

        for(int i=0;i<100;i++)
            System.out.print(fibonacciIterative(i)+" ");

        System.out.println();
        for(int i=0;i<10;i++)
            System.out.print(fibonacciRekursiv(i)+" ");
    }


    public static int fibonacciIterative(int n) {
        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static int fibonacciRekursiv(int n) {
        if(n <= 1)
            return n;
        else
            return fibonacciRekursiv(n-1)+fibonacciRekursiv(n-2);
    }


}












