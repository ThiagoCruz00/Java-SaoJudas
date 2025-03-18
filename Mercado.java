package mercado;

import java.util.Scanner;
import java.util.HashMap;

public class Mercado {
    public static void main(String args[]) {
        HashMap<String, Integer> carrinho = new HashMap<>();
        HashMap<String, Double> precos = new HashMap<>();

        precos.put("Leite", 5.00);
        precos.put("Fini", 13.00);
        precos.put("Ovo", 15.00);
        precos.put("Mortadela", 20.00);
        precos.put("Maçã", 2.00);
        precos.put("Banana", 10.00);
        precos.put("Laranja", 18.00);
        precos.put("Bergamota", 30.00);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bem-Vindo ao Mercado");
            System.out.println("----------------");
            System.out.println("Escolha uma Opção:");
            System.out.println("1. Comprar");
            System.out.println("2. Ver carrinho");
            System.out.println("3. Tirar item do Carrinho");
            System.out.println("4. Pagar e ir Embora");
            System.out.println("----------------");
            int mercadinho = scanner.nextInt();
            scanner.nextLine();

            if (mercadinho == 1) {
                System.out.println("Qual setor você quer passar?");

                while (true) {
                    System.out.println("1. Hortifruti");
                    System.out.println("2. Diversos");
                    System.out.println("3. Voltar");
                    System.out.println("----------------");
                    int setor = scanner.nextInt();
                    scanner.nextLine();

                    if (setor == 1) {
                        int produtoEscolhido;
                        do {
                            System.out.println("O que você quer adicionar ao seu carrinho:");
                            System.out.println("1. Maçã - R$2,00");
                            System.out.println("2. Banana - R$10,00");
                            System.out.println("3. Laranja - R$18,00");
                            System.out.println("4. Bergamota - R$30,00");
                            System.out.println("5. Voltar");
                            System.out.println("----------------");
                            produtoEscolhido = scanner.nextInt();
                            scanner.nextLine();

                            String produto = "";
                            switch (produtoEscolhido) {
                                case 1: produto = "Maçã"; break;
                                case 2: produto = "Banana"; break;
                                case 3: produto = "Laranja"; break;
                                case 4: produto = "Bergamota"; break;
                                case 5: System.out.println("Voltando..."); break;
                                default: System.out.println("Opção Inválida...");
                            }

                            if (produtoEscolhido != 5) {
                                System.out.println("Quantas unidades deseja adicionar?");
                                int quantidade = scanner.nextInt();
                                scanner.nextLine();
                                carrinho.put(produto, carrinho.getOrDefault(produto, 0) + quantidade);
                                System.out.println(quantidade + " x " + produto + " foi adicionado ao carrinho! =)");
                            }
                        } while (produtoEscolhido != 5);
                    } else if (setor == 2) {
                        int produtoEscolhido;
                        do {
                            System.out.println("O que você quer adicionar ao seu carrinho:");
                            System.out.println("1. Leite - R$5,00");
                            System.out.println("2. Fini - R$13,00");
                            System.out.println("3. Ovo - R$15,00");
                            System.out.println("4. Mortadela - R$20,00");
                            System.out.println("5. Voltar");
                            System.out.println("----------------");
                            produtoEscolhido = scanner.nextInt();
                            scanner.nextLine();

                            String produto = "";
                            switch (produtoEscolhido) {
                                case 1: produto = "Leite"; break;
                                case 2: produto = "Fini"; break;
                                case 3: produto = "Ovo"; break;
                                case 4: produto = "Mortadela"; break;
                                case 5: System.out.println("Voltando..."); break;
                                default: System.out.println("Opção Inválida...");
                            }

                            if (produtoEscolhido != 5) {
                                System.out.println("Quantas unidades deseja adicionar?");
                                int quantidade = scanner.nextInt();
                                scanner.nextLine();
                                carrinho.put(produto, carrinho.getOrDefault(produto, 0) + quantidade);
                                System.out.println(quantidade + " x " + produto + " foi adicionado ao carrinho! =)");
                            }
                        } while (produtoEscolhido != 5);
                    } else if (setor == 3) {
                        break;
                    } else {
                        System.out.println("Opção Inválida..");
                    }
                }
            } else if (mercadinho == 2) {
                System.out.println("Seu carrinho: ");
                double total = 0;

                if (carrinho.isEmpty()) {
                    System.out.println("Carrinho Vazio!");
                } else {
                    for (String item : carrinho.keySet()) {
                        int quantidade = carrinho.get(item);
                        double preco = precos.get(item) * quantidade;
                        System.out.println(quantidade + " x " + item + " - R$" + preco);
                        total += preco;
                    }
                    System.out.println("Total R$" + total);
                }
            } else if (mercadinho == 3) {
                System.out.println("Qual item deseja remover?");
                String itemRemover = scanner.nextLine();

                if (carrinho.containsKey(itemRemover)) {
                    carrinho.remove(itemRemover);
                    System.out.println(itemRemover + " foi removido do carrinho!");
                } else {
                    System.out.println("Este item não está no carrinho!");
                }
            } else if (mercadinho == 4) {
                System.out.println("\nFinalizando compra...");
                System.out.println("\033[0;37m------------------------------"); 
                System.out.println("\033[1;34m| Produto        | Quantidade | Preço   |"); 
                System.out.println("\033[0;37m------------------------------"); 
                
                double total = 0;
                for (String item : carrinho.keySet()) {
                    int quantidade = carrinho.get(item);
                    double preco = precos.get(item) * quantidade;
                    System.out.printf("| %-14s | %-10d | R$%-6.2f |\n", item, quantidade, preco); 
                    total += preco;
                }

                System.out.println("\033[0;37m------------------------------"); 
                System.out.printf("| Total         |            | R$%-6.2f |\n", total); 
                System.out.println("\033[31m------------------------------");  
                System.out.println("\033[31mObrigado por comprar! Volte sempre."); 
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
