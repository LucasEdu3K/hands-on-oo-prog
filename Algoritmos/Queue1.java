
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Luc");
        fila.add("Ana");
        fila.add("Carlo");
        fila.add("Luisa");
        fila.add("Breno");

        System.out.println("Proximo a ser atendido: " + fila.peek());
        System.out.println("Fez de: " + fila.poll());
        System.out.println("Fez de: " + fila.poll());

        for (String pendentes : fila){

            System.out.println("Pendente para atendimento: " + pendentes);

        }

    }
}
