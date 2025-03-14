package estacaodoano;

import java.util.Scanner;

public class EstacaoDoAno {

    public static void main(String[] args) {
        // Declarando a vari�vel m�s
        int mes;

        // Solicita ao usu�rio o m�s (de 1 a 12)
        System.out.println("Introduza o m�s (1 a 12): ");
        mes = new Scanner(System.in).nextInt();
        
        // Vari�vel para armazenar a esta��o
        String estacao;

        // Condicional para determinar a esta��o do ano
        if (mes == 12 || mes == 1 || mes == 2) {
            estacao = "Inverno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacao = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacao = "Ver�o";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacao = "Outono";
        } else {
            estacao = "M�s desconhecido";  // Caso o m�s n�o seja v�lido (n�o esteja entre 1 e 12)
        }

        // Imprime a esta��o correspondente ao m�s
        System.out.println("O m�s " + mes + " est� no(a) " + estacao + ".");
    }
}
