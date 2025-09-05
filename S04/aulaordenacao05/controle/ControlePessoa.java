package controle;

import dominio.Pessoa;
import java.util.Scanner;

public class ControlePessoas {
    private Pessoa[] pessoas; // Array que vai guardar as pessoas
    private Scanner scanner;

    public ControlePessoas() {
        // Inicializa o array com espaço para 5 pessoas
        pessoas = new Pessoa[5];
        scanner = new Scanner(System.in);
    }

    public void cadastrarPessoas() {
        System.out.println("Cadastro de 5 pessoas:");
        
        // Lê os dados de cada pessoa e salva no array
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("\nPessoa " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            
            scanner.nextLine(); // consome o "enter" que sobra depois do nextDouble()
            
            // Cria uma nova pessoa com os dados informados
            pessoas[i] = new Pessoa(nome, idade, altura);
        }
    }

    public void exibirMenu() {
        System.out.println("\nEscolha o tipo de ordenação:");
        System.out.println("1 - Ordem alfabética (nome)");
        System.out.println("2 - Ordem crescente de idade");
        System.out.println("3 - Ordem crescente de altura");
        System.out.print("Opção: ");
        
        int opcao = scanner.nextInt();

        // Escolhe qual tipo de ordenação vai ser feito
        switch (opcao) {
            case 1:
                ordenarPorNome();
                break;
            case 2:
                ordenarPorIdade();
                break;
            case 3:
                ordenarPo
