package while2;

import java.util.Scanner;

public class While2 {

    public static void main(String[] args) {
        int multiplicando = 0, produto = 0, multiplicador = 0;
        do {
            System.out.println("Introduza um número: ");
            multiplicando = new Scanner(System.in).nextInt();
            System.out.println("Tabuada do: " + multiplicando);

            multiplicador = 0;  

            do {
                multiplicador = multiplicador + 1;
                produto = multiplicando * multiplicador;
                System.out.println(multiplicando + " X " + multiplicador + " = " + produto);
            } while (multiplicador < 10);  

        } while (multiplicando != 0);  

        System.out.println("*****PROGRAMA ENCERRADO*****");

    
}
