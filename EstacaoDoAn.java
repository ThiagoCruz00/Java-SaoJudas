package estacaodoano;

import java.util.Scanner;

public class EstacaoDoAno {

    public static void main(String[] args) {
        // Declarando a variável mês
        int mes;

        // Solicita ao usuário o mês (de 1 a 12)
        System.out.println("Introduza o mês (1 a 12): ");
        mes = new Scanner(System.in).nextInt();
        
        // Variável para armazenar a estação
        String estacao;

        // Condicional para determinar a estação do ano
        if (mes == 12 || mes == 1 || mes == 2) {
            estacao = "Inverno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacao = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacao = "Verão";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacao = "Outono";
        } else {
            estacao = "Mês desconhecido";  // Caso o mês não seja válido (não esteja entre 1 e 12)
        }

        // Imprime a estação correspondente ao mês
        System.out.println("O mês " + mes + " está no(a) " + estacao + ".");
    }
}
