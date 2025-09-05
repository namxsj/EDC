package dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    // Construtor: usado para criar uma nova pessoa já com os dados preenchidos
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    // toString: define como a pessoa será exibida quando a gente der um "System.out.println()"
    @Override
    public String toString() {
        // %.2f deixa a altura com 2 casas decimais
        return String.format("Nome: %s | Idade: %d | Altura: %.2f m", nome, idade, altura);
    }
}
