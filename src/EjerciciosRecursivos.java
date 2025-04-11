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

    public int sumaDigitos(int num) {
        if (num < 10) {
            return num;
        }else {
            int ultimoDigito = num % 10;
            int resta = num / 10;
            return ultimoDigito + sumaDigitos(resta);
        }
        
    }
}