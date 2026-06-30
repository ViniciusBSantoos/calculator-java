import java.util.Scanner;

// Classe principal do programa
public class Main {

    // Método principal
    public static void main(String[] args) {

        // Scanner é utilizado para ler o que o usuário digita
        Scanner scanner = new Scanner(System.in);

        // -----------------------------
        // Entrada dos números
        // -----------------------------

        System.out.println("===== CALCULADORA =====");
        System.out.println();

        System.out.println("Digite os números separados por vírgula:");
        System.out.println("Exemplo: 10,20,30");

        // Lê toda a linha digitada
        String entrada = scanner.nextLine();

        // Divide a String utilizando a vírgula
        String[] numerosTexto = entrada.split(",");

        // -----------------------------
        // Escolha da operação
        // -----------------------------

        System.out.println();
        System.out.println("Escolha a operação:");

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");

        int opcao = scanner.nextInt();

        // Variável que guardará o resultado
        int resultado = 0;

        // -----------------------------
        // Soma
        // -----------------------------

        if(opcao == 1){

            // Percorre todos os números digitados
            for(int i = 0; i < numerosTexto.length; i++){

                // Converte String para inteiro
                int numero = Integer.parseInt(numerosTexto[i]);

                // Soma
                resultado += numero;

            }

            System.out.println();
            System.out.println("Resultado da soma = " + resultado);

        }

        // -----------------------------
        // Subtração
        // -----------------------------

        else if(opcao == 2){

            // O primeiro número será o valor inicial
            resultado = Integer.parseInt(numerosTexto[0]);

            // Começa do segundo número
            for(int i = 1; i < numerosTexto.length; i++){

                int numero = Integer.parseInt(numerosTexto[i]);

                resultado -= numero;

            }

            System.out.println();
            System.out.println("Resultado da subtração = " + resultado);

        }

        else{

            System.out.println("Operação inválida.");

        }

        scanner.close();

    }

}