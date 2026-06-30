// Classe responsável apenas pelos cálculos
public class Calculadora {

    // Método para realizar a soma
    public int somar(String[] numerosTexto) {

        // Variável que armazenará o resultado
        int resultado = 0;

        // Percorre todos os números informados
        for (int i = 0; i < numerosTexto.length; i++) {

            // Converte o texto para inteiro
            int numero = Integer.parseInt(numerosTexto[i].trim());

            // Soma o número ao resultado
            resultado += numero;
        }

        // Retorna o resultado da soma
        return resultado;
    }

    // Método para realizar a subtração
    public int subtrair(String[] numerosTexto) {

        // O primeiro número será o valor inicial
        int resultado = Integer.parseInt(numerosTexto[0].trim());

        // Começa no segundo número
        for (int i = 1; i < numerosTexto.length; i++) {

            int numero = Integer.parseInt(numerosTexto[i].trim());

            resultado -= numero;
        }

        // Retorna o resultado da subtração
        return resultado;
    }

}