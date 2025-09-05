import controle.ControlePessoas;

public class Principal {
    public static void main(String[] args) {
        // Cria um objeto do tipo ControlePessoas, que vai gerenciar o cadastro e ordenação
        ControlePessoas controle = new ControlePessoas();

        // 1º passo: cadastrar as 5 pessoas (nome, idade e altura)
        controle.cadastrarPessoas();

        // 2º passo: exibir o menu para o usuário escolher como quer ordenar os dados
        controle.exibirMenu();
    }
}
