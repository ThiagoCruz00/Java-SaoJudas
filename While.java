package pkgwhile;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        int multiplicando = 0, produto = 0, multiplicador = 0;
        while(multiplicando < 10){
            System.out.println("Introduza um número: ");
            multiplicando = new Scanner(System.in).nextInt();
            System.out.println("Tabuada do: " + multiplicando);
            multiplicador = 0;
            while(multiplicador < 10){
                multiplicador = multiplicador + 1;
                produto = multiplicando * multiplicador;
                System.out.println(multiplicando + "X" + multiplicador + "="+ produto);
            }
        }
        System.out.println("*****PROGRAMA ENCERRADO*****");
    }
    
}
