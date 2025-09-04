package controle;
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        System.out.println("Digite 10 números inteiros:");
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        // Agora vamos usar o Bubble Sort pra ordenar os números em ordem crescente
        // Esse primeiro "for" controla quantas vezes vamos passar pelo array
        for (int i = 0; i < numeros.length - 1; i++) {
            
            // Esse segundo "for" compara os números de dois em dois
            // A cada passada, o maior número vai "subindo" pro final do array
            for (int j = 0; j < numeros.length - i - 1; j++) {
                
                // Se o número atual for maior que o próximo, a gente troca eles de lugar
                if (numeros[j] > numeros[j + 1]) {
                    
                    // Fazendo a troca usando uma variável temporária
                    int temp = numeros[j];       // Guarda o número atual
                    numeros[j] = numeros[j + 1]; // Coloca o próximo número na posição atual
                    numeros[j + 1] = temp;       // Coloca o número guardado na posição do próximo
                }
            }
        }
        // Nesse ponto, os números já estão em ordem crescente
        
        System.out.println("Números em ordem crescente:");
        
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        
        scanner.close();
    }
}
