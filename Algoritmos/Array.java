
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        
        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Maçã");
        produtos.add("Banana");
        produtos.add("Biscoito");
        produtos.add("Suco de uva");
        produtos.add("Oleo");

       for (String produto : produtos){
        System.out.println("Produto: " + produto);
       }

        System.out.println("Total de produtos: " + produtos.size());

    }
    
}
