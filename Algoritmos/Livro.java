public class Livro {

    int codigo;
    String titulo;
    String autor;
    boolean disponivel; 

    public Livro(int codigo, String titulo, String autor){
        this.disponivel = true;
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public boolean isDisponivel(){
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
}
