public class EjerciciosRecursivos {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }      

    public int sumaConsecitivos(int n) {
        if (n == 1) { 
            return 1; 
        }
        return n + sumaConsecitivos(n - 1); 
    }
    }