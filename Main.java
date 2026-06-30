import java.util.Scanner;

// Classe principal
public class Main {

    public static void main(String[] args) {

        // Scanner utilizado para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Cria um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora();

        System.out.println("==================================");
        System.out.println("      CALCULADORA JAVA");
        System.out.println("==================================");

        // Solicita os números
        System.out.println("\nDigite os números separados por vírgula:");

        String entrada = scanner.nextLine();

        // Divide a String usando a vírgula
        String[] numeros = entrada.split(",");

        // Menu
        System.out.println("\nEscolha a operação:");

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");

        System.out.print("Opção: ");

        int opcao = scanner.nextInt();

        System.out.println();

        // Verifica a operação escolhida
        switch (opcao) {

            case 1:
                System.out.println("Resultado da soma: "
                        + calculadora.somar(numeros));
                break;

            case 2:
                System.out.println("Resultado da subtração: "
                        + calculadora.subtrair(numeros));
                break;

            default:
                System.out.println("Opção inválida.");

        }

        scanner.close();

    }

}