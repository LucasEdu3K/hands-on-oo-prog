import java.util.ArrayList;
import java.util.Scanner;
public class SistemaBiblioteca {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<Livro> listaLivros = new ArrayList<>();

        int op = 0;

         do {
            System.out.println("""
                               ESCOLHA UMA OPÇÃO:
                               [1] Cadastrar
                               [2] Listar
                               [3] Emprestar 
                               [4] Devolver 
                               [0] Sair
                               """);
            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("Informe o código do livro: ");
                    int codigoLivro = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Informe o titulo do livro: ");
                    String tituloLivro = sc.nextLine();

                    System.out.println("Informe o autor do livro: ");
                    String autorLivro = sc.nextLine();

                    Livro novoLivro = new Livro(codigoLivro, tituloLivro, autorLivro);

                    listaLivros.add(novoLivro);

                    System.out.println("Livro cadastrado com sucesso!");

                break;

                case 2:

                if(listaLivros.isEmpty()){
                    System.out.println("Nenhum livro cadastrado!");
                }else {
                    System.out.println("--- LISTA DE LIVROS CADASTRADOS ---");
                    for (Livro livro : listaLivros) {
                        System.out.println("Código: " + livro.codigo +
                                          " | Titulo: " + livro.getTitulo() +
                                          " | Autor: " + livro.autor);

                    if (livro.isDisponivel()){
                    System.out.println(" | Status: DISPONÍVEL");
                    } else {
                        System.out.println(" | Status: EMPRESTADO");
                    
                    }
                  }
                }

                break;

                case 3: 
                System.out.println("Informe o codigo do livro para emprestimo: ");
                int codEmpre = sc.nextInt();

                boolean encontrado = false;

                for (Livro livro : listaLivros){
                    if(livro.codigo == codEmpre){
                        encontrado = true; 

                        if (livro.isDisponivel()){
                            livro.setDisponivel(false);
                            System.out.println("Emprestimo realizado com sucesso!");

                        } else {
                            System.out.println("Este livro já está emprestado! ");

                        }
                        break;
                    }
                }

                  if (!encontrado) {
                    System.out.println("Livro não encontrado com esse código.");
                   }

                break;

                case 4:
                    
                System.out.print("Digite o código do livro para devolução: ");
                int codDevolucao = sc.nextInt();
                boolean achou = false;

                for (Livro livro : listaLivros) {
                if (livro.codigo == codDevolucao) {
                achou = true;

      
                livro.setDisponivel(true);
                System.out.println("Livro devolvido com sucesso!");
                break;
                }
                }
                if (!achou) {
                System.out.println("Livro não encontrado.");
                }      

                break; 

                case 0: 

                System.out.println("Saindo do sistema");

                break; 

                default:
                    System.out.println("Opção invalida! Favor informe uma opção válida.");
            }

            
        } while (op != 0);


    }
}
