public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---- Programa Funcionando ----");

        int n = 5;
        int resultado = factorial(n);

        System.out.println("Resultado: " + resultado);

    EjerciciosRecursivos er = new EjerciciosRecursivos();
    int fibonacciResult = EjerciciosRecursivos.fibonacci(5); 
    System.out.println("Fibonacci de 5: " + fibonacciResult);
    int sumaResult = er.sumaConsecitivos(5);
    System.out.println("Suma de 1 a 5: " + sumaResult);
    }

    public static int factorial(int n) {
        if (n == 0) {
            System.out.println("Alcanse el caso base ");
            return 1;
        }

        int resultado = n * factorial(n - 1);
        System.out.println("Calculando factorial de: " + n + " * factorial(" + (n - 1) + " = " + resultado);

        return resultado;
    }



}

