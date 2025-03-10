package media;

import java.util.Scanner;

public class Media {
    
    public static void main(String[] args) {
        double Prova1, Prova2, Prova3;
        System.out.println("Qual foi sua primeira nota em matemática:");
        Prova1 = new Scanner(System.in).nextDouble();
        System.out.println("Qual foi sua segunda nota em matemática:");
        Prova2 = new Scanner(System.in).nextDouble();
        System.out.println("Qual foi sua terceira nota em matemática:");
        Prova3 = new Scanner(System.in).nextDouble();

        double media = (Prova1 + Prova2 + Prova3) / 3;

        double ProvaPt, ProvaPt2, ProvaPt3;
        System.out.println("Qual foi sua primeira nota em pt:");
        ProvaPt = new Scanner(System.in).nextDouble();
        System.out.println("Qual foi sua segunda nota em pt:");
        ProvaPt2 = new Scanner(System.in).nextDouble();
        System.out.println("Qual foi sua terceira nota em pt:");
        ProvaPt3 = new Scanner(System.in).nextDouble();
        
        double mediapt = (ProvaPt + ProvaPt2 + ProvaPt3) / 3;
        
        if (mediapt >= 7) {
            System.out.println("Aprovado em Português " + mediapt);
        } else if (mediapt >=5) {
            System.out.println("Recuperação em Português " +mediapt);
        }else{
            System.out.println("Reprovado em Português " + mediapt);
        }
        
        if (media >= 7) {
            System.out.println("Aprovado em matemática " + media);
        } else if (media >= 5) {
        System.out.println("recuperação em matemática " + media);
        }else {
            System.out.println("Reprovado em matemática " + media);
        }
    }
    
}
