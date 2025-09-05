package controle;

import java.util.Scanner;

public class OrdenaProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays para guardar os nomes e preços dos produtos
        String[] nomes = new String[10];
        double[] precos = new double[10];

        System.out.println("Digite o nome e preço de 10 produtos:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome do produto " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            
            System.out.print("Preço do produto " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
            
            scanner.nextLine(); // evita pular a leitura do próximo nome
        }

        // Bubble Sort para ordenar do mais caro para o mais barato
        // O "i" controla quantas vezes vamos passar pelo array inteiro
        for (int i = 0; i < precos.length - 1; i++) {
            
            // O "j" vai comparar os elementos um a um
            // Usamos "j + 1" porque sempre comparamos o elemento atual com o próximo
            // Ex: na primeira vez, compara índice 0 (j) com índice 1 (j+1),
            // depois índice 1 (j) com índice 2 (j+1) e assim por diante.
            for (int j = 0; j < precos.length - i - 1; j++) {
                
                // Se o preço atual for menor que o próximo, significa que estão fora de ordem
                // Então precisamos trocar eles de lugar
                if (precos[j] < precos[j + 1]) {
                    
                    // Troca só os preços primeiro
                    double tempPreco = precos[j];
                    precos[j] = precos[j + 1];
                    precos[j + 1] = tempPreco;

                    // Depois troca os nomes na mesma posição
                    // Assim o nome do produto continua correspondendo ao preço certo
                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;
                }
            }
            // A cada volta do "i", o maior preço já "sobe" para o final do array
            // Por isso no próximo ciclo do "i" a parte final já não precisa ser verificada
        }

        System.out.println("\nProdutos ordenados do mais caro para o mais barato:");
        for (int i = 0; i < 10; i++) {
            System.out.println(nomes[i] + " - R$ " + String.format("%.2f", precos[i]));
        }

        scanner.close();
    }
}
