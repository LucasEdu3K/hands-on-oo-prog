import java.util.ArrayList;
import java.util.Scanner;

public class SistemaLanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pedido2> listaPedidos = new ArrayList<>();
        int op = -1;

        do {
            System.out.println("""
                               
                               === LANCHONETE - MENU ===
                               [1] Cadastrar pedido
                               [2] Listar pedidos
                               [3] Atualizar status de um pedido
                               [4] Buscar pedido pelo número
                               [5] Mostrar valor total dos pedidos
                               [0] Sair
                               Opcão:""");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Informe o número do pedido: ");
                    int num = sc.nextInt();
                    sc.nextLine(); // Limpa o buffer do teclado

                    System.out.print("Nome do cliente: ");
                    String cliente = sc.nextLine();

                    System.out.print("Item pedido: ");
                    String item = sc.nextLine();

                    System.out.print("Valor do item: R$ ");
                    double valor = sc.nextDouble();

                    // Cria o pedido e adiciona na lista
                    Pedido2 novoPedido = new Pedido2(num, cliente, item, valor);
                    listaPedidos.add(novoPedido);
                    System.out.println("Pedido cadastrado com sucesso!");
                    break;

                case 2:
                    if (listaPedidos.isEmpty()) {
                        System.out.println("Nenhum pedido cadastrado!");
                    } else {
                        System.out.println("\n--- LISTA DE PEDIDOS ---");
                        for (Pedido2 p : listaPedidos) {
                            System.out.println("Nº: " + p.getNumero() + 
                                               " | Cliente: " + p.getNomeCliente() + 
                                               " | Item: " + p.getItemPedido() + 
                                               " | Valor: R$ " + p.getValor() + 
                                               " | Status: " + p.getStatus());
                        }
                    }
                    break;

                case 3:
                    if (listaPedidos.isEmpty()) {
                        System.out.println("Não há pedidos cadastrados para atualizar.");
                        break;
                    }
                    System.out.print("Digite o número do pedido que deseja atualizar: ");
                    int numAtualizar = sc.nextInt();
                    boolean achouAtualizar = false;

                    for (Pedido2 p : listaPedidos) {
                        if (p.getNumero() == numAtualizar) {
                            achouAtualizar = true;
                            System.out.println("""
                                               Escolha o novo status:
                                               [1] PREPARANDO
                                               [2] FINALIZADO""");
                            int escolhaStatus = sc.nextInt();
                            
                            if (escolhaStatus == 1) {
                                p.setStatus("PREPARANDO");
                                System.out.println("Status atualizado para PREPARANDO!");
                            } else if (escolhaStatus == 2) {
                                p.setStatus("FINALIZADO");
                                System.out.println("Status atualizado para FINALIZADO!");
                            } else {
                                System.out.println("Opção de status inválida.");
                            }
                            break; // Encontrou o pedido, pode parar o laço
                        }
                    }
                    if (!achouAtualizar) {
                        System.out.println("Pedido número " + numAtualizar + " não encontrado.");
                    }
                    break;

                case 4:
                    if (listaPedidos.isEmpty()) {
                        System.out.println("Não há pedidos na lista.");
                        break;
                    }
                    System.out.print("Digite o número do pedido que busca: ");
                    int numBusca = sc.nextInt();
                    boolean achouBusca = false;

                    for (Pedido2 p : listaPedidos) {
                        if (p.getNumero() == numBusca) {
                            achouBusca = true;
                            System.out.println("\n--- PEDIDO ENCONTRADO ---");
                            System.out.println("Número: " + p.getNumero());
                            System.out.println("Cliente: " + p.getNomeCliente());
                            System.out.println("Item: " + p.getItemPedido());
                            System.out.println("Valor: R$ " + p.getValor());
                            System.out.println("Status: " + p.getStatus());
                            break;
                        }
                    }
                    if (!achouBusca) {
                        System.out.println("Pedido não encontrado.");
                    }
                    break;

                case 5:
                    double faturamentoTotal = 0.0;
                    for (Pedido2 p : listaPedidos) {
                        faturamentoTotal += p.getValor(); // Soma o valor de cada pedido
                    }
                    System.out.println("Valor total de todos os pedidos: R$ " + faturamentoTotal);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema da lanchonete. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 0);

        sc.close(); // Fecha o scanner de forma segura
    }
}
