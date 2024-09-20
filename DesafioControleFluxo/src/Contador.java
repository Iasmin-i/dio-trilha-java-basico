import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parametroUm, parametroDois;

        System.out.println("Digite o primeiro parâmetro: ");
        parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int resultado = parametroDois - parametroUm;
            for (int i = 1; i <= resultado; i++) {
                System.out.println("Imprimindo o número: " + i);
            }
        }
    }
}