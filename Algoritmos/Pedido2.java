public class Pedido2 {
    // Atributos privados para garantir a segurança dos dados
    private int numero;
    private String nomeCliente;
    private String itemPedido;
    private double valor;
    private String status;

    // Construtor que recebe os dados básicos do pedido
    public Pedido2(int numero, String nomeCliente, String itemPedido, double valor) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.itemPedido = itemPedido;
        this.valor = valor;
        this.status = "PENDENTE"; // Todo pedido novo nasce como PENDENTE
    }

    // Métodos Getters para permitir a leitura dos dados em outras classes
    public int getNumero() {
        return this.numero;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public String getItemPedido() {
        return this.itemPedido;
    }

    public double getValor() {
        return this.valor;
    }

    public String getStatus() {
        return this.status;
    }

    // Método Setter para permitir a alteração do status do pedido
    public void setStatus(String status) {
        this.status = status;
    }
}

