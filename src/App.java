public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---- Programa Funcionando ----");

        int n = 5;
        int base = 2;
        int exponente = 3;
        int digitos = 7921;
        int resultado = factorial(n);
        int numero = 9876;

        System.out.println("Resultado: " + resultado);

    EjerciciosRecursivos er = new EjerciciosRecursivos();
    int fibonacciResult = EjerciciosRecursivos.fibonacci(5); 
    System.out.println("Fibonacci de 5: " + fibonacciResult);
    int sumaResult = er.sumaConsecitivos(5);
    System.out.println("Suma de 1 a 5: " + sumaResult);

    System.out.println(" ");
    EjerciciosRecursivos poten = new EjerciciosRecursivos();
    System.out.println("/// Potencia ///");
    System.out.println(base + "^" + exponente + " = " + poten.getPotencia(base, exponente));
    
    System.out.println("");
    EjerciciosRecursivos sum = new EjerciciosRecursivos();

    System.out.println("/// Ejercicio 3 ///");
    System.out.println("Suma de digitos de " + digitos + ": "  + sum.sumaDigitos(digitos));

    EjerciciosRecursivos imprimir = new EjerciciosRecursivos();
    System.out.println(" ");
    System.out.println("/// Ejercicio Descendente ///");
    System.out.print("Imprimir descendente: ");
    imprimir.imprimirDescendente(5);
    System.out.println(" ");

    EjerciciosRecursivos reverso = new EjerciciosRecursivos();
    int resultadoReverso = reverso.reverso(numero, 0);
    System.out.println(" ");
    System.out.println("/// Ejericio Reverso ///");
    System.out.println("El reverso de " + numero + " es: " + resultadoReverso);
    }

    public static int factorial(int n) {
        if (n == 0) {
            System.out.println("Alcanse el caso base ");
            return 1;
        }

        int resultado = n * factorial(n - 1);
        System.out.println("Calculando factorial de: " + n + " * factorial " + (n - 1) + " = " + resultado);

        return resultado;
    }
}