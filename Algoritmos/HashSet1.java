
import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {

        HashSet<String> alunos = new HashSet<>();
        alunos.add("Lucas");
        alunos.add("Rafael");
        alunos.add("Carla");
        alunos.add("Lucas");
        alunos.add("Lucas");
        alunos.add("Carla");

        for (String aluno : alunos){

            System.out.println(aluno);
        }

        System.out.println("Quantidade de alunos presentes: " + alunos.size());

    }
}
