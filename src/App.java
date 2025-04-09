public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---- Programa Funcionando ----");

        int n = 5;
        int resultado = factorial(n);

        System.out.println("Resultado: " + resultado);
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
