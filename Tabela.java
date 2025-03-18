package tabela;

public class Tabela {
    
    // Códigos ANSI para cores de texto
    public static final String RESET = "\u001B[0m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARELO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CIANO = "\u001B[36m";
    
    // Códigos ANSI para cores de fundo
    public static final String FONDO_VERMELHO = "\u001B[41m";
    public static final String FONDO_VERDE = "\u001B[42m";
    public static final String FONDO_AMARELO = "\u001B[43m";
    public static final String FONDO_AZUL = "\u001B[44m";
    public static final String FONDO_MAGENTA = "\u001B[45m";
    public static final String FONDO_CIANO = "\u001B[46m";
    public static final String FONDO_BRANCO = "\u001B[47m";

    public static void main(String[] args) {
        // Cabeçalho da tabela
        String[] cabecalho = {"ID", "Nome", "Idade", "Cargo"};
        
        // Dados da tabela
        String[][] dados = {
            {"1", "Thiago", "17", "Aprendiz"},
            {"2", "Maria", "25", "Analista"},
            {"3", "João", "30", "Gerente"}
        };
        
        // Imprime o cabeçalho com cor e fundo
        System.out.println(FONDO_CIANO + CIANO + String.format("%-10s%-10s%-10s%-10s", cabecalho[0], cabecalho[1], cabecalho[2], cabecalho[3]) + RESET);
        
        // Imprime os dados com cores alternadas para cada linha e fundo colorido
        for (int i = 0; i < dados.length; i++) {
            String corLinha = (i % 2 == 0) ? FONDO_VERDE + VERDE : FONDO_AMARELO + AMARELO;  // Alterna cores entre as linhas
            System.out.println(corLinha + String.format("%-10s%-10s%-10s%-10s", dados[i][0], dados[i][1], dados[i][2], dados[i][3]) + RESET);
        }
    }
}
