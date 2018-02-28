package Funcao_Ordem_Superior;

public class RecursionError {

    public static void main(String[] args) {
        /* os dois métodos - fib and fibWithTailRec -
         * irá retorna java.lang.StackOverflowError.
         */
        System.out.print(fib(10000));
        System.out.print(fibWithTailRec(10000));

        System.out.print(fibWithLoop(10000));

    }
    public static int fib(int n) {
        if (n > 1) return fib(n - 1) + fib(n - 2);
        else return n;
    }

    public static int fibWithTailRec(int n) {
        if (n > 1) return fibIter(1, 1, n - 2);
        else return n;
    }

    private static int fibIter(int prev, int current, int n) {
        if (n == 0) return current;
        else return fibIter(current, prev + current, n - 1);
    }

    //tail recursive function 'fibWithTailRec' can be represented as a loop.
    public static int fibWithLoop(int n) {
        if (n <= 1) return n;

        int i = 2;
        int prev = 1;
        int current = 1;
        while (i < n) {
            int next = prev + current;
            prev = current;
            current = next;
            i += 1;
        }
        return current;
    }


}
