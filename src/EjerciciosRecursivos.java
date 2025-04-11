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

    /*
     * Escribe un metodo recursivo que imprima los numeros desde n hasta 1
     * de forma descendente, separados por espacios
     */
    public void imprimirDescendente(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        imprimirDescendente(n - 1);
    }

    /*
     * Crea una funcion recursiva llamada reverso que reciba un numero
     * entero positivo n y devuelva su numero invertido.
     * Por ejemplo: si se recive 1234, la funcion devolvera 4321 con sus pasos.
     */

    public int reverso(int n, int resultado) {
        if (n == 0) {
            return resultado;
        } else {
            int digito = n % 10; 
            resultado = resultado * 10 + digito; 
            return reverso(n / 10, resultado); 
        }        
    }
}