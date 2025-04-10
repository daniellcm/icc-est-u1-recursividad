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

    public int getPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * getPotencia(base, exponente - 1);
    }

    public int sumaDigitos(int numero) {
        if (numero == 0) {
            return 0;
        }
        return numero % 10 + sumaDigitos(numero / 10);
    }
}